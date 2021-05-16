package com.liumq.blog.service;

import com.liumq.blog.po.User;

public interface UserService {
    User checkUser(String userName,String passWord);
}
