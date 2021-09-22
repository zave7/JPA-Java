package com.jpa.java.domain.practices.services;

import com.jpa.java.domain.practices.dtos.requests.ReqPostBook;
import com.jpa.java.domain.practices.dtos.responses.ResBook;
import com.jpa.java.domain.practices.entities.Books;
import com.jpa.java.domain.practices.repositoies.BooksRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Transactional(readOnly = true)
    public List<ResBook> getBooks() {
        return booksRepository.findAll(Sort.by(Sort.Direction.ASC, Books.COL_TITLE)).stream()
            .map(ResBook::new)
            .collect(Collectors.toList());
    }

    @Transactional
    public List<ResBook> postBook(ReqPostBook reqPostBook) {
        booksRepository.save(reqPostBook.toEntity());
        return this.getBooks();
    }

    public List<ResBook> deleteBooks() {
        booksRepository.deleteAll();
        return new ArrayList<>();
    }
}
