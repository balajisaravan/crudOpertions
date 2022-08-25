package com.dao;

import com.dto.OfficeDto;

import java.util.Collection;

public interface OfficeDao {
    Collection<OfficeDto> getAllOffice();

    int saveAdd(OfficeDto officeDto);

    OfficeDto getByID(int workerID);

    int deleteById(int workerID);

    int saveEdit(OfficeDto ediByID);
}
