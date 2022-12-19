package org.fly.sky.service;

import org.fly.sky.domain.ScenerySpot;

import java.util.List;

public interface ScenerySpotService {

    ScenerySpot getById(Integer id);

    List<ScenerySpot> getAll();

    boolean save(ScenerySpot scenerySpot);

    boolean update(ScenerySpot scenerySpot);

    boolean delete(Integer id);

}
