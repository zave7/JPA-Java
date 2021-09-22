package com.jpa.java.domain.practices.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Books.TABLE_NAME)
public class Books {

    public static final String TABLE_NAME = "Books";

    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_AUTHOR = "author";

    public Books() {

    }

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COL_ID)
    private long id = 0L;

    @Column(name = COL_TITLE)
    private String title = "";

    @Column(name = COL_AUTHOR)
    private String author = "";

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = Reviews.COL_BOOK_ID)
    private List<Reviews> reviews = new ArrayList<>();

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
        return "Books{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", reviews=" + reviews +
            '}';
    }
}
