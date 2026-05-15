package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.BookReqDTO;
import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    // CREATE
    public String addBook(BookReqDTO book) {

        if (bookRepository.findByName(book.getName())) {
            return "Book already exists";
        }

        Book b = new Book(book.getName(), book.getPrice());

        bookRepository.save(b);

        return "Book Added";
    }

    // READ ALL
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // READ BY ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // UPDATE
    public String updateBook(Long id, BookReqDTO dto) {

        Book book = bookRepository.findById(id).orElse(null);

        if (book == null) {
            return "Book Not Found";
        }

        book.setName(dto.getName());
        book.setPrice(dto.getPrice());

        bookRepository.save(book);

        return "Book Updated";
    }

    // DELETE
    public String deleteBook(Long id) {

        if (!bookRepository.existsById(id)) {
            return "Book Not Found";
        }

        bookRepository.deleteById(id);

        return "Book Deleted";
    }
}