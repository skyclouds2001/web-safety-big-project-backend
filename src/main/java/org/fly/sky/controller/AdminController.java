package org.fly.sky.controller;

import org.fly.sky.common.Result;
import org.fly.sky.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public Result login(@RequestParam String phone, @RequestParam String password) {
        return adminService.login(phone, password);
    }

    @PostMapping
    public Result reset(@RequestParam Integer id, @RequestParam String phone, @RequestParam String oldPassword, @RequestParam String newPassword) {
        return adminService.reset(id, phone, oldPassword, newPassword);
    }
}
