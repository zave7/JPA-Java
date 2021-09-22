package com.jpa.java.domain.practices.dtos.requests;

import com.jpa.java.domain.practices.entities.Tags;

import javax.validation.constraints.NotNull;

public class ReqPostTag {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public Tags toEntity() {
        return new Tags(this.name);
    }
}
