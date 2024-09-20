package com.johan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.johan.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
