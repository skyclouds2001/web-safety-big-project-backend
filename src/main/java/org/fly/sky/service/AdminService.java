package org.fly.sky.service;

import org.fly.sky.common.Result;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Transactional
public interface AdminService {

    Result login(String phone, String password);

    Result reset(Integer id, String phone, String oldPassword, String newPassword);

}
