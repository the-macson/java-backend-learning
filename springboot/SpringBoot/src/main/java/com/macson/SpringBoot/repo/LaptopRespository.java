package com.macson.SpringBoot.repo;

import com.macson.SpringBoot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRespository {
    public void save(Laptop laptop) {
        System.out.println("save in Database");
    }
}
