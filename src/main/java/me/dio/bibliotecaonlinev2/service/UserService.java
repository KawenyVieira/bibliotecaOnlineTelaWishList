package me.dio.bibliotecaonlinev2.service;

import me.dio.bibliotecaonlinev2.domain.model.User;

public interface UserService {
    User findById(long id);
    User create(User userToCreate);
}
