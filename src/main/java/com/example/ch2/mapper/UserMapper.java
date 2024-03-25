package com.example.ch2.mapper;

import com.example.ch2.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> userList();

    void save(User user);

    int delete(Integer id);

    User findUserById(int id);

    int update(User user);

}
