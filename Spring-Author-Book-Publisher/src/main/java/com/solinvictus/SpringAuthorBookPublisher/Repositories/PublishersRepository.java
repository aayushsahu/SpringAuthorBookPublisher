package com.solinvictus.SpringAuthorBookPublisher.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.solinvictus.SpringAuthorBookPublisher.Domains.Publisher;

public interface PublishersRepository extends CrudRepository<Publisher, Long>{

}
