package com.syneproducer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syneproducer.entity.Employee;
import com.syneproducer.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/api")
public class ProducerController {
	
	@Autowired
	private EmployeeServiceInterface eService;
	
	
	@GetMapping("displayall")
	public List<Employee> getAll(){
		return eService.allEmployeeService();
	}
	@PostMapping("/createProfile")
	public Employee create(@RequestBody Employee emp) {
		return eService.createProfileService(emp);
	}
	@PutMapping("/editProfile/{empid}")
	public Employee edit(@RequestBody Employee emp,@PathVariable("empid") String empid) {
		emp.setEmail(empid);
		return eService.editProfile(emp);
	}
	@DeleteMapping("/deleteProfile/{empid}")
	public String delete(@PathVariable("empid") String empid) {
		
		return eService.deleteProfile(empid);
	}

}

















