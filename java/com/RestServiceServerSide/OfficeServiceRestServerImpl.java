package com.RestServiceServerSide;

import com.dao.OfficeDao;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class OfficeServiceRestServerImpl implements OfficeServiceRestServer {

    private OfficeDao officeDao;
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertAllObjectToJson() {
        try {
            return objectMapper.writeValueAsString(getOfficeDao().getAllOffice());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    public OfficeDao getOfficeDao() {
        return officeDao;
    }

    public void setOfficeDao(OfficeDao officeDao) {
        this.officeDao = officeDao;
    }
}


