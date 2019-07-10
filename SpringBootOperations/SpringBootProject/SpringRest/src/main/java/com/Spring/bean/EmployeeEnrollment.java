package com.Spring.bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeEnrollment {

	private List<EmployeeDetails> employeeRecord;//

	private static EmployeeEnrollment empEnrollment = null;

	private EmployeeEnrollment() {
		employeeRecord = new ArrayList<EmployeeDetails>();
	}

	public static EmployeeEnrollment getInstance() {
		if (empEnrollment == null) {
			empEnrollment = new EmployeeEnrollment();
			return empEnrollment;
		} else {
			return empEnrollment;
		}
	}

	public void add(EmployeeDetails empDetails) {
		employeeRecord.add(empDetails);
	}
	

public String upDateEmployeeDetail(EmployeeDetails employeeDetails) {
for(int i=0; i<employeeRecord.size(); i++)
        {
            EmployeeDetails employee = employeeRecord.get(i);
            if(employee.getEmployeeId().equals(employeeDetails.getEmployeeId())) {
            employeeRecord.set(i, employeeDetails);//update the new record
              return "Update successful";
            }
        }
return "Update un-successful";
}
public String deleteEmployeeDetail(String id) {
for(int i=0; i<employeeRecord.size(); i++)
        {
           EmployeeDetails employee = employeeRecord.get(i);
            if(employee.getEmployeeId().equals(id)){
              employeeRecord.remove(i);//update the new record
              return "Delete successful";
            }
        }

return "Delete un-successful";
}

public List<EmployeeDetails> getEmployeeRecords() {
return employeeRecord;
}

}
