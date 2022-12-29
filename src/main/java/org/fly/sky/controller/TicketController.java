package org.fly.sky.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.fly.sky.common.Result;
import org.fly.sky.domain.Ticket;
import org.fly.sky.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Tag(name = "ticket", description = "门票接口")
@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Operation(summary = "根据ID获取门票信息")
    @GetMapping("/{id}")
    public Result getSingleTicket(@Parameter(description = "门票ID") @PathVariable Integer id) {
        return ticketService.getById(id);
    }

    @Operation(summary = "获取全部门票信息")
    @GetMapping
    public Result getAllTicket() {
        return ticketService.getAll();
    }

    @Operation(summary = "添加门票")
    @PostMapping
    public Result addTicket(@Parameter(description = "门票信息") @RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @Operation(summary = "更新门票")
    @PutMapping
    public Result updateTicket(@Parameter(description = "门票信息") @RequestBody Ticket ticket) {
        return ticketService.update(ticket);
    }

    @Operation(summary = "移除门票")
    @DeleteMapping
    public Result removeTicket(@Parameter(description = "门票ID") @RequestParam Integer id) {
        return ticketService.delete(id);
    }

}
