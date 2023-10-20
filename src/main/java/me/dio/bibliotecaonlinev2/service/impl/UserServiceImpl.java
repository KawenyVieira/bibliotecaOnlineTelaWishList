package me.dio.bibliotecaonlinev2.service.impl;

import me.dio.bibliotecaonlinev2.domain.model.User;
import me.dio.bibliotecaonlinev2.domain.repository.repository.UserRepository;
import me.dio.bibliotecaonlinev2.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        //Exception para caso nao tenha registro, criar um novo
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        //***
            return userRepository.save(userToCreate);
    }
}
