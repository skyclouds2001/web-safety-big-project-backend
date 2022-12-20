package org.fly.sky.service;

import org.fly.sky.domain.User;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public interface UserService {

    User getById(Integer id);

    List<User> getAll();

    boolean save(User user);

    boolean update(User user);

    boolean delete(Integer id);

}
