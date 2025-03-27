package com.tka;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@RestController
@RequestMapping("/Flipkart")
public class MyController {
	
	
//	@RequestMapping(value = "/Toys",method = RequestMethod.GET)
//	public String lastApi() {
//		return "Toys Collection ";
//		
//	}
	
	
	@PostMapping("/Televisions")
	public String FirstApi() {
		return "Collection of Televisions";
	}
	
	@GetMapping("/Mobiles")
	public String secondApi() {
		return "Mobiles Stands for All Mobiles";
		
	}
	@PutMapping("/Laptops")
	public String thirdApi() {
		return "Collection of Laptops";
		
	}
	@DeleteMapping("/Tshirts")
	public String fourthApi() {
		return "Collection of Men/Women T-Shirts";
		
	}
	
	
	
	
	
	
	

}
