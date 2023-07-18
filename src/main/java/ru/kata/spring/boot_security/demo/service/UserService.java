package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.Collection;
import java.util.List;

public interface UserService {
    Collection<User> findAll();

    void delete(User user);

    void save(User user);

    User findOne(Long id);
}
