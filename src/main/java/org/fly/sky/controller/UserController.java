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
        User user = userService.getById(id);
        return new Result(user != null ? Code.SUCCESS : Code.FAILURE, user);
    }

    @GetMapping
    public Result getAllUser() {
        List<User> users = userService.getAll();
        return new Result(users != null ? Code.SUCCESS : Code.FAILURE, users);
    }

    @PostMapping
    public Result addUser(@RequestBody User user) {
        return new Result(userService.save(user) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @PutMapping
    public Result updateUser(@RequestBody User user) {
        return new Result(userService.update(user) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @DeleteMapping
    public Result removeUser(@RequestParam Integer id) {
        return new Result(userService.delete(id) ? Code.SUCCESS : Code.FAILURE, null);
    }

}
