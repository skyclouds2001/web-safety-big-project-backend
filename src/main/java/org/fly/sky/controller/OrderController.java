package org.fly.sky.controller;

import org.fly.sky.common.Result;
import org.fly.sky.domain.Order;
import org.fly.sky.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return orderService.getById(id);
    }

    @GetMapping
    public Result getAllOrder() {
        return orderService.getAll();
    }

    @PostMapping
    public Result addOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping
    public Result updateOrder(@RequestBody Order order) {
        return orderService.update(order);
    }

    @DeleteMapping
    public Result removeOrder(@RequestParam Integer id) {
        return orderService.delete(id);
    }

}
