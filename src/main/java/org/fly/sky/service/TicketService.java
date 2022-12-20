package org.fly.sky.service;

import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.domain.Ticket;

import java.util.List;

public interface TicketService {

    Ticket getById(Integer id);

    List<Ticket> getAll();

    boolean save(Ticket ticket);

    boolean update(Ticket ticket);

    boolean delete(Integer id);

}
