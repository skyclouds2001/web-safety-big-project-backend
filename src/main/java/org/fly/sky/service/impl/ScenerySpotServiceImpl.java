package org.fly.sky.service.impl;

import org.fly.sky.dao.ScenerySpotDao;
import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScenerySpotServiceImpl implements ScenerySpotService {

    @Autowired
    private ScenerySpotDao scenerySpotDao;

}
