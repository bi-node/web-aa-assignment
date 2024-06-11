package com.binode.lab4.service.impl;


import com.binode.lab4.dto.PostDto;
import com.binode.lab4.dto.UserDto;

import com.binode.lab4.entity.Post;
import com.binode.lab4.entity.User;
import com.binode.lab4.repository.PostRepository;
import com.binode.lab4.repository.UserRepository;
import com.binode.lab4.service.UserService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @PersistenceContext
    private EntityManager entityManager;
    UserRepository userRepository;
    ModelMapper modelMapper;
    PostRepository postRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.postRepository = postRepository;
    }


    @Override
    public List<UserDto> getAllUser() {
        List<User> usersList = userRepository.findAll();
        List<UserDto> usersDtoList = new ArrayList<>();

        for (User user : usersList) {
            usersDtoList.add(modelMapper.map(user, UserDto.class));
        }

        return usersDtoList;
    }

    @Override
    public void insertUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
    }

    @Override
    public UserDto getUserById(long id) {
        User user = userRepository.findById(id).orElse(null);
        return modelMapper.map(user, UserDto.class);

    }

    public List<PostDto> getAllPostsByUserId(long id) {
        List<Post> listofPosts = userRepository.findById(id).get().getPosts();
        List<PostDto> postDtos = new ArrayList<>();
        for (Post post : listofPosts) {
            postDtos.add(modelMapper.map(post, PostDto.class));
        }

        return postDtos;
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDto> userWithNPosts(int n) {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(user -> {
            List<Post> listofPost = user.getPosts();
            if (listofPost.size() >= n)
                userList.add(user);
        });

        List<UserDto> usersDtoList = new ArrayList<>();
        for (User user : userList) {
            usersDtoList.add(modelMapper.map(user, UserDto.class));
        }
        return usersDtoList;
    }

    @Override
    public List<UserDto> userWithTitlePost(String title) {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(user -> {
            List<Post> listofPost = user.getPosts();
            for (Post post : listofPost) {
                if (post.getTitle().contains(title))
                {
                    userList.add(user);
                    break;
                }

            }
        });
        List<UserDto> usersDtoList = new ArrayList<>();
        for (User user : userList) {
            usersDtoList.add(modelMapper.map(user, UserDto.class));
        }
        return usersDtoList;
    }

    @Override
    public void methodThatThrowsException() {
        throw new RuntimeException("This is a test exception");


    }


}
