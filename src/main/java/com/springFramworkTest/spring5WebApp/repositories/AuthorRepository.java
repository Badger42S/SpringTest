package com.springFramworkTest.spring5WebApp.repositories;

import com.springFramworkTest.spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
