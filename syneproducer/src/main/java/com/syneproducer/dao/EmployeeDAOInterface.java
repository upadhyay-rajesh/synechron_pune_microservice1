package com.syneproducer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syneproducer.entity.Employee;

@Repository
public interface EmployeeDAOInterface extends JpaRepository<Employee, String>{

}
