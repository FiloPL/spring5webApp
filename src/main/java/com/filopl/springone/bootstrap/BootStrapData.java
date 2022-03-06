package com.filopl.springone.bootstrap;

import com.filopl.springone.domain.Author;
import com.filopl.springone.domain.Book;
import com.filopl.springone.domain.Publisher;
import com.filopl.springone.repositories.AuthorRepository;
import com.filopl.springone.repositories.BookRepository;
import com.filopl.springone.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setAdress("ul. Dlugosza");
        publisher.setCity("Poznań");
        publisher.setCountry("Polska");
        publisher.setZip("60-000");

        publisherRepository.save(publisher);

        Author dzik = new Author("Dziki", "Dzik");
        Book firstBook = new Book("Maly Smok", "123123");
//        dzik.getBooks().add(firstBook);
//        firstBook.getAuthors().add(dzik);

        bookRepository.save(firstBook);
        authorRepository.save(dzik);

        Author bellu = new Author("Bella", "Cat");
        Book secondBook = new Book("miau", "786712");
//        bellu.getBooks().add(secondBook);
//        secondBook.getAuthors().add(bellu);

        bookRepository.save(secondBook);
        authorRepository.save(bellu);

        System.out.println("started from bookstrap");
        System.out.println("Numer of books " + bookRepository.count());

    }
}
