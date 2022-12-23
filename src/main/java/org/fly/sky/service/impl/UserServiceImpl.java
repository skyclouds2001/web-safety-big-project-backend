package org.fly.sky.service.impl;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.dao.UserDao;
import org.fly.sky.domain.User;
import org.fly.sky.exception.CustomException;
import org.fly.sky.service.UserService;
import org.fly.sky.util.CheckValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 根据ID获取用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    @Override
    public Result getById(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        User res = userDao.getById(id);
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        res.setPassword("********");
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 获取全部用户列表
     *
     * @return 用户列表
     */
    @Override
    public Result getAll() {
        List<User> res = userDao.getAll();
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        res.forEach(v -> v.setPassword("********"));
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 是否操作成功
     */
    @Override
    public Result save(User user) {
        if (user.getName() == null ||
                user.getSex() == null ||
                user.getPhone() == null ||
                user.getIdentity() == null ||
                user.getType() == null ||
                user.getNickname() == null ||
                user.getPassword() == null)
            throw new CustomException(Code.MISSING_NECESSARY_PARAM);
        if (user.getName().trim().length() == 0 ||
                user.getPhone().trim().length() == 0 ||
                user.getIdentity().trim().length() == 0 ||
                user.getNickname().trim().length() == 0 ||
                user.getPassword().trim().length() == 0)
            throw new CustomException(Code.EMPTY_STRING_PARAM);
        if (user.getType() != 0 && user.getType() != 1 ||
                user.getSex() != 0 && user.getSex() != 1)
            throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        if (!CheckValidate.isValidatePhone(user.getPhone()))
            throw new CustomException(Code.INVALID_PHONE_FAILURE);
        if (!CheckValidate.isValidateEmail(user.getEmail()))
            throw new CustomException(Code.INVALID_EMAIL_FAILURE);
        if (user.getPassword().trim().length() < 8)
            throw new CustomException(Code.INVALID_LENGTH_PASSWORD_FAILURE);
        if (!Pattern.matches("^[a-z0-9A-Z]+$", user.getPassword()))
            throw new CustomException(Code.INVALID_CHARACTER_PASSWORD_FAILURE);
        if (!CheckValidate.isValidatePassword(user.getPassword()))
            throw new CustomException(Code.MISSING_CHARACTER_PASSWORD_FAILURE);

        int res = userDao.save(user);
        if (res == 0)
            throw new CustomException(Code.FAIL_INSERT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return 是否操作成功
     */
    @Override
    public Result update(User user) {
        if (user.getId() <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        User us = userDao.getById(user.getId());
        if (us == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);

        if (user.getName() != null) {
            if (user.getName().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else
                us.setName(user.getName());
        }
        if (user.getPhone() != null) {
            if (user.getPhone().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else if (CheckValidate.isValidatePhone(user.getPhone()))
                throw new CustomException(Code.INVALID_PHONE_FAILURE);
            else
                us.setPhone(user.getPhone());
        }
        if (user.getIdentity() != null) {
            if (user.getIdentity().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else
                us.setIdentity(user.getIdentity());
        }
        if (user.getNickname() != null) {
            if (user.getNickname().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else
                us.setNickname(user.getNickname());
        }
        if (user.getSex() != null) {
            if (user.getSex() == 0 || user.getSex() == 1)
                us.setSex(user.getSex());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }
        if (user.getType() != null)
            if (user.getType() == 0 || user.getType() == 1)
                us.setType(user.getType());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        if (user.getBirth() != null && user.getBirth().trim().length() > 0)
            us.setBirth(user.getBirth());
        if (user.getDesc() != null && user.getDesc().trim().length() > 0)
            us.setDesc(user.getDesc());
        if (user.getEmail() != null && user.getEmail().trim().length() > 0 && CheckValidate.isValidateEmail(user.getEmail()))
            us.setEmail(user.getEmail());
        if (user.getAddress() != null && user.getAddress().trim().length() > 0)
            us.setAddress(user.getAddress());

        int res = userDao.update(us);
        if (res == 0)
            throw new CustomException(Code.FAIL_UPDATE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 移除用户信息
     *
     * @param id 用户ID
     * @return 是否操作成功
     */
    @Override
    public Result delete(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        int res = userDao.delete(id);
        if (res == 0)
            throw new CustomException(Code.FAIL_DELETE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

}
