package com.binode.lab2new.controller;

import com.binode.lab2new.dto.PostDto;
import com.binode.lab2new.dto.UserDto;
import com.binode.lab2new.model.User;
import com.binode.lab2new.service.PostService;
import com.binode.lab2new.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //c.	POST	localhost:8080/users		 This should create and save a new user.
    @PostMapping
    public String createUser(@RequestBody UserDto user) {
        userService.insertUser(user);
        return "User created";
    }

//    a.	GET	localhost:8080/users		 This should retrieve all the users in the database.
    @GetMapping
    public List<UserDto> getAllUsers() {
        return  userService.getAllUser();
    }

    //b.	GET	localhost:8080/users/1		 This should retrieve the user with id = 1.
    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable Long id) {
       return userService.getUserById(id);

    }
//    d.	GET	localhost:8080/users/1/posts	 This should retrieve the posts of the user where id = 1.
//    @GetMapping("/{id}/posts")
//    public List<PostDto> findUserPosts(@PathVariable Long id) {
//       return userService.getAllPostByUser(id);
//    }

}
