package com.binode.lab2new.service;

import com.binode.lab2new.dto.PostDto;

import java.util.List;

public interface PostService {
    public void save(PostDto post);
    public List<PostDto> getAll();
    public PostDto getById(long id);
    public void update(long id, PostDto postDto);
    public void deleteById(long id);
    public List<PostDto> searchByAuthor(String author);
    public List<PostDto> searchByAuthorLetter(String text);
}

