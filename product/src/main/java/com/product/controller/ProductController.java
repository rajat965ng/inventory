package com.product.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.domain.Customer;

@RestController
public class ProductController {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value="/api/product",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomerByProduct(){
		
		ResponseEntity<Customer> entity = template.getForEntity("http://localhost:8080/hello", Customer.class);
		Customer customer = entity.getBody();
		customer.setName("Pradeep");
		
		return ResponseEntity.ok(customer);
	}
	
}
