package org.fly.sky.service.impl;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.dao.TicketDao;
import org.fly.sky.domain.Ticket;
import org.fly.sky.exception.CustomException;
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
     *
     * @param id 门票ID
     * @return 门票信息
     */
    @Override
    public Result getById(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        Ticket res = ticketDao.getById(id);
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 获取全部门票列表
     *
     * @return 门票列表
     */
    @Override
    public Result getAll() {
        List<Ticket> res = ticketDao.getAll();
        if (res == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS, res);
    }

    /**
     * 保存门票信息
     *
     * @param ticket 门票信息
     * @return 是否操作成功
     */
    @Override
    public Result save(Ticket ticket) {
        if (ticket.getName() == null ||
                ticket.getType() == null ||
                ticket.getPrice() == null ||
                ticket.getScenerySpotId() == null)
            throw new CustomException(Code.MISSING_NECESSARY_PARAM);
        if (ticket.getName().trim().length() == 0)
            throw new CustomException(Code.EMPTY_STRING_PARAM);
        if (ticket.getPrice() < 0 ||
                ticket.getType() < 0 ||
                ticket.getType() > 2 ||
                ticket.getScenerySpotId() <= 0)
            throw new CustomException(Code.INCORRECT_RANGE_PARAM);

        int res = ticketDao.save(ticket);
        if (res == 0)
            throw new CustomException(Code.FAIL_INSERT_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 更新门票信息
     *
     * @param ticket 门票信息
     * @return 是否操作成功
     */
    @Override
    public Result update(Ticket ticket) {
        if (ticket.getId() <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        Ticket tic = ticketDao.getById(ticket.getId());
        if (tic == null)
            throw new CustomException(Code.FAIL_SELECT_SQL_OPERATE);

        if (ticket.getName() != null) {
            if (ticket.getName().trim().length() == 0)
                throw new CustomException(Code.EMPTY_STRING_PARAM);
            else
                tic.setName(ticket.getName());
        }
        if (ticket.getType() != null) {
            if (ticket.getType() >= 0 && ticket.getType() <= 2)
                tic.setType(ticket.getType());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }
        if (ticket.getPrice() != null) {
            if (ticket.getPrice() >= 0)
                tic.setPrice(ticket.getPrice());
            else
                throw new CustomException(Code.INCORRECT_RANGE_PARAM);
        }

        int res = ticketDao.update(tic);
        if (res == 0)
            throw new CustomException(Code.FAIL_UPDATE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

    /**
     * 移除门票信息
     *
     * @param id 门票ID
     * @return 是否操作成功
     */
    @Override
    public Result delete(Integer id) {
        if (id <= 0)
            throw new CustomException(Code.INCORRECT_INDEX_PARAM);

        int res = ticketDao.delete(id);
        if (res == 0)
            throw new CustomException(Code.FAIL_DELETE_SQL_OPERATE);
        return Result.createResult(Code.SUCCESS);
    }

}
