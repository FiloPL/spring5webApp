package com.filopl.springone.repositories;

import com.filopl.springone.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
