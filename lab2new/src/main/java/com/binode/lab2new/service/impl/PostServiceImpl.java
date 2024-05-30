package com.binode.lab2new.service.impl;

import com.binode.lab2new.dto.PostDto;
import com.binode.lab2new.model.Post;
import com.binode.lab2new.repository.PostRepository;
import com.binode.lab2new.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;
    private ModelMapper modelMapper;


    public PostServiceImpl(ModelMapper modelMapper, PostRepository postRepository) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void save(PostDto postDto) {
        Post postEntity = modelMapper.map(postDto, Post.class);
        //new Post(0, post.getTitle(), post.getContent(), post.getAuthor());
        postRepository.save(postEntity);

    }

    @Override
    public List<PostDto> getAll() {
        return postRepository.findAll().stream().
                map(post -> new PostDto(post.getId(), post.getTitle(), post.getContent(), post.getAuthor())).collect(Collectors.toList());

    }

    @Override
    public PostDto getById(long id) {
        Post post = postRepository.findById(id).orElse(null);
        PostDto postEntity = modelMapper.map(post, PostDto.class);
        return postEntity;
    }

    @Override
    public void update(long id, PostDto postDto) {
        Post postEntity = modelMapper.map(postDto, Post.class);
        postRepository.findById(id).
                map(post -> {
                    post.setContent(postEntity.getContent());
                    post.setTitle(postEntity.getTitle());
                    post.setAuthor(postEntity.getAuthor());
                    return postRepository.save(post);

                }).orElse(null);
    }

    @Override
    public void deleteById(long id) {
        postRepository.deleteById(id);

    }

    @Override
    public List<PostDto> searchByAuthor(String author) {
        List<Post> listofPost = postRepository.findAll().
                stream().filter(post -> post.getAuthor().equals(author)).collect(Collectors.toList());
        System.out.println(listofPost);
        List<PostDto> list = new ArrayList<>();
        for (Post post : listofPost) {
            PostDto postDto = modelMapper.map(post, PostDto.class);
            list.add(postDto);
        }

        return list;


    }

    @Override
    public List<PostDto> searchByAuthorLetter(String text) {
        List <Post> listofPost=postRepository.findAll().stream().
                filter(post -> post.getAuthor().contains(text)).collect(Collectors.toList());
        List<PostDto> list=new ArrayList<>();
        for(Post post:listofPost){
            PostDto postDto=modelMapper.map(post, PostDto.class);
            list.add(postDto);
        }

        return list;
    }
}
