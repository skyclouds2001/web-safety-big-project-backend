package org.fly.sky.service.impl;

import org.fly.sky.dao.ScenerySpotDao;
import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenerySpotServiceImpl implements ScenerySpotService {

    @Autowired
    private ScenerySpotDao scenerySpotDao;

    @Override
    public ScenerySpot getById(Integer id) {
        return scenerySpotDao.getById(id);
    }

    @Override
    public List<ScenerySpot> getAll() {
        return scenerySpotDao.getAll();
    }

    @Override
    public boolean save(ScenerySpot scenerySpot) {
        return scenerySpotDao.save(scenerySpot) > 0;
    }

    @Override
    public boolean update(ScenerySpot scenerySpot) {
        return scenerySpotDao.update(scenerySpot) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return scenerySpotDao.delete(id) > 0;
    }
}
