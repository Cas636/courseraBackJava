package com.johan.service;

import java.util.List;
import com.johan.models.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeByID(long id);
	Employee updateEmployee(Employee employee, Long id);
	void deleteEmployee(long id);
}
