package com.jpa.java.domain.practices.dtos.requests;

import com.jpa.java.domain.practices.entities.Reviews;

public class ReqPostReview {

    private String content;
    private long bookId;

    public String getContent() {
        return content;
    }

    public long getBookId() {
        return bookId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Reviews toEntity() {
        return new Reviews(this.content, this.bookId);
    }

    @Override
    public String toString() {
        return "ReqPostReview{" +
            "content='" + content + '\'' +
            ", bookId=" + bookId +
            '}';
    }
}
