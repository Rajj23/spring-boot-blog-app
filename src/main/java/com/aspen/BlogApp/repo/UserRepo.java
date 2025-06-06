package com.aspen.BlogApp.repo;

import com.aspen.BlogApp.dto.UserRequestDto;
import com.aspen.BlogApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByName(String name);
}
