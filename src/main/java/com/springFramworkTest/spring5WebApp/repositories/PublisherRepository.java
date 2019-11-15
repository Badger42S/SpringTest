package com.springFramworkTest.spring5WebApp.repositories;

import com.springFramworkTest.spring5WebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
