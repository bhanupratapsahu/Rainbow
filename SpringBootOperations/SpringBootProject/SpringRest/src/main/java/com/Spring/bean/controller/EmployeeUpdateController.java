package com.Spring.bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Spring.bean.EmployeeDetails;
import com.Spring.bean.EmployeeEnrollment;

@Controller
public class EmployeeUpdateController {
	@RequestMapping (method = RequestMethod.PUT, value= "/update/employeedetails")
	@ResponseBody
	public String updateStudentRecord(@RequestBody EmployeeDetails employeeDetails) {
		System.out.println("In update Employee Records");   
		    return EmployeeEnrollment.getInstance().upDateEmployeeDetail(employeeDetails);
		}
	

}
