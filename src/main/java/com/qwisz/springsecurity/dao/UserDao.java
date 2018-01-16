package com.qwisz.springsecurity.dao;

import com.qwisz.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
