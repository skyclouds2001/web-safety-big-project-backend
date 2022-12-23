package org.fly.sky.service.impl;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.dao.OrderDao;
import org.fly.sky.domain.Order;
import org.fly.sky.exception.CustomException;
import org.fly.sky.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    /**
     * 根据ID获取订单信息
     *
     * @param id 订单ID
     * @return 订单信息
     */
    @Override
    public Result getById(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        Order res = orderDao.getById(id);
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 获取全部订单列表
     *
     * @return 订单列表
     */
    @Override
    public Result getAll() {
        List<Order> res = orderDao.getAll();
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 保存订单信息
     *
     * @param order 订单信息
     * @return 是否操作成功
     */
    @Override
    public Result save(Order order) {
        if (order.getTime() == null ||
                order.getTicketId() == null ||
                order.getAmount() == null ||
                order.getCustomerId() == null ||
                order.getCost() == null)
            throw new CustomException(Code.MISSING_NECESSARY_PARAM);
        if (order.getTime() < 10000000 ||
                order.getTime() > 99999999 ||
                order.getTicketId() < 0 ||
                order.getAmount() < 0 ||
                order.getCustomerId() < 0 ||
                order.getCost() < 0)
            throw new CustomException(Code.INCORRECT_RANGE_PARAM);

        int res = orderDao.save(order);
        if (res == 0)
            throw new CustomException(Code.FAIL_INSERT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 更新订单信息
     *
     * @param order 订单信息
     * @return 是否操作成功
     */
    @Override
    public Result update(Order order) {
        if (order.getId() < 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        Order ord = orderDao.getById(order.getId());
        if (ord == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);

        if (order.getTime() != null) {
            if (order.getTime() >= 10000000 || order.getTime() <= 99999999)
                ord.setTime(order.getTime());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }
        if (order.getAmount() != null) {
            if (order.getAmount() > 0)
                ord.setAmount(order.getAmount());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }
        if (order.getCustomerId() != null) {
            if (order.getCustomerId() > 0)
                ord.setCustomerId(order.getCustomerId());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }
        if (order.getCost() != null) {
            if (order.getCost() > 0)
                ord.setCost(order.getCost());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }

        int res = orderDao.update(order);
        if (res == 0)
            throw new CustomException(Code.FAIL_UPDATE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 移除订单信息
     *
     * @param id 订单ID
     * @return 是否操作成功
     */
    @Override
    public Result delete(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        int res = orderDao.delete(id);
        if (res == 0)
            throw new CustomException(Code.FAIL_DELETE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

}
