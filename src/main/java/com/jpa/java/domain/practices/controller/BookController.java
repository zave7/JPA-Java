package com.jpa.java.domain.practices.controller;

import com.jpa.java.domain.practices.dtos.requests.ReqPostBook;
import com.jpa.java.domain.practices.dtos.responses.ResBook;
import com.jpa.java.domain.practices.services.BooksService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BooksService bookService;

    public BookController(BooksService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<ResBook> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public List<ResBook> postBook(@RequestBody @Valid ReqPostBook reqPostBook) {
        return bookService.postBook(reqPostBook);
    }

    @DeleteMapping
    public List<ResBook> deleteBooks() {
        return bookService.deleteBooks();
    }
}
