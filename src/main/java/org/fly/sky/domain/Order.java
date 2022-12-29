package org.fly.sky.domain;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class Order implements Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Integer id;

    /** 预定日期 | 格式YYYYMMSS */
    private Integer time;

    /** 所属门票ID */
    private Integer ticketId;

    /** 购买门票数量 */
    private Integer amount;

    /** 所属客户ID */
    private Integer customerId;

    /** 订单总金额 */
    private Integer cost;

    /** 订单备注 | 允许为空 */
    private String note;

    /** 订单创建时间戳 */
    private long createTimestamp;

    /** 订单更新时间戳 */
    private long updateTimestamp;

    private Order() {}

    public Order(Integer id, Integer time, Integer ticketId, Integer amount, Integer customerId, Integer cost, String note, long createTimestamp, long updateTimestamp) {
        this.id = id;
        this.time = time;
        this.ticketId = ticketId;
        this.amount = amount;
        this.customerId = customerId;
        this.cost = cost;
        this.note = note;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public static Order createOrder() {
        return new Order();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order id(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Order time(Integer time) {
        this.time = time;
        return this;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Order ticket(Integer ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Order amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Order customerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Order cost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Order note(String note) {
        this.note = note;
        return this;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", time=" + time +
                ", ticketId=" + ticketId +
                ", amount=" + amount +
                ", customerId=" + customerId +
                ", cost=" + cost +
                ", note='" + note + '\'' +
                ", createTimestamp=" + createTimestamp +
                ", updateTimestamp=" + updateTimestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        if (getId().intValue() != order.getId().intValue()) return false;
        if (getTime().intValue() != order.getTime().intValue()) return false;
        if (getTicketId().intValue() != order.getTicketId().intValue()) return false;
        if (getAmount().intValue() != order.getAmount().intValue()) return false;
        if (getCustomerId().intValue() != order.getCustomerId().intValue()) return false;
        if (getCost().intValue() != order.getCost().intValue()) return false;
        if (getCreateTimestamp() != order.getCreateTimestamp()) return false;
        if (getUpdateTimestamp() != order.getUpdateTimestamp()) return false;
        return getNote() != null ? getNote().equals(order.getNote()) : order.getNote() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getTime();
        result = 31 * result + getTicketId();
        result = 31 * result + getAmount();
        result = 31 * result + getCustomerId();
        result = 31 * result + getCost();
        result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
        result = 31 * result + (int) (getCreateTimestamp() ^ (getCreateTimestamp() >>> 32));
        result = 31 * result + (int) (getUpdateTimestamp() ^ (getUpdateTimestamp() >>> 32));
        return result;
    }

    @Override
    public Order clone() {
        try {
            Order clone = (Order) super.clone();
            clone.note = String.valueOf(this.note);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
