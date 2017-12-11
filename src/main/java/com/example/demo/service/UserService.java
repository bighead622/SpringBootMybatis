package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

/**
 * @author fkj
 * @date 2017/12/8 9:32
 **/
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    User findUserById(int id);
}
