package com.gl.employeemgmtsys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeemgmtsys.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();

	List<Employee> findAllByOrderByFirstNameDesc();

}
