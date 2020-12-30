package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.library.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
