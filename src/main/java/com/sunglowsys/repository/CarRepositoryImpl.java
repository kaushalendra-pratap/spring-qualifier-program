package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class CarRepositoryImpl implements VehicleRepository {
    @Override
    public void start() {
        System.out.println("car is running");

    }

    @Override
    public void stop() {
        System.out.println("car is s1top");

    }
}
