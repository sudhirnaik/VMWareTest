package com.vmware.cabservice.service;

import com.vmware.cabservice.model.Cab;
import com.vmware.cabservice.model.Driver;

import java.util.List;

public interface CabService {
    List<Cab> getAllCabs();

    Cab createCab (Cab cab);

    Driver addDriver(Driver driver);

    Cab bookCab(String location);
}
