package com.mapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapp.entity.Employee;
import com.mapp.repositories.EmpRepository;
@Service
public class EmpService implements IEmpService{
	
	@Autowired
	private EmpRepository empRepo;

	@Override
	public long registerEmp(Employee employee) {
		
		Employee employee2 = empRepo.save(employee);
		
		return employee2.getEmpId();
	}

	@Override
	public List<Employee> listsOfEmp() {
		
		return empRepo.findAll();
	}

	
	
	
}
