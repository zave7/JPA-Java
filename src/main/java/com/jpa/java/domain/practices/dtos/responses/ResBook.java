package com.jpa.java.domain.practices.dtos.responses;

import com.jpa.java.domain.practices.entities.Books;
import com.jpa.java.domain.practices.entities.Reviews;

import java.util.List;

public class ResBook {

    private final long id;
    private final String title;
    private final String author;
    private final List<Reviews> reviews;

    public ResBook(Books books) {
        this.id = books.getId();
        this.title = books.getTitle();
        this.author = books.getAuthor();
        this.reviews = books.getReviews();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "ResBook{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", reviews=" + reviews +
            '}';
    }
}
