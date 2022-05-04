package com.sunglowsys.service;

import com.sunglowsys.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    @Qualifier("bikeBean")
    private VehicleRepository vehicleRepository;

    public  void  VehicleRepository(){
        vehicleRepository.start();
        vehicleRepository.stop();
    }
}
