package com.quartz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.demo.entity.Employee;
import com.quartz.demo.repo.EmpRepo;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepo empRepo;
	
	@GetMapping("/allemployees")
	public List<Employee> getallEmployees(){
		return empRepo.findAll();
	}
	
	@PostMapping("/addemployee")
	public Employee addEmp(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	

}
