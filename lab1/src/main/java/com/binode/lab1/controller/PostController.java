package com.binode.lab1.controller;
import com.binode.lab1.dto.PostDto;
import com.binode.lab1.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> getPosts() {
       return postService.getAll();
    }
    @GetMapping("/{id}")
    public PostDto getPost(@PathVariable long id) {
        return  postService.getById(id);
    }

    @GetMapping("/authors")
    public List<PostDto> getPostByAuthor(@RequestParam("author") String author) {
        return postService.searchByAuthor(author);
    }

    @GetMapping("/search")
    public List<PostDto> searchBytext(@RequestParam("text") String text) {
        return postService.searchByAuthor(text);
    }



    @PostMapping
    public String createPost(@RequestBody PostDto postDto) {
        postService.save(postDto);
        return "Post created";
    }
    @PutMapping("/{id}")
    public String updatePost(@PathVariable long id,@RequestBody PostDto postDto) {
        postService.update(id, postDto);
        return "Post updated";
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable long id) {
        postService.deleteById(id);
        return "Post deleted";
    }




}
