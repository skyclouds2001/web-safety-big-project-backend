package org.fly.sky.service.impl;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.dao.ScenerySpotDao;
import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.exception.CustomException;
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
    public Result getById(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        ScenerySpot res = scenerySpotDao.getById(id);
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 获取全部景点列表
     * @return 景点列表
     */
    @Override
    public Result getAll() {
        List<ScenerySpot> res = scenerySpotDao.getAll();
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 保存景点信息
     * @param scenerySpot 景点信息
     * @return 是否操作成功
     */
    @Override
    public Result save(ScenerySpot scenerySpot) {
        if (scenerySpot.getName() == null ||
                scenerySpot.getArea() == null)
            throw new CustomException(Code.MISSING_NECESSARY_PARAM);
        if (scenerySpot.getName().trim().length() == 0 ||
                scenerySpot.getArea().trim().length() == 0)
            throw new CustomException(Code.EMPTY_STRING_PARAM);

        int res = scenerySpotDao.save(scenerySpot);
        if (res == 0)
            throw new CustomException(Code.FAIL_INSERT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 更新景点信息
     * @param scenerySpot 景点信息
     * @return 是否操作成功
     */
    @Override
    public Result update(ScenerySpot scenerySpot) {
        if (scenerySpot.getId() <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        ScenerySpot spot = scenerySpotDao.getById(scenerySpot.getId());
        if (spot == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);

        if (scenerySpot.getName() != null) {
            if (scenerySpot.getName().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else
                spot.setName(scenerySpot.getName());
        }
        if (scenerySpot.getArea() != null) {
            if (scenerySpot.getArea().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else
                spot.setArea(scenerySpot.getArea());
        }
        if (scenerySpot.getDesc() != null)
            spot.setDesc(scenerySpot.getDesc());

        int res = scenerySpotDao.update(spot);
        if (res == 0)
            throw new CustomException(Code.FAIL_UPDATE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 移除景点信息
     * @param id 景点ID
     * @return 是否操作成功
     */
    @Override
    public Result delete(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        int res = scenerySpotDao.delete(id);
        if (res == 0)
            throw new CustomException(Code.FAIL_DELETE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

}
