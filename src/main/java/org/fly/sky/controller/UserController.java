package org.fly.sky.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.fly.sky.common.Result;
import org.fly.sky.domain.User;
import org.fly.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Tag(name = "user", description = "用户接口")
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "根据ID获取用户信息")
    @GetMapping("/{id}")
    public Result getSingleUser(@Parameter(description = "用户ID") @PathVariable Integer id) {
        return userService.getById(id);
    }

    @Operation(summary = "获取全部用户信息")
    @GetMapping
    public Result getAllUser() {
        return userService.getAll();
    }

    @Operation(summary = "添加用户")
    @PostMapping
    public Result addUser(@Parameter(description = "用户信息") @RequestBody User user) {
        return userService.save(user);
    }

    @Operation(summary = "更新用户")
    @PutMapping
    public Result updateUser(@Parameter(description = "用户信息") @RequestBody User user) {
        return userService.update(user);
    }

    @Operation(summary = "移除用户")
    @DeleteMapping
    public Result removeUser(@Parameter(description = "用户ID") @RequestParam Integer id) {
        return userService.delete(id);
    }

}
