package com.prodian.Restapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.Restapi.Service.Service;
@RestController
public class ControllerClass {
	
	@Autowired
	private Service service;
	
	
	
	public ControllerClass() {
		super();
	}
	public ControllerClass(Service service) {
		super();
		this.service = service;
	}

	@GetMapping("/getdata")
	public String get()
	{
		return "welcomwe";
	}
	
	

}
