package com.validation;

import com.dto.OfficeDto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class OfficeValidation implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return OfficeDto.class.equals(aClass);
    }

    @Override
    public void validate(Object officeDto, Errors bindingResult) {


        String workerName = ((OfficeDto) officeDto).getWorkerName();

        if (workerName.isEmpty()) {
            bindingResult.rejectValue("workerName", "officeDto1.getWorkerName()", "* WorkerName Should not be Empty");
        }

        String workerDesignation = ((OfficeDto) officeDto).getWorkerDesignation();

        if (workerDesignation.isEmpty()) {
            bindingResult.rejectValue("workerDesignation", "officeDto.getWorkerDesignation", "*WorkerDesignation Should not be Empty");
        }


        int workerSalary = ((OfficeDto) officeDto).getWorkerID();

        if (workerSalary == 0) {
            bindingResult.rejectValue("workerSalary", "officeDto.getWorkerSalary", "*WorkerSalary Should Not be Empty");
        }


    }
}