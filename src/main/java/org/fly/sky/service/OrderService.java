package org.fly.sky.service;

import org.fly.sky.domain.Order;

import java.util.List;

public interface OrderService {

    Order getById(Integer id);

    List<Order> getAll();

    boolean save(Order order);

    boolean update(Order order);

    boolean delete(Integer id);

}
