package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
    void add(User user);
    void delete(long id);
    void change(User user, Set<Role> roles);
    List<User> listUsers();
    User findUserById(long id);
    public User findUserByName (String name);
}
