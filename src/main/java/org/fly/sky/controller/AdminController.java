package org.fly.sky.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.fly.sky.common.Result;
import org.fly.sky.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Tag(name = "admin", description = "管理接口")
@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Operation(summary = "用户登录")
    @PostMapping("/login")
    public Result login(@Parameter(description = "手机") @RequestParam String phone, @Parameter(description = "密码") @RequestParam String password) {
        return adminService.login(phone, password);
    }

    @Operation(summary = "重置密码")
    @PostMapping("/reset")
    public Result reset(@Parameter(description = "用户ID") @RequestParam Integer id, @Parameter(description = "手机") @RequestParam String phone, @Parameter(description = "旧密码") @RequestParam String oldPassword, @Parameter(description = "新密码") @RequestParam String newPassword) {
        return adminService.reset(id, phone, oldPassword, newPassword);
    }

}
