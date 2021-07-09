package com.vmware.cabservice.service;

import com.vmware.cabservice.model.Cab;
import com.vmware.cabservice.model.Driver;
import com.vmware.cabservice.repository.CabRepository;
import com.vmware.cabservice.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CabServiceImpl implements CabService{

    @Autowired
    CabRepository cabRepository;

    @Autowired
    DriverRepository driverRepository;

    @Override
    public List<Cab> getAllCabs() {
        List<Cab> cabs = new ArrayList<>();
        Iterator<Cab> itr = cabRepository.findAll().iterator();
        while (itr.hasNext()){
            cabs.add(itr.next());
        }
        return cabs;
    }

    @Override
    public Cab createCab(Cab cab) {
        return cabRepository.save(cab);
    }

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Cab bookCab(String location) {
        //first get available cabs
        List<Cab> availablecabs = new ArrayList<>();
        Iterator<Cab> itr = cabRepository.findAll().iterator();
        Cab cab = null;
        while (itr.hasNext()) {
            cab = itr.next();
            if (!cab.isBooked()){
                return cab;
            }else {
                return null;
            }
        }
        return cab;
    }

}
