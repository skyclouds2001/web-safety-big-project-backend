package org.fly.sky.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fly.sky.domain.User;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Mapper
public interface AdminDao {

    @Select("select password from user where phone=#{phone}")
    User login(String phone);

    @Update("update user set password = #{password}, updateTimestamp = now() where id = #{id}")
    int reset(Integer id, String password);

}
