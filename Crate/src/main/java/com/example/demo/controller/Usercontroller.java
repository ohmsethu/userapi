package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
@RestController
public class Usercontroller {
	@Autowired
	public Repo rep;
	
	
	@PostMapping("/olleh")
	public Userentity adddata(@RequestBody Userentity user) {
		try {
		
		rep.save(user);
		return user;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
	@GetMapping("/get")
	public List<Userentity> get(){
		try {
		return rep.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		}
	@DeleteMapping("/getdel/{Id}")
	public String del(@PathVariable int Id) {
		@SuppressWarnings("deprecation")
		Userentity user=rep.getOne(Id);
		rep.delete(user);
		return "DELETE";
		
	}
	
	 
	@PutMapping("/update")
	public Userentity updateuser(@RequestBody Userentity user) {
		try {
		rep.save(user);
		return user;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
