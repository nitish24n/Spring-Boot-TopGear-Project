package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	BankService bank;
	
	//Assignment 1 - Part 1
	@GetMapping("/name")
	public String getBankName(){
		return "State Bank Of India";
	}
	
	//Assignment 1 - Part 2
	@GetMapping("/address")
	public String getBankAddress(){
		return "Street No. 15, Greater Noida, Delhi";
	}
	
	
}
