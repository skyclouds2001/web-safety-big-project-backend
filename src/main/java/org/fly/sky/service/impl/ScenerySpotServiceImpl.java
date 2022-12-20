package org.fly.sky.service.impl;

import org.fly.sky.dao.ScenerySpotDao;
import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Service
public class ScenerySpotServiceImpl implements ScenerySpotService {

    @Autowired
    private ScenerySpotDao scenerySpotDao;

    /**
     * 根据ID获取景点信息
     * @param id 景点ID
     * @return 景点信息
     */
    @Override
    public ScenerySpot getById(Integer id) {
        return scenerySpotDao.getById(id);
    }

    /**
     * 获取全部景点列表
     * @return 景点列表
     */
    @Override
    public List<ScenerySpot> getAll() {
        return scenerySpotDao.getAll();
    }

    /**
     * 保存景点信息
     * @param scenerySpot 景点信息
     * @return 是否操作成功
     */
    @Override
    public boolean save(ScenerySpot scenerySpot) {
        return scenerySpotDao.save(scenerySpot) > 0;
    }

    /**
     * 更新景点信息
     * @param scenerySpot 景点信息
     * @return 是否操作成功
     */
    @Override
    public boolean update(ScenerySpot scenerySpot) {
        return scenerySpotDao.update(scenerySpot) > 0;
    }

    /**
     * 移除景点信息
     * @param id 景点ID
     * @return 是否操作成功
     */
    @Override
    public boolean delete(Integer id) {
        return scenerySpotDao.delete(id) > 0;
    }

}
