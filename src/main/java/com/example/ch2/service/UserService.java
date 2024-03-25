package com.example.ch2.service;

import com.example.ch2.bean.User;
import com.example.ch2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> userList(){
        return userMapper.userList();
    }

    public void save(User user){
        userMapper.save(user);
    }

    public int delete(Integer id){
        return userMapper.delete(id);
    }

    public User findUserById(int id){
        return userMapper.findUserById(id);
    }

    public int update(User user){
        return userMapper.update(user);
    }

}
