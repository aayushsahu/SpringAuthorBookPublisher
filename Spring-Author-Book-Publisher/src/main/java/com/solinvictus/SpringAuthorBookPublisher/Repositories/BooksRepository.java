package com.solinvictus.SpringAuthorBookPublisher.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.solinvictus.SpringAuthorBookPublisher.Domains.Book;

public interface BooksRepository extends CrudRepository<Book, Long> {

}
