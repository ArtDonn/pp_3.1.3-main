package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

public interface UserService {
    void add(User user, Set<Role> roles);
    void delete(long id);
    void change(User user, Set<Role> roles);
    List<User> listUsers();
    User findUserById(long id);
    public User findUserByName (String name);
}
