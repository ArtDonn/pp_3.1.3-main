package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {
    public Set<Role> findRoles(List<Long> roles);
    public List<Role> getAllRoles();
}
