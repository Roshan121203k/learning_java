package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.BookReqDTO;
import com.example.demo.entities.Book;
import com.example.demo.service.BookService;

import lombok.AllArgsConstructor;

@CrossOrigin({"http://localhost:4200","http://localhost:52559"})
@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private BookService b;

    // CREATE
    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody BookReqDTO book) {

        return ResponseEntity.ok(b.addBook(book));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {

        return ResponseEntity.ok(b.getAllBooks());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {

        return ResponseEntity.ok(b.getBookById(id));
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(
            @PathVariable Long id,
            @RequestBody BookReqDTO dto) {

        return ResponseEntity.ok(b.updateBook(id, dto));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {

        return ResponseEntity.ok(b.deleteBook(id));
    }
}