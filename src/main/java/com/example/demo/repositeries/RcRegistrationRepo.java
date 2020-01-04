package com.example.demo.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.RcRegistrationApplication;
import com.example.demo.model.RcRegistration;
import com.example.demo.model.VehicleType;

public interface RcRegistrationRepo extends JpaRepository<RcRegistration,Long >
{

}
