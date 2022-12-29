package org.fly.sky.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "order", description = "订单接口")
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Operation(summary = "根据ID获取订单信息")
    @GetMapping("/{id}")
    public Result getSingleOrder(@Parameter(description = "订单ID") @PathVariable Integer id) {
        return orderService.getById(id);
    }

    @Operation(summary = "获取全部订单信息")
    @GetMapping
    public Result getAllOrder() {
        return orderService.getAll();
    }

    @Operation(summary = "添加订单")
    @PostMapping
    public Result addOrder(@Parameter(description = "订单信息") @RequestBody Order order) {
        return orderService.save(order);
    }

    @Operation(summary = "更新订单")
    @PutMapping
    public Result updateOrder(@Parameter(description = "订单信息") @RequestBody Order order) {
        return orderService.update(order);
    }

    @Operation(summary = "移除订单")
    @DeleteMapping
    public Result removeOrder(@Parameter(description = "订单ID") @RequestParam Integer id) {
        return orderService.delete(id);
    }

}
