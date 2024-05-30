package com.binode.lab2new.repository;

import com.binode.lab2new.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class PostRepositoryBaK {

    List<Post> postDb=new ArrayList<>();
    private long nextId =1L;

    public Post save(Post post) {
        if(post.getId()<nextId){
            post.setId(nextId++);
        }
        postDb.add(post);
        return post;
    }

    public Post findById(long id) {
       return postDb.stream().filter(post->post.getId()==id).findFirst().orElse(null);
    }

    public List<Post> findAll() {
        return postDb;
    }
    public List<Post> findByAuthor(String author) {
        return postDb.stream().filter(post -> post.getAuthor().equals(author)).collect(Collectors.toList());
    }


    public List<Post> findByAuthorLetter(String authorletter) {
       return  postDb.stream().filter(post->post.getAuthor().contains(authorletter))
                .collect(Collectors.toList());
    }


    public void deleteById(long id) {
        Post deletepost= postDb.stream().filter(post->post.getId()==id).findFirst().orElse(null);
        int index=postDb.indexOf(deletepost);
        postDb.remove(index);
    }

    public void update(long id, Post post) {
        Post p=findById(id);
        System.out.println(p);
        int index=postDb.indexOf(p);
        Post newPost=new Post(id,post.getTitle(),post.getContent(),post.getAuthor());
        postDb.set(index,newPost);

    }



}
