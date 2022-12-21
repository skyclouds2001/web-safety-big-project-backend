package org.fly.sky.service;

import org.fly.sky.common.Result;
import org.fly.sky.domain.ScenerySpot;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public interface ScenerySpotService {

    Result getById(Integer id);

    Result getAll();

    Result save(ScenerySpot scenerySpot);

    Result update(ScenerySpot scenerySpot);

    Result delete(Integer id);

}
