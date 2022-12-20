package org.fly.sky.controller;

import org.fly.sky.common.RequestCode;
import org.fly.sky.common.RequestResult;
import org.fly.sky.domain.Ticket;
import org.fly.sky.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/{id}")
    public RequestResult getSingleTicket(@PathVariable Integer id) {
        Ticket ticket = ticketService.getById(id);
        return new RequestResult(ticket != null ? RequestCode.SUCCESS : RequestCode.FAILURE, ticket);
    }

    @GetMapping
    public RequestResult getAllTicket() {
        List<Ticket> tickets = ticketService.getAll();
        return new RequestResult(tickets != null ? RequestCode.SUCCESS : RequestCode.FAILURE, tickets);
    }

    @PostMapping
    public RequestResult addTicket(@RequestBody Ticket ticket) {
        return new RequestResult(ticketService.save(ticket) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @PutMapping
    public RequestResult updateTicket(@RequestBody Ticket ticket) {
        return new RequestResult(ticketService.update(ticket) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @DeleteMapping
    public RequestResult removeTicket(@RequestParam Integer id) {
        return new RequestResult(ticketService.delete(id) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

}
