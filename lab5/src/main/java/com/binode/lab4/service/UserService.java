package com.binode.lab4.service;


import com.binode.lab4.dto.PostDto;
import com.binode.lab4.dto.UserDto;


import java.util.List;

public interface UserService {
    public List<UserDto> getAllUser();
    public void insertUser(UserDto userDto);
    public UserDto getUserById(long id);
    public List<PostDto> getAllPostsByUserId(long id);
    public void deleteUser(long id);
    public List<UserDto> userWithNPosts(int n);
    public List<UserDto> userWithTitlePost(String title);
    public void methodThatThrowsException();
}
