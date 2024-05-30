package com.binode.lab2new.service;


import com.binode.lab2new.dto.PostDto;
import com.binode.lab2new.dto.UserDto;


import java.util.List;

public interface UserService {
    public List<UserDto> getAllUser();
    public void insertUser(UserDto userDto);
    public UserDto getUserById(long id);

}
