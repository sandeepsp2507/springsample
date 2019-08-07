package com.example.SportManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SportManagement.bean.Sports;
import com.example.SportManagement.dao.SportsManagementDao;



@RestController
@RequestMapping("/sports")
public class SportsManagementController {
	
	@Autowired
	private SportsManagementDao dao;
	
	@GetMapping
	public List<Sports> getSports(){
		System.out.println("REceived request");
		return (List<Sports>) dao.findAll();
	}
}
