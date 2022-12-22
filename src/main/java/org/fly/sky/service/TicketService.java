package org.fly.sky.service;

import org.fly.sky.common.Result;
import org.fly.sky.domain.Ticket;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Transactional
public interface TicketService {

    Result getById(Integer id);

    Result getAll();

    Result save(Ticket ticket);

    Result update(Ticket ticket);

    Result delete(Integer id);

}
