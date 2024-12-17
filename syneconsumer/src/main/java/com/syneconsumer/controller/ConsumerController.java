package com.syneconsumer.controller;

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
import org.springframework.web.client.RestTemplate;

import com.syneconsumer.dto.Employee;

@RestController
@RequestMapping("/consumerapi")
public class ConsumerController {
	// @Autowired
	// RestTemplate restTemplate;
	@GetMapping("/displayallproducer")
	public List<Employee> getAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Employee> ee = restTemplate.getForObject("http://localhost:10001/api/displayall", List.class);
		System.out.println(ee);
		return ee;
	}

	@PostMapping("/create")
	public Employee createPost(@RequestBody Employee ee) {
		RestTemplate restTemplate = new RestTemplate();
		Employee response = restTemplate.postForObject("http://localhost:10001/api/createProfile", ee, Employee.class);
		return response;
	}

	@PutMapping("/update/{id}")
	public Employee updatePost(@RequestBody Employee ee, @PathVariable String id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put("http://localhost:10001/api/editProfile/" + id, ee);
		return ee;
	}

	@DeleteMapping("/delete/{id}")
	public String deletePost(@PathVariable String id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:10001/api/deleteProfile/" + id);

		return "deleted";
	}

}
