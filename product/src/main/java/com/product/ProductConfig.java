package com.product;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProductConfig {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
}
