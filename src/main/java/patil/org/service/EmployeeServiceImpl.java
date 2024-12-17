package patil.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patil.org.entity.Employee;
import patil.org.repository.EmployeeRepository;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) 
	{
		if(employee.getQual().equals("engg")||employee.getQual().equals("Comp"))
		{
			return employeeRepository.save(employee);
		}
		else
		{
			return null;
		}
		
	}

}
