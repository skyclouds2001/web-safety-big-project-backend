package org.fly.sky.dao;

import org.apache.ibatis.annotations.*;
import org.fly.sky.domain.Order;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Mapper
public interface OrderDao {

    @Select("select id, time, ticketId, amount, cost, customerId, note, createTimestamp, updateTimestamp from `order` where id = #{id}")
    Order getById(Integer id);

    @Select("select id, time, ticketId, amount, cost, customerId, note, createTimestamp, updateTimestamp from `order`")
    List<Order> getAll();

    @Insert("insert into `order` (time, ticketId, amount, cost, customerId, note, createTimestamp, updateTimestamp) values (#{time}, #{ticketId}, #{amount}, #{cost}, #{customerId}, #{note}, now(), now())")
    int save(Order order);

    @Update("update `order` set (time = #{time}, ticketId = #{ticketId}, amount = #{amount}, cost = #{cost}, customerId = #{customerId}, note = #{note}, updateTimestamp = now() where id = #{id}")
    int update(Order order);

    @Delete("delete from `order` where id = #{id}")
    int delete(Integer id);

}
