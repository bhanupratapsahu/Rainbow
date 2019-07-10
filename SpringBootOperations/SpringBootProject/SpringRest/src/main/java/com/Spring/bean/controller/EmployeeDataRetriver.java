package com.Spring.bean.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Spring.bean.EmployeeDetails;
import com.Spring.bean.EmployeeEnrollment;

@Controller
public class EmployeeDataRetriver {


	
	@RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
	@RequestMapping(method = RequestMethod.GET, value = "/Employee/allEmployees")
	@ResponseBody
	public List<EmployeeDetails> getAllEmployees() {
	
		return EmployeeEnrollment.getInstance().getEmployeeRecords();
	}

}
