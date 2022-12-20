package org.fly.sky.domain;

/**
 * 门票
 */
public class Ticket {

    /** 门票ID */
    private int id;

    /** 门票名称 */
    private String name;

    /** 门票描述 | 允许为空 */
    private String desc;

    /** 门票类型 | 0-成人票 1-儿童票 2-其他 */
    private int type;

    /** 门票价格 */
    private int price;

    /** 所属景点ID */
    private int scenerySpotId;

    /** 门票创建时间戳 */
    private long createTimestamp;

    /** 门票更新时间戳 */
    private long updateTimestamp;

    public Ticket(int id, String name, String desc, int type, int price, int scenerySpotId, long createTimestamp, long updateTimestamp) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.price = price;
        this.scenerySpotId = scenerySpotId;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScenerySpotId() {
        return scenerySpotId;
    }

    public void setScenerySpotId(int scenerySpotId) {
        this.scenerySpotId = scenerySpotId;
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
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", scenerySpotId=" + scenerySpotId +
                ", createTimestamp=" + createTimestamp +
                ", updateTimestamp=" + updateTimestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;

        if (getId() != ticket.getId()) return false;
        if (getType() != ticket.getType()) return false;
        if (getPrice() != ticket.getPrice()) return false;
        if (getScenerySpotId() != ticket.getScenerySpotId()) return false;
        if (getCreateTimestamp() != ticket.getCreateTimestamp()) return false;
        if (getUpdateTimestamp() != ticket.getUpdateTimestamp()) return false;
        if (!getName().equals(ticket.getName())) return false;
        return getDesc() != null ? getDesc().equals(ticket.getDesc()) : ticket.getDesc() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (getDesc() != null ? getDesc().hashCode() : 0);
        result = 31 * result + getType();
        result = 31 * result + getPrice();
        result = 31 * result + getScenerySpotId();
        result = 31 * result + (int) (getCreateTimestamp() ^ (getCreateTimestamp() >>> 32));
        result = 31 * result + (int) (getUpdateTimestamp() ^ (getUpdateTimestamp() >>> 32));
        return result;
    }

}
