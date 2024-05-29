package com.binode.lab1.service;

import com.binode.lab1.dto.PostDto;
import com.binode.lab1.model.Post;

import java.util.List;

public interface PostService {
    public void save(PostDto post);
    public List<PostDto> getAll();
    public PostDto getById(long id);
    public void update(long id, PostDto post);
    public void deleteById(long id);
    public List<PostDto> searchByAuthor(String author);
    public List<PostDto> searchByAuthorLetter(String authorLetter);

}

