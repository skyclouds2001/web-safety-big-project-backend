package org.fly.sky.service;

import org.fly.sky.domain.User;

import java.util.List;

public interface UserService {

    User getById(Integer id);

    List<User> getAll();

    boolean save(User user);

    boolean update(User user);

    boolean delete(Integer id);

}
