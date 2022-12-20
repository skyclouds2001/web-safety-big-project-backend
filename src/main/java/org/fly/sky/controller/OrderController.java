package org.fly.sky.controller;

import org.fly.sky.common.RequestCode;
import org.fly.sky.common.RequestResult;
import org.fly.sky.domain.Order;
import org.fly.sky.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public RequestResult getSingleOrder(@PathVariable Integer id) {
        Order order = orderService.getById(id);
        return new RequestResult(order != null ? RequestCode.SUCCESS : RequestCode.FAILURE, order);
    }

    @GetMapping
    public RequestResult getAllOrder() {
        List<Order> orders = orderService.getAll();
        return new RequestResult(orders != null ? RequestCode.SUCCESS : RequestCode.FAILURE, orders);
    }

    @PostMapping
    public RequestResult addOrder(@RequestBody Order order) {
        return new RequestResult(orderService.save(order) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @PutMapping
    public RequestResult updateOrder(@RequestBody Order order) {
        return new RequestResult(orderService.update(order) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @DeleteMapping
    public RequestResult removeOrder(@RequestParam Integer id) {
        return new RequestResult(orderService.delete(id) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

}
