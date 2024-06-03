package com.binode.lab4.dto;

import com.binode.lab4.model.Post;

import java.util.List;

public class UserDto {
    long id;
    String name;
    List<Post> posts ;

    public UserDto() {
    }

    public UserDto(long id, String name, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.posts = posts;
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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
