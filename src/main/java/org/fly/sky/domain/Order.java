package org.fly.sky.domain;

/**
 * 订单
 */
public class Order {

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
    private int createTimestamp;

    /** 订单更新时间戳 */
    private int updateTimestamp;

    public Order(int id, int time, int ticketId, int amount, int customerId, int cost, String note, int createTimestamp, int updateTimestamp) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(int createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public int getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(int updateTimestamp) {
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
        result = 31 * result + getCreateTimestamp();
        result = 31 * result + getUpdateTimestamp();
        return result;
    }

}
