package com.RestControllerServerSide;

import com.RestServiceServerSide.OfficeServiceRestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfficeControllerRestServer {

    @Autowired
    private OfficeServiceRestServer officeServiceRestServer;

    @RequestMapping("/convertAllObjectToJson")
    public String convertAllObjectToJson(){
        return officeServiceRestServer.convertAllObjectToJson();
    }

}
