package com.book.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.book.DAO.BookDao;
import com.book.DTO.BookEntity;

@RestController
public class BookController {
	
	@Autowired
	BookDao dao;
	
	//API to insert employee object to DB
	@RequestMapping("/insert")
	public ModelAndView getEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("book", new BookEntity());
		mv.setViewName("create.jsp");
		//mv.setViewName("createAccount.jsp");
		return mv;
		
	}
	@RequestMapping("/save")
	public ModelAndView saveBook(@ModelAttribute BookEntity book)
	{
		dao.saveBook(book);
		ModelAndView v=new ModelAndView();
		v.setViewName("index.jsp");
		return v;
	}
	
	

}
