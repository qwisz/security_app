package com.qwisz.springsecurity.dao;

import com.qwisz.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
