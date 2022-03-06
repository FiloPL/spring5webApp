package com.filopl.springone.repositories;

import com.filopl.springone.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
