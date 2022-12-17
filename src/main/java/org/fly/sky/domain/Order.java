package org.fly.sky.domain;

/**
 * 订单
 */
public class Order {

    /** 订单ID */
    private int id;

    /** 预定日期 */
    private int time;

    /** 所属门票ID */
    private int ticketId;

    /** 购买门票数量 */
    private int amount;

    /** 所属客户ID */
    private int customerId;

    /** 订单总金额 */
    private int cost;

    /** 订单备注 | 允许为空 */
    private String note;

    /** 订单创建时间戳 */
    private int createTimestamp;

    /** 订单更新时间戳 */
    private int updateTimestamp;

}
