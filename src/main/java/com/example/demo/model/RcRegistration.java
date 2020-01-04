package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RcRegistration
{
	
	
	@Id
	@GeneratedValue
	private String no;
	private Date registrationDate;
	private String personName;
	private String city;
	private String type;
	private String model;
	private String hypotheticl;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getHypotheticl() {
		return hypotheticl;
	}
	public void setHypotheticl(String hypotheticl) {
		this.hypotheticl = hypotheticl;
	}
	
	
	public RcRegistration(Date date, String personName, String city, String type, String model,
			String hypotheticl) 
	{
		super();
		this.registrationDate = date;
		this.personName = personName;
		this.city = city;
		this.type = type;
		this.model = model;
		this.hypotheticl = hypotheticl;
	}
	
	
	
	
	
	  
}
