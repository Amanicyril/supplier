package com.amanicb.apps.rest;

import com.amanicb.apps.rest.entity.supplier;
import com.amanicb.apps.rest.repository.supplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Autowired
	private supplierRepo SupplierRepository;

	@Override
	public void run(String... args) throws Exception {

		supplier Supplier= new supplier();
		Supplier.setFirst_name("amani ");
		Supplier.setLast_name("cyril");
		Supplier.setGender("MALE");
		Supplier.setAge(23);
		Supplier.setId(1);
		SupplierRepository.save(Supplier);

		supplier Supplier1= new supplier();
		Supplier1.setFirst_name("Faraj");
		Supplier1.setLast_name("cyril");
		Supplier1.setGender("MALE");
		Supplier1.setAge(23);
		Supplier1.setId(1);
		SupplierRepository.save(Supplier1);



	}
}
