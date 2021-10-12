package com.cg.syed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.syed.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register")
	public String showReg() {
		return "EmpRegister1";
		
	}
	
	@PostMapping("/save")
	public String saveData(Model model,
			@ModelAttribute Employee employee) {
		
		System.out.println(employee);
		model.addAttribute("eob", employee);
		return "EmpData";
		
	}
	
}
