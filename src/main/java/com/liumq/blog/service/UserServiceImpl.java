package com.liumq.blog.service;

import com.liumq.blog.dao.UserRepository;
import com.liumq.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String userName, String passWord) {
        User user = userRepository.findByUserNameAndPassword(userName, passWord);
        return user;
    }
}
