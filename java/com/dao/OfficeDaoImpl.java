package com.dao;

import com.dto.OfficeDto;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class OfficeDaoImpl implements OfficeDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Collection<OfficeDto> getAllOffice() {
        return getJdbcTemplate().query("select * from officeworker", new RowMapper<OfficeDto>() {
            @Override
            public OfficeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
                OfficeDto officeDto = new OfficeDto();
                officeDto.setWorkerID(rs.getInt(1));
                officeDto.setWorkerName(rs.getString(2));
                officeDto.setWorkerDesignation(rs.getString(3));
                officeDto.setWorkerSalary(rs.getInt(4));

                return officeDto;
            }
        });
}

    @Override
    public int saveAdd(OfficeDto officeDto) {
        String sql = "insert into officeworker(workerID,workerName,workerDesignation,workerSalary) values ("+officeDto.getWorkerID()+",'"+officeDto.getWorkerName()+"','"+officeDto.getWorkerDesignation()+"',"+officeDto.getWorkerSalary()+")";

        return getJdbcTemplate().update(sql);
    }

    @Override
    public OfficeDto getByID(int workerID) {
        String sql = "select * from officeworker where workerID=?";

        return getJdbcTemplate().queryForObject(sql,new Object[]{workerID},new BeanPropertyRowMapper<OfficeDto>(OfficeDto.class));
    }

    @Override
    public int deleteById(int workerID) {
        String sql = "delete from officeworker where workerID="+workerID+"";

        return getJdbcTemplate().update(sql);
    }

    @Override
    public int saveEdit(OfficeDto ediByID) {
        String sql = "update officeworker set workerName='"+ediByID.getWorkerName()+"',workerDesignation='"+ediByID.getWorkerDesignation()+"',workerSalary="+ediByID.getWorkerSalary()+" where workerID="+ediByID.getWorkerID()+"";
        return getJdbcTemplate().update(sql);
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Required
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
