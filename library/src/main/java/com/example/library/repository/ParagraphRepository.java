package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.library.entity.Paragraph;

public interface ParagraphRepository extends CrudRepository<Paragraph,Long> {

}
