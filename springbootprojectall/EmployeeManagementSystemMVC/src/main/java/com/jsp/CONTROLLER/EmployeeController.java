package com.jsp.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	//API to insert employee object to DB
	@RequestMapping("/insert")
	public ModelAndView getEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("create.jsp");
		return mv;
		
	}
	
	
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		ModelAndView v=new ModelAndView();
		v.setViewName("index.jsp");
		return v;
	}
	
	//Abased on IDPI for searching an object in DB 
	@RequestMapping("/search")
	public ModelAndView searchEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("get.jsp");
		return mv;
		
	}
	
	
	@RequestMapping("/display")
	public ModelAndView findEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=dao.getEmployeeById(employee.getId());
		mv.addObject("employee", emp);
		mv.setViewName("display.jsp");
		return mv;
		
		
			
	}

	

}
