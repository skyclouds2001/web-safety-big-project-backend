package org.fly.sky.controller;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.domain.User;
import org.fly.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Result getSingleUser(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping
    public Result getAllUser() {
        return userService.getAll();
    }

    @PostMapping
    public Result addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping
    public Result updateUser(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping
    public Result removeUser(@RequestParam Integer id) {
        return userService.delete(id);
    }

}
