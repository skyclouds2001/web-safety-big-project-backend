package org.fly.sky.service.impl;

import org.fly.sky.dao.TicketDao;
import org.fly.sky.domain.Ticket;
import org.fly.sky.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    /**
     * 根据ID获取门票信息
     * @param id 门票ID
     * @return 门票信息
     */
    @Override
    public Ticket getById(Integer id) {
        return ticketDao.getById(id);
    }

    /**
     * 获取全部门票列表
     * @return 门票列表
     */
    @Override
    public List<Ticket> getAll() {
        return ticketDao.getAll();
    }

    /**
     * 保存门票信息
     * @param ticket 门票信息
     * @return 是否操作成功
     */
    @Override
    public boolean save(Ticket ticket) {
        return ticketDao.save(ticket) > 0;
    }

    /**
     * 更新门票信息
     * @param ticket 门票信息
     * @return 是否操作成功
     */
    @Override
    public boolean update(Ticket ticket) {
        return ticketDao.update(ticket) > 0;
    }

    /**
     * 移除门票信息
     * @param id 门票ID
     * @return 是否操作成功
     */
    @Override
    public boolean delete(Integer id) {
        return ticketDao.delete(id) > 0;
    }

}
