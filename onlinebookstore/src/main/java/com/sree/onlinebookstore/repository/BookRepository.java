package com.sree.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
