package com.binode.lab2new.service.impl;


import com.binode.lab2new.dto.PostDto;
import com.binode.lab2new.dto.UserDto;

import com.binode.lab2new.model.Post;
import com.binode.lab2new.model.User;
import com.binode.lab2new.repository.PostRepository;
import com.binode.lab2new.repository.UserRepository;
import com.binode.lab2new.service.UserService;

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
        User user=modelMapper.map(userDto, User.class);
        userRepository.save(user);
    }

    @Override
    public UserDto getUserById(long id) {
        User user=userRepository.findById(id).orElse(null);
        return modelMapper.map(user,UserDto.class);

    }





}
