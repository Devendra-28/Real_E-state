package com.real_estate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.real_estate.payloads.UserDto;
import com.real_estate.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	   //POST-Create user
	
		@PostMapping("/")
		public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
			UserDto createUserDto = this.userservice.createUser(userDto);
			return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);	
		}
		
		//PUT-update User
		
		@PutMapping("/{userId}")
		public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId") Integer uid){
			UserDto updateUser = this.userservice.updateUser(userDto,uid);
			return  ResponseEntity.ok(updateUser);
		}
		
}
