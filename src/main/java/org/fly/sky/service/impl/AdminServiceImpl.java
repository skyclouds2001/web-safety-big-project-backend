package org.fly.sky.service.impl;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.dao.AdminDao;
import org.fly.sky.exception.CustomException;
import org.fly.sky.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    /**
     * 用户登录
     * @param phone    电话号码
     * @param password 密码
     * @return 执行结果
     */
    @Override
    public Result login(String phone, String password) {
        if (phone == null || password == null)
            throw new CustomException(Code.MISSING_NECESSARY_PARAM);
        if (phone.trim().length() == 0 || password.trim().length() == 0)
            throw new CustomException(Code.EMPTY_STRING_PARAM);

        String pw = adminDao.login(phone).getPassword();
        if (!pw.equals(password))
            throw new CustomException(Code.LOGIN_FAILURE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 用户重设密码
     * @param id 用户ID
     * @param oldPassword 原密码
     * @param newPassword 新密码
     * @return 执行结果
     */
    @Override
    public Result reset(Integer id, String phone, String oldPassword, String newPassword) {
        if (id == null || oldPassword == null || newPassword == null)
            throw new CustomException(Code.MISSING_NECESSARY_PARAM);
        if (oldPassword.trim().length() == 0 || newPassword.trim().length() == 0)
            throw new CustomException(Code.EMPTY_STRING_PARAM);
        if (oldPassword.equals(newPassword))
            throw new CustomException(Code.DUPLICATE_PASSWORD_FAILURE);

        String pw = adminDao.login(phone).getPassword();
        if (!oldPassword.equals(pw))
            throw new CustomException(Code.INCORRECT_PASSWORD_FAILURE);

        int res = adminDao.reset(id, newPassword);
        if (res == 0)
            throw new CustomException(Code.FAIL_UPDATE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

}
