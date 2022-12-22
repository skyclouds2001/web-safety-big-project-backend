package org.fly.sky.service;

import org.fly.sky.common.Result;
import org.fly.sky.domain.ScenerySpot;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Transactional
public interface ScenerySpotService {

    Result getById(Integer id);

    Result getAll();

    Result save(ScenerySpot scenerySpot);

    Result update(ScenerySpot scenerySpot);

    Result delete(Integer id);

}
