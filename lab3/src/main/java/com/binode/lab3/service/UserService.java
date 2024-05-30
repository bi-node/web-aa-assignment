package com.binode.lab3.service;


import com.binode.lab3.dto.PostDto;
import com.binode.lab3.dto.UserDto;


import java.util.List;

public interface UserService {
    public List<UserDto> getAllUser();
    public void insertUser(UserDto userDto);
    public UserDto getUserById(long id);
    public List<PostDto> getAllPostsByUserId(long id);
    public void deleteUser(long id);

}
