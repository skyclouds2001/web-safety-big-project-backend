package org.fly.sky.domain;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class Order implements Cloneable {

    /** 订单ID */
    private int id;

    /** 预定日期 | 格式YYYYMMSS */
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
    private long createTimestamp;

    /** 订单更新时间戳 */
    private long updateTimestamp;

    private Order() {}

    public Order(int id, int time, int ticketId, int amount, int customerId, int cost, String note, long createTimestamp, long updateTimestamp) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order id(int id) {
        this.id = id;
        return this;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Order time(int time) {
        this.time = time;
        return this;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Order ticket(int ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Order amount(int amount) {
        this.amount = amount;
        return this;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Order customerId(int customerId) {
        this.customerId = customerId;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Order cost(int cost) {
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

        if (getId() != order.getId()) return false;
        if (getTime() != order.getTime()) return false;
        if (getTicketId() != order.getTicketId()) return false;
        if (getAmount() != order.getAmount()) return false;
        if (getCustomerId() != order.getCustomerId()) return false;
        if (getCost() != order.getCost()) return false;
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
