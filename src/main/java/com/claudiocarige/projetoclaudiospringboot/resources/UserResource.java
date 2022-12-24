package com.claudiocarige.projetoclaudiospringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claudiocarige.projetoclaudiospringboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping 
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Claudio", "ccarige@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
