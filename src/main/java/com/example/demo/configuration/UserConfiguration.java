package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.User;

@Configuration
public class UserConfiguration 
{
	
	@Bean
	public User userA()
	{
		return new User("aaaaa", "bbbbbb");
		
	}
	

}
