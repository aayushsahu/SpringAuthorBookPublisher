package com.example.demo.Bootstrap;

import com.example.demo.models.Author;
import com.example.demo.models.Book;
import com.example.demo.models.Publisher;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, PublisherRepository publisherRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
        this.bookRepository = bookRepository;
    }

    private void initData(){

        Publisher p1=new Publisher("AKS PUBLICATIONS", "PUNE");
        Author a1= new Author("AAYUSH",  "SAHU",  "from CG" );
        Author a2= new Author("AAYUSH2",  "SAHU2",  "from CG2" );
        Book b1=new Book("BOOK_NAME", "987654321", p1);
        //adding book to authors
        a1.getBooks().add(b1);
        a2.getBooks().add(b1);
        //adding authors to book
        b1.getAuthors().add(a1);
        b1.getAuthors().add(a2);




        Publisher p2=new Publisher("AKS PUBLICATIONS2", "PUNE2");
        Author a3= new Author("AAYUSH3",  "SAHU3",  "from CG3" );
        Book b2=new Book("BOOK_NAME2", "98765432100", p2);

        a3.getBooks().add(b2);
        b2.getAuthors().add(a3);



        authorRepository.save(a1);
        authorRepository.save(a2);
        authorRepository.save(a3);

        bookRepository.save(b1);
        bookRepository.save(b2);

        publisherRepository.save(p1);
        publisherRepository.save(p2);



    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
}
