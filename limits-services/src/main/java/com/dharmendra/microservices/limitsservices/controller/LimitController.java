package com.dharmendra.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharmendra.microservices.limitsservices.bean.Limits;
import com.dharmendra.microservices.limitsservices.configuration.Configuration;


/**
 * @author Dharmendra Kumar 
 *
 * Created a hard coded limits service
 * Controller class
 * 
 * this is the mail class package com.dharmendra.microservices.limitsservices.(controller/bean/services) should be there
 */


@RestController
public class LimitController {
	
	@Autowired
	private Configuration  configuration;
	
	@GetMapping("/limit")
	public Limits retriveLimits() {
		//feteching the limits service from properties file
		//return new Limits(configuration.getMinimum(), configuration.getMaximum());
		return new Limits(500, 10000);
		
	}
}
