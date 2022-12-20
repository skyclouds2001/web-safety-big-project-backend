package org.fly.sky.service;

import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.domain.Ticket;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public interface TicketService {

    Ticket getById(Integer id);

    List<Ticket> getAll();

    boolean save(Ticket ticket);

    boolean update(Ticket ticket);

    boolean delete(Integer id);

}
