package org.fly.sky.service;

import org.fly.sky.domain.Order;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public interface OrderService {

    Order getById(Integer id);

    List<Order> getAll();

    boolean save(Order order);

    boolean update(Order order);

    boolean delete(Integer id);

}
