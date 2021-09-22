package com.jpa.java.domain.practices.dtos.responses;

import com.jpa.java.domain.practices.entities.Tags;

public class ResTag {

    private final long id;
    private final String name;

    public ResTag(Tags tag) {
        this.id = tag.getId();
        this.name = tag.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
