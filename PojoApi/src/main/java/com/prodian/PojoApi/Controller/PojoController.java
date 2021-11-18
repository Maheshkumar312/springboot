package com.prodian.PojoApi.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.PojoApi.Service.EmployeeService;


@RestController
public class PojoController {
	EmployeeService employeeService;

	 @RequestMapping(value="/employee",method = RequestMethod.POST) 
	    public String requestOTP( @RequestBody Map<String,Object> body) {
	        return employeeService.employeeDet(body.get("employeeId").toString(), body.get("employeeName").toString(),body.get("salary").toString(),body.get("mobileNumber").toString());
	}
}
