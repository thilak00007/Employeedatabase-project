package com.example.postman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postman.module.Employee;
import com.example.postman.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService ser;
	@PostMapping("/addEmployee")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		return new ResponseEntity<Employee>(ser.addEmployee(e),HttpStatus.CREATED);
	}
	//localhost/employeeByID
	@GetMapping("/employeeByID")
	ResponseEntity<Employee> GetByID (@RequestHeader Integer eid){
		return new ResponseEntity<Employee>(ser.GetByID(eid),HttpStatus.FOUND);
	}
	
	@GetMapping("/employeeByDesignation")
	ResponseEntity<List<Employee>> employeeByDesignation (@RequestHeader String designation){
		return new ResponseEntity<List<Employee>>(ser.empbyDesg(designation),HttpStatus.FOUND);
	}
	
	@GetMapping("/employeeBySal")
	ResponseEntity<List<Employee>> employeeByLessSal(@RequestHeader Double sal){
			return new ResponseEntity<List<Employee>>(ser.emplessSal(sal),HttpStatus.FOUND);
	}
	
	@PutMapping("/updateEmp")
	ResponseEntity<Employee> updateEmployee(@RequestBody Employee e){
		return new ResponseEntity<Employee>(ser.updateEmployee(e),HttpStatus.OK);
	}
	@DeleteMapping("/deleteEmp")
	ResponseEntity<Employee> deleteEmployee(@RequestParam Integer eid){
		return new ResponseEntity<Employee>(ser.deleteEmployee(eid),HttpStatus.OK);
	}
	
	
	
}
