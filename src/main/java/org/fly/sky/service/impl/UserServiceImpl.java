package org.fly.sky.service.impl;

import org.fly.sky.dao.UserDao;
import org.fly.sky.domain.User;
import org.fly.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 根据ID获取用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    /**
     * 获取全部用户列表
     * @return 用户列表
     */
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    /**
     * 保存用户信息
     * @param user 用户信息
     * @return 是否操作成功
     */
    @Override
    public boolean save(User user) {
        return userDao.save(user) > 0;
    }

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return 是否操作成功
     */
    @Override
    public boolean update(User user) {
        return userDao.update(user) > 0;
    }

    /**
     * 移除用户信息
     * @param id 用户ID
     * @return 是否操作成功
     */
    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id) > 0;
    }

}
