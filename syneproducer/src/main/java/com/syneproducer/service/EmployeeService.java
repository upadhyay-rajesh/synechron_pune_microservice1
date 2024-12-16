package com.syneproducer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syneproducer.dao.EmployeeDAOInterface;
import com.syneproducer.entity.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceInterface{
	
	@Autowired
	private EmployeeDAOInterface eDao;

	@Override
	public List<Employee> allEmployeeService() {
		// TODO Auto-generated method stub
		return eDao.findAll();
	}

	@Override
	public Employee createProfileService(Employee emp) {
		eDao.save(emp);
		return emp;
	}

	@Override
	public Employee editProfile(Employee emp) {
		eDao.saveAndFlush(emp);
		return emp;
	}

	@Override
	public String deleteProfile(String empid) {
		eDao.deleteById(empid);
		return "record deleted";
	}

}








