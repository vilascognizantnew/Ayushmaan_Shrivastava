package com.cts.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
