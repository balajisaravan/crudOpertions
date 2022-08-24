package com.controller;


import com.dto.OfficeDto;
import com.service.OfficeService;
import com.validation.OfficeValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@Controller
@RequestMapping("/office")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @Autowired
    private OfficeValidation officeValidation;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        Collection<OfficeDto> officeDtoCollection = officeService.getAllOffice();
        model.addAttribute("officeDtoData",officeDtoCollection);

        return "getAllOffciePage";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("officeDto",new OfficeDto());

        return "addOfficePage";
    }

    @RequestMapping(value = "/saveAdd",method = RequestMethod.POST)
    public String saveAdd(@Valid @ModelAttribute OfficeDto officeDto,BindingResult result) {
        officeValidation.validate(officeDto, result);

        if (result.hasErrors()) {
            System.out.println("your form has error");
            return "addOfficePage";
        } else {
            officeService.saveAdd(officeDto);
            return "redirect:/office/getAll";
        }
    }

    @RequestMapping("/getById/{workerID}")
    public String getById(@PathVariable int workerID,Model model){
        OfficeDto id = officeService.getByID(workerID);
        model.addAttribute("getByWorkerID",id);

        return "getByIdPage";
    }

    @RequestMapping("/deleteByID/{workerID}")
    public String deleteById(@PathVariable int workerID){
        officeService.deleteById(workerID);

        return "redirect:/office/getAll";
    }

    @RequestMapping("/edit/{workerID}")
    public String edit(@PathVariable int workerID, Model model){
        OfficeDto ediByID = officeService.getByID(workerID);
        model.addAttribute("ediByID",ediByID);

        return "editOfficePage";
    }

    @RequestMapping(value = "/saveEdit",method = RequestMethod.POST)
    public String editSave(@ModelAttribute OfficeDto ediByID){
        officeService.saveEdit(ediByID);

        return "redirect:/office/getAll";
    }


}
