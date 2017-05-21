package com.assignment1.part4.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment1.Movies;
import com.assignment1.ReviewsRepository;

public class DAOServices {
	
	@Autowired 
	ReviewsRepository rep;
	Movies movie;
	
	public ArrayList<Movies> findAll(){
		ArrayList<Movies> al= new ArrayList<Movies>();
		al=(ArrayList<Movies>) rep.findAll();
		return al;
	}
}
