package com.ninja.libraries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.libraries.models.Users;
import com.ninja.libraries.repositories.UserJpaRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<Users> findall(){
		return userJpaRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Users findbyUserId(@PathVariable final String id) {
		return new Users();//userJpaRepository.findbyUserId(id);
	}
	
	@PostMapping(value ="/load")
	public Users load(@RequestBody final Users user) {
		return userJpaRepository.save(user);
	}
}
