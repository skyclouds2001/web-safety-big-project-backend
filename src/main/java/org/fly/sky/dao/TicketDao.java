package org.fly.sky.dao;

import org.apache.ibatis.annotations.*;
import org.fly.sky.domain.Ticket;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Mapper
public interface TicketDao {

    @Select("select id, name, `desc`, type, price, scenerySpotId, createTimestamp, updateTimestamp from ticket where id = #{id}")
    Ticket getById(Integer id);

    @Select("select id, name, `desc`, type, price, scenerySpotId, createTimestamp, updateTimestamp from ticket")
    List<Ticket> getAll();

    @Insert("insert into ticket (name, `desc`, type, price, scenerySpotId, createTimestamp, updateTimestamp) values (#{name}, #{desc}, #{type}, #{price}, #{scenerySpotId}, now(), now())")
    int save(Ticket ticket);

    @Update("update ticket set name = #{name}, `desc` = #{desc}, type = #{type}, price = #{price}, scenerySpotId = #{scenerySpotId}, updateTimestamp = now() where id = #{id}")
    int update(Ticket ticket);

    @Delete("delete from ticket where id = #{id}")
    int delete(Integer id);

}
