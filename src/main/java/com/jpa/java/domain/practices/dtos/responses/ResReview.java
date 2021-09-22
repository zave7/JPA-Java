package com.jpa.java.domain.practices.dtos.responses;

import com.jpa.java.domain.practices.entities.Reviews;

public class ResReview {

    private final long id;
    private final String content;
    private final long bookId;

    public ResReview(Reviews review) {
        this.id = review.getId();
        this.content = review.getContent();
        this.bookId = review.getBookId();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "ResReview{" +
            "id=" + id +
            ", content='" + content + '\'' +
            ", bookId=" + bookId +
            '}';
    }
}
