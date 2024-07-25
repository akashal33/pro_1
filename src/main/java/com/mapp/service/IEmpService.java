package com.mapp.service;

import java.util.List;

import com.mapp.entity.Employee;

public interface IEmpService {
	
	public long registerEmp(Employee employee);
	
	public List<Employee> listsOfEmp();

}
