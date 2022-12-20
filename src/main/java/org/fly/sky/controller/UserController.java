package org.fly.sky.controller;

import org.fly.sky.common.RequestCode;
import org.fly.sky.common.RequestResult;
import org.fly.sky.domain.User;
import org.fly.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public RequestResult getSingleUser(@PathVariable Integer id) {
        User user = userService.getById(id);
        return new RequestResult(user != null ? RequestCode.SUCCESS : RequestCode.FAILURE, user);
    }

    @GetMapping
    public RequestResult getAllUser() {
        List<User> users = userService.getAll();
        return new RequestResult(users != null ? RequestCode.SUCCESS : RequestCode.FAILURE, users);
    }

    @PostMapping
    public RequestResult addUser(@RequestBody User user) {
        return new RequestResult(userService.save(user) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @PutMapping
    public RequestResult updateUser(@RequestBody User user) {
        return new RequestResult(userService.update(user) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @DeleteMapping
    public RequestResult removeUser(@RequestParam Integer id) {
        return new RequestResult(userService.delete(id) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

}
