package com.binode.lab4.controller;

import com.binode.lab4.dto.PostDto;
import com.binode.lab4.dto.UserDto;
import com.binode.lab4.service.UserService;
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
    @GetMapping("/{id}/posts")
    public List<PostDto> findUserPosts(@PathVariable Long id) {
       return userService.getAllPostsByUserId(id);
    }

    //delete user by ID
    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User with id " + id + " deleted";
    }

    // Display list of users with "N" posts
    @GetMapping(value = "/npost", params = {"noOfPost"})
    public List<UserDto> displayUsersWithMorePosts(@RequestParam(name = "noOfPost") int n) {
        return userService.userWithNPosts(n);
    }

    // Display list of users with posts that have a given title
    @GetMapping(value = "/npost", params = {"titleOfPost"})
    public List<UserDto> displayUsersWithGivenTitlePost(@RequestParam(name = "titleOfPost") String title) {
        return userService.userWithTitlePost(title);

    }

}
