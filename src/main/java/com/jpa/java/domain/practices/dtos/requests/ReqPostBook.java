package com.jpa.java.domain.practices.dtos.requests;

import com.jpa.java.domain.practices.entities.Books;
import com.sun.istack.NotNull;

public class ReqPostBook {

    @NotNull
    private String title;
    @NotNull
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Books toEntity() {
        return new Books(this.title, this.author);
    }
}
