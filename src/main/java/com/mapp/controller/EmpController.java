package com.mapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mapp.entity.Employee;
import com.mapp.service.IEmpService;

@Controller
public class EmpController {
	
	
	@Autowired
	private IEmpService empService;

	@GetMapping("/reg.htm")
	public String regEmp(ModelMap map) {
		
		map.addAttribute("emp", new Employee());
		
		return "empreg";
	}
	@PostMapping("/reg.htm")
	public String regE(@ModelAttribute("emp") Employee employee,ModelMap map) {
		
		long registerEmp = empService.registerEmp(employee);
		map.addAttribute("id", registerEmp);
		
		return "success";
	}
	
	@GetMapping("/list.htm")
	public String empList(ModelMap map) {
		List<Employee> employees = empService.listsOfEmp();
		map.addAttribute("employees", employees);
		return "emplist";
	}
	
}
