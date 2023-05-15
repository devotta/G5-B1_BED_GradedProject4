package com.gl.employeemgmtsys.service;

import java.util.List;

import com.gl.employeemgmtsys.entity.Employee;
import com.gl.employeemgmtsys.entity.Role;
import com.gl.employeemgmtsys.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstNameAsc();

	public List<Employee> sortByFirstNameDesc();

	public User saveUser(User user);

	public Role saveRole(Role role);
}
