package com.sudhanshu.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudhanshu.app.rest.entity.Users;
import com.sudhanshu.app.rest.repo.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@PostMapping(value="/usercreate",consumes= "application/json")
	public Users create(@RequestBody Users user) {
		Users users = repository.save(user);
		return users;
	}
	
    @GetMapping("/userread/{id}")
    public Users read(@PathVariable ("id") int id) {
		Users users= repository.findById(id).get();
		return users;
    }
    
    @PutMapping(value = "/updateuser",consumes = "application/json")
    	public Users update(@RequestBody Users user) {
    		Users user1 = repository.findById(2).get();
    		user1.setName("sudhanshu");
    		user1.setEmail("sudhanshu@gmail.com");
    		repository.save(user1);
    		return user1;
    }   
    
}
