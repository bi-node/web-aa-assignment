package com.binode.lab4.dto;

public class CommentDto {
    long id;
    String name;

    public CommentDto() {
    }

    public CommentDto(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

