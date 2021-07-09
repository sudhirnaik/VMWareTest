package com.vmware.cabservice.controller;

import com.vmware.cabservice.model.Cab;
import com.vmware.cabservice.model.Driver;
import com.vmware.cabservice.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CabController {

    @Autowired
    CabService cabService;

    @PostMapping(value = "/cab")
    public Cab addCab (@RequestBody Cab cab){
        return cabService.createCab(cab);
    }

    @GetMapping(value = "/cabs")
    public List<Cab> getCabs (){
        return cabService.getAllCabs();
    }

    @PostMapping(value = "/driver")
    public Driver addDriver (@RequestBody Driver driver){
        return cabService.addDriver(driver);
    }

    @PostMapping(value = "/bookcab")
    public Cab addCab (@RequestParam String location){
        return cabService.bookCab(location);
    }

}
