package org.fly.sky.controller;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
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
    public Result getSingleOrder(@PathVariable Integer id) {
        Order order = orderService.getById(id);
        return new Result(order != null ? Code.SUCCESS : Code.FAILURE, order);
    }

    @GetMapping
    public Result getAllOrder() {
        List<Order> orders = orderService.getAll();
        return new Result(orders != null ? Code.SUCCESS : Code.FAILURE, orders);
    }

    @PostMapping
    public Result addOrder(@RequestBody Order order) {
        return new Result(orderService.save(order) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @PutMapping
    public Result updateOrder(@RequestBody Order order) {
        return new Result(orderService.update(order) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @DeleteMapping
    public Result removeOrder(@RequestParam Integer id) {
        return new Result(orderService.delete(id) ? Code.SUCCESS : Code.FAILURE, null);
    }

}
