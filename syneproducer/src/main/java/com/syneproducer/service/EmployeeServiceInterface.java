package com.syneproducer.service;

import java.util.List;

import com.syneproducer.entity.Employee;

public interface EmployeeServiceInterface {

	List<Employee> allEmployeeService();

	Employee createProfileService(Employee emp);

	Employee editProfile(Employee emp);

	String deleteProfile(String empid);

}
