package com.baktygaliyev.blog.services;

import com.baktygaliyev.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {

    User getUserById(UUID id);

}
