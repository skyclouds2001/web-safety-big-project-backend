package org.fly.sky.dao;

import org.apache.ibatis.annotations.*;
import org.fly.sky.domain.User;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User getById(Integer id);

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user (name, sex, birth, phone, email, identity, address, type, nickname, password, `desc`, createTimestamp, updateTimestamp) values (#{name}, #{sex}, #{birth}, #{phone}, #{email}, #{identity}, #{address}, #{type}, #{nickname}, #{password}, #{desc}, now(), now())")
    int save(User user);

    @Update("update user set name = #{name}, sex = #{sex}, birth = #{birth}, phone = #{phone}, email = #{email}, identity = #{identity}, address = #{address}, type = #{type}, nickname = #{nickname}, password = #{password}, `desc` = #{desc}, updateTimestamp = now() where id = #{id}")
    int update(User user);

    @Delete("delete from user where id = #{id}")
    int delete(Integer id);


}
