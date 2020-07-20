package com.solinvictus.SpringAuthorBookPublisher.Bootstraps;

import org.springframework.boot.CommandLineRunner;

import com.solinvictus.SpringAuthorBookPublisher.Repositories.AuthorsRepository;
import com.solinvictus.SpringAuthorBookPublisher.Repositories.BooksRepository;
import com.solinvictus.SpringAuthorBookPublisher.Repositories.PublishersRepository;

public class Bootstrap implements CommandLineRunner {

	private final AuthorsRepository authorsRepository;
	private final BooksRepository booksRepository;
	private final PublishersRepository publishersRepository;
	
	
	
	
	public Bootstrap(AuthorsRepository authorsRepository, BooksRepository booksRepository,
			PublishersRepository publishersRepository) {
		this.authorsRepository = authorsRepository;
		this.booksRepository = booksRepository;
		this.publishersRepository = publishersRepository;
	}



	//To Do: auth.getAuthors().add();
	//save()
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		
		
	}

}
