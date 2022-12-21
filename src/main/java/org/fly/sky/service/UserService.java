package org.fly.sky.service;

import org.fly.sky.common.Result;
import org.fly.sky.domain.User;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public interface UserService {

    Result getById(Integer id);

    Result getAll();

    Result save(User user);

    Result update(User user);

    Result delete(Integer id);

}
