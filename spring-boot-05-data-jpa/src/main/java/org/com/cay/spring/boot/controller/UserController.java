package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.entity.User;
import org.com.cay.spring.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Cay on 2018/5/17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public User getById(@PathVariable Integer id){
		return userRepository.findOne(id);
	}

	@PostMapping("/")
	public User insert(User user){
		userRepository.save(user);
		return user;
	}
}
