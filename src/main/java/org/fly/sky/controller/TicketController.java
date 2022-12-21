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
        Ticket ticket = ticketService.getById(id);
        return new Result(ticket != null ? Code.SUCCESS : Code.FAILURE, ticket);
    }

    @GetMapping
    public Result getAllTicket() {
        List<Ticket> tickets = ticketService.getAll();
        return new Result(tickets != null ? Code.SUCCESS : Code.FAILURE, tickets);
    }

    @PostMapping
    public Result addTicket(@RequestBody Ticket ticket) {
        return new Result(ticketService.save(ticket) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @PutMapping
    public Result updateTicket(@RequestBody Ticket ticket) {
        return new Result(ticketService.update(ticket) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @DeleteMapping
    public Result removeTicket(@RequestParam Integer id) {
        return new Result(ticketService.delete(id) ? Code.SUCCESS : Code.FAILURE, null);
    }

}
