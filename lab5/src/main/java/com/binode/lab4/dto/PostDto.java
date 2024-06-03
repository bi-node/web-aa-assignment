package com.binode.lab4.dto;

import com.binode.lab4.model.Comment;

import java.util.List;

public class PostDto {
    private long id;
    private String title;
    private String content;
    private String author;
    private List<Comment> comment;
    public PostDto(){}
    public PostDto(long id,String title, String content, String author, List<Comment> comment) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.comment = comment;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
