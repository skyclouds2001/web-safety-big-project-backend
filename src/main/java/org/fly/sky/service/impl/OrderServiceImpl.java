package org.fly.sky.service.impl;

import org.fly.sky.dao.OrderDao;
import org.fly.sky.domain.Order;
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
     * @param id 订单ID
     * @return 订单信息
     */
    @Override
    public Order getById(Integer id) {
        return orderDao.getById(id);
    }

    /**
     * 获取全部订单列表
     * @return 订单列表
     */
    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }

    /**
     * 保存订单信息
     * @param order 订单信息
     * @return 是否操作成功
     */
    @Override
    public boolean save(Order order) {
        return orderDao.save(order) > 0;
    }

    /**
     * 更新订单信息
     * @param order 订单信息
     * @return 是否操作成功
     */
    @Override
    public boolean update(Order order) {
        return orderDao.update(order) > 0;
    }

    /**
     * 移除订单信息
     * @param id 订单ID
     * @return 是否操作成功
     */
    @Override
    public boolean delete(Integer id) {
        return orderDao.delete(id) > 0;
    }

}
