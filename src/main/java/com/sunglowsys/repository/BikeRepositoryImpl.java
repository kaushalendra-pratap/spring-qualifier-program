package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class BikeRepositoryImpl implements VehicleRepository{

    @Override
    public void start() {
        System.out.println("bike is started");

    }

    @Override
    public void stop() {
        System.out.println("bike is stop");

    }
}
