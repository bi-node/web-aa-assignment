package com.binode.lab5.service;

import com.binode.lab5.dto.PostDto;

import java.util.List;

public interface PostService {
    public void save(PostDto post);
    public List<PostDto> getAll();
    public PostDto getById(long id);
    public void update(long id, PostDto postDto);
    public void deleteById(long id);
    public List<PostDto> searchByAuthor(String author);
    public List<PostDto> searchByAuthorLetter(String text);
    public List<PostDto> searchByTitle(String title);
}

