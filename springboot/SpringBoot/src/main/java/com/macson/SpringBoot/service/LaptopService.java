package com.macson.SpringBoot.service;

import com.macson.SpringBoot.repo.LaptopRespository;
import com.macson.SpringBoot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRespository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
//        System.out.println("method called");
    }
}
