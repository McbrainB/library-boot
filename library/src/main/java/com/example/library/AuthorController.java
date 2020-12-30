package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Author;
import com.example.library.repository.AuthorRepository;

@RestController
@RequestMapping(path="/author")
public class AuthorController {
	@Autowired // This means to get the bean called userRepository
	private AuthorRepository authorRepository;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Author> getAllUsers() {
		return authorRepository.findAll();
	}

	
}
