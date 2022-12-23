package org.fly.sky.dao;

import org.apache.ibatis.annotations.*;
import org.fly.sky.domain.ScenerySpot;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Mapper
public interface ScenerySpotDao {

    @Select("select id, name, `desc`, area, createTimestamp, updateTimestamp from scenery_spot where id = #{id}")
    ScenerySpot getById(Integer id);

    @Select("select id, name, `desc`, area, createTimestamp, updateTimestamp from scenery_spot")
    List<ScenerySpot> getAll();

    @Insert("insert into scenery_spot (name, `desc`, area, createTimestamp, updateTimestamp) values (#{name}, #{desc}, #{area}, now(), now())")
    int save(ScenerySpot scenerySpot);

    @Update("update scenery_spot set name = #{name}, `desc` = #{desc}, area = #{area}, updateTimestamp = now() where id = #{id}")
    int update(ScenerySpot scenerySpot);

    @Delete("delete from scenery_spot where id = #{id}")
    int delete(Integer id);

}
