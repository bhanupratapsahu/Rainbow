package com.Spring.bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Spring.bean.EmployeeDetails;
import com.Spring.bean.EmployeeEnrollment;
import com.Spring.bean.EmployeeEnrollmentReply;

@Controller
public class EmployeeEnrollmentController {
	@RequestMapping(method = RequestMethod.POST, value="/enroll/employee")
	 
	
	@ResponseBody
	 public EmployeeEnrollmentReply enrollEmployee(@RequestBody EmployeeDetails employee) {
	  System.out.println("In enrolled Employee");
	        EmployeeEnrollmentReply empEnrollReply = new EmployeeEnrollmentReply();           
	       EmployeeEnrollment.getInstance().add(employee);
	        //We are setting the below value just to reply a message back to the caller
	       empEnrollReply.setName(employee.getEmployeeName());
	       empEnrollReply.setId(employee.getEmployeeId());
	       empEnrollReply.setEnrollmentStatus("Successful");
	        return empEnrollReply;
	}
	
}
