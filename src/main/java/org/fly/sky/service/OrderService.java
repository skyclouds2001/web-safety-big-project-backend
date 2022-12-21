package org.fly.sky.service;

import org.fly.sky.common.Result;
import org.fly.sky.domain.Order;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public interface OrderService {

    Result getById(Integer id);

    Result getAll();

    Result save(Order order);

    Result update(Order order);

    Result delete(Integer id);

}
