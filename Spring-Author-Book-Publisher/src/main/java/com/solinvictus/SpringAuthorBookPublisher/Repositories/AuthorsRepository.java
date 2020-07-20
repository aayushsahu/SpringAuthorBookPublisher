package com.solinvictus.SpringAuthorBookPublisher.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.solinvictus.SpringAuthorBookPublisher.Domains.Author;

public interface AuthorsRepository extends CrudRepository<Author, Long>{

}
