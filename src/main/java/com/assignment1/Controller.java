package com.assignment1;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment1.part4.services.DAOServices;


@RestController
public class Controller {
	
	@Autowired
	ReviewsRepository rep;
	DAOServices dao;
	
//	@RequestMapping(value="/hello",method =RequestMethod.POST)
//	public ArrayList<Movies> demo(@RequestParam("MovieName") String MovieName){
//		return dao.findAll();
//	}
//	@RequestMapping(value="/hello",method =RequestMethod.POST)
//	public String demo(@RequestParam("name") String name){
//		return "hi";
//	}
	@RequestMapping(value="/hello",method =RequestMethod.POST)
	public Movies demo(@ModelAttribute("movie") Movies movie){
		return movie;
	}
	
	
}
