package com.dbconnection.lab8.repo;

import com.dbconnection.lab8.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
