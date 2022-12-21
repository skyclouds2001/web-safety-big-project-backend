package org.fly.sky.controller;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.domain.Ticket;
import org.fly.sky.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/{id}")
    public Result getSingleTicket(@PathVariable Integer id) {
        return ticketService.getById(id);
    }

    @GetMapping
    public Result getAllTicket() {
        return ticketService.getAll();
    }

    @PostMapping
    public Result addTicket(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @PutMapping
    public Result updateTicket(@RequestBody Ticket ticket) {
        return ticketService.update(ticket);
    }

    @DeleteMapping
    public Result removeTicket(@RequestParam Integer id) {
        return ticketService.delete(id);
    }

}
