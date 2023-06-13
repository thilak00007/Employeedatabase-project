package com.example.postman.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postman.exception.ResourceNotFoundException;
import com.example.postman.module.Employee;
import com.example.postman.repo.EmployeeRepo;
import com.example.postman.service.EmployeeService;


@Service
public class EmployyeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee e) {
		
		return repo.save(e);
	}

	
	@Override
	public Employee GetByID(int eid) {
		
		return repo.findById(eid).orElseThrow(()-> new ResourceNotFoundException("Employee", "id", eid));
	}

	@Override
	public List<Employee> empbyDesg(String designation) {
		// TODO Auto-generated method stub
		return repo.findByDesignation(designation);
	}

	@Override
	public List<Employee> emplessSal(Double sal) {
		// TODO Auto-generated method stub
		return repo.empByLessSal(sal);
	}


	@Override
	public Employee updateEmployee(Employee e) {
		Employee e1= repo.findById(e.getEid()).orElse(null);
		if(e1!=null) {
			e1.setEname(e1.getEname());
			e1.setDesignation(e1.getDesignation());
			e1.setSal(e1.getSal());
			e1.setPhno(e1.getPhno());
			return repo.save(e1);
		}
		else {
			throw new ResourceNotFoundException("Employee", "Id", e.getEid());
		}
	
	}


	@Override
	public Employee deleteEmployee(Integer eid) {
		Employee e1= repo.findById(eid).orElse(null);
		if(e1!=null) {
			repo.deleteById(eid);
			return e1;
		}
		else {
			throw new ResourceNotFoundException("Employee", "Id", eid);
		}
		
		
	}

//	

}
