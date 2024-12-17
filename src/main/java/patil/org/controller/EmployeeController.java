package patil.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import patil.org.entity.Employee;
import patil.org.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/saveEmployee")
	public String saveRecord(@RequestBody Employee employee)
	{
		Employee emp=employeeService.saveEmployee(employee);
		if(emp!=null)
		{
			return "Record save success";
		}
		else
		{
			return "Record not save success";
		}
	}

}
