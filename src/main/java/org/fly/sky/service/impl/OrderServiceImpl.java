package org.fly.sky.service.impl;

import org.fly.sky.dao.OrderDao;
import org.fly.sky.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

}
