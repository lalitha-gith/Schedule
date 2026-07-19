package com.quartz.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quartz.demo.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, String> {

}
