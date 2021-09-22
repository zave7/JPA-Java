package com.jpa.java.domain.practices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Reviews.TABLE_NAME)
public class Reviews {

    public static final String TABLE_NAME = "Reviews";

    public static final String COL_ID = "id";
    public static final String COL_CONTENT = "content";
    public static final String COL_BOOK_ID = "bookId";

    public Reviews() {

    }

    public Reviews(String content, long bookId) {
        this.content = content;
        this.bookId = bookId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COL_ID)
    private long id = 0L;

    @Column(name = COL_CONTENT)
    private String content;

    @Column(name = COL_BOOK_ID)
    private long bookId = 0L;

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
        return "Reviews{" +
            "id=" + id +
            ", content='" + content + '\'' +
            ", bookId=" + bookId +
            '}';
    }
}
