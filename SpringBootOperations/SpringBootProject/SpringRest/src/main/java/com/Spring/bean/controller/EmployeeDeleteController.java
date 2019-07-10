package com.Spring.bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Spring.bean.EmployeeEnrollment;

@Controller
public class EmployeeDeleteController {
	@RequestMapping(method= RequestMethod.DELETE, value="/delete/employee/{employeeId}")
	
	@ResponseBody
	public String deleteEmployeeRecord(@PathVariable("employeeId") String employeeId) {
		System.out.println("In deleteStudentRecord");   
		    return EmployeeEnrollment.getInstance().deleteEmployeeDetail(employeeId);
		}

	
	

}
