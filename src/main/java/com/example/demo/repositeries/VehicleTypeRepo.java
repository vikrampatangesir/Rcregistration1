package com.example.demo.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VehicleType;

public interface VehicleTypeRepo extends JpaRepository<VehicleType,Long>
{

}
