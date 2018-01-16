package com.qwisz.springsecurity.service;

import com.qwisz.springsecurity.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
