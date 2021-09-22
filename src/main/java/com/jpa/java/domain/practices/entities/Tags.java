package com.jpa.java.domain.practices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Tags.TABLE_TABLE)
public class Tags {

    public static final String TABLE_TABLE = "Tags";

    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COL_ID)
    private long id = 0L;

    @Column(name = COL_NAME)
    private String name = "";

    public Tags() {

    }

    public Tags(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tags{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
