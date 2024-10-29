package com.example;

import com.example.entities.Book;
import com.example.interfaces.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return runner -> {
            deleteAllBook(bookRepository);
            createBook(bookRepository);
        };
    }

    private void deleteBook(int id, BookRepository bookRepository) {
        System.out.println("Deleting book data.");
        bookRepository.delete(id);
        System.out.println("Book deleted!");
    }

    private void deleteAllBook(BookRepository bookRepository) {
        bookRepository.deleteAll();
    }

    private void updateBook(int id, BookRepository bookRepository) {
        bookRepository.update(id, new Book("Bible", "Jesus", 159.90f));
    }

    private void readBookByName(BookRepository bookRepository) {
        List<Book> books = bookRepository.findByName("Bi");
        books.forEach(s -> {
            System.out.println(s);
        });
    }

    private void readAllBook(BookRepository bookRepository) {
        List<Book> books = bookRepository.findAll();
        books.forEach(s -> {
            System.out.println(s);
        });
    }

    private void readBook(BookRepository bookRepository) {
        Book book = bookRepository.findById(1);

        System.out.println("First name: " + book);
    }

    private void createBook(BookRepository bookRepository) {
        System.out.println("Creating new Book object...");
        Book book1 = new Book("Bible", "Jesus", 200);
        Book book2 = new Book("The Imitation of Christ", "Thomas", 50.90f);

        System.out.println("Saving Book...");
        bookRepository.save(book1);
        bookRepository.save(book2);

        System.out.println("Saved Book! Generated ID: " + book1.getId());
        System.out.println("Saved Book! Generated ID: " + book2.getId());
    }
}
