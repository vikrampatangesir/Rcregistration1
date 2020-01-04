package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.RcRegistration;
import com.example.demo.model.VehicleType;
import com.example.demo.repositeries.RcRegistrationRepo;
import com.example.demo.repositeries.VehicleTypeRepo;

@SpringBootApplication
public class RcRegistrationApplication {

	public static void main(String[] args) {
		ApplicationContext context=(ApplicationContext) SpringApplication.run(RcRegistrationApplication.class, args);
		
		String[] beanNames = ((ListableBeanFactory) context).getBeanDefinitionNames();
		
		
		
		
		
	}
     
	@Autowired
	private VehicleTypeRepo vehicleTypeRepo;
	
	@Autowired
	private RcRegistrationRepo rcRegistrationRepo;
	
	@PostConstruct
	public void addData()
	{
		VehicleType wagnor=new VehicleType("LMV", "maruti","wagnor");
		vehicleTypeRepo.save(wagnor);
		
		VehicleType audi=new VehicleType("LMV", "maruti","wagnor");
		vehicleTypeRepo.save(audi);
		
		VehicleType bmw=new VehicleType("LMV", "maruti","wagnor");
		vehicleTypeRepo.save(bmw);
		
		RcRegistration rcRegistration=new RcRegistration(new Date(), "john", "pune", "abcd", "wagnor", "pqrs");
		rcRegistrationRepo.save(rcRegistration);
		
		RcRegistration rcRegistration2=new RcRegistration(new Date(), "john", "pune", "abcd", "wagnor", "pqrs");
		
	}
	
	  
	
	
	
	
	 
}
