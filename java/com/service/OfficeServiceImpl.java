package com.service;

import com.dao.OfficeDao;
import com.dto.OfficeDto;

import java.util.Collection;

public class OfficeServiceImpl implements OfficeService {


    private OfficeDao officeDao;

    @Override
    public Collection<OfficeDto> getAllOffice() {
        return getOfficeDao().getAllOffice();
    }

    @Override
    public int saveAdd(OfficeDto officeDto) {
        return getOfficeDao().saveAdd(officeDto);
    }

    @Override
    public OfficeDto getByID(int workerID) {
        return getOfficeDao().getByID(workerID);
    }

    @Override
    public int
    deleteById(int workerID) {
        return getOfficeDao().deleteById(workerID);
    }

    @Override
    public int saveEdit(OfficeDto ediByID) {
        return getOfficeDao().saveEdit(ediByID);
    }


    public OfficeDao getOfficeDao() {
        return officeDao;
    }

    public void setOfficeDao(OfficeDao officeDao) {
        this.officeDao = officeDao;
    }


}
