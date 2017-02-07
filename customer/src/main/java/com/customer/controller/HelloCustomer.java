package com.customer.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.domain.Customer;
import com.model.domain.InventoryDate;

@RestController
public class HelloCustomer {

	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getHello(){
		return new ResponseEntity<Customer>(
				new Customer(1, "Rajat",new InventoryDate("01/10/1989"), "Male"),
				HttpStatus.OK
				);
	}
	
	
	
}
