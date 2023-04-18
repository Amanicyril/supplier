package com.amanicb.apps.rest.controller;

import com.amanicb.apps.rest.entity.supplier;
import com.amanicb.apps.rest.repository.supplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("API/supplier")
public class ApiControllers {

    @Autowired

    private supplierRepo SupplierRepository;

    @GetMapping
    public List<supplier>getAllSuppliers(){
        return SupplierRepository.findAll();

    }
    @PostMapping
    public supplier createsuppliers(@RequestBody supplier Supplier){
        return SupplierRepository .save(Supplier);
    }

}

