package com.example.interfaces;

import com.example.entities.Book;

import java.util.List;

public interface BookRepository {
    void save(Book book);

    Book findById(int id);

    List<Book> findAll();

    List<Book> findByName(String name);

    void update(int id, Book book);

    int delete(int id);

    int deleteAll();
}
