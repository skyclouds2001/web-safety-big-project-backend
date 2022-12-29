package org.fly.sky.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Schema(description = "门票")
public class Ticket implements Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "门票ID")
    private Integer id;

    @Schema(description = "门票名称", requiredMode = RequiredMode.REQUIRED)
    private String name;

    @Schema(description = "门票描述", requiredMode = RequiredMode.NOT_REQUIRED)
    private String desc;

    @Schema(description = "门票类型 | 0-成人票 1-儿童票 2-其他", requiredMode = RequiredMode.REQUIRED)
    private Integer type;

    @Schema(description = "门票价格", requiredMode = RequiredMode.REQUIRED)
    private Integer price;

    @Schema(description = "所属景点ID", requiredMode = RequiredMode.REQUIRED)
    private Integer scenerySpotId;

    @Schema(description = "门票创建时间戳")
    private long createTimestamp;

    @Schema(description = "门票更新时间戳")
    private long updateTimestamp;

    private Ticket() {}

    public Ticket(Integer id, String name, String desc, Integer type, Integer price, Integer scenerySpotId, long createTimestamp, long updateTimestamp) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.price = price;
        this.scenerySpotId = scenerySpotId;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public static Ticket createTicket() {
        return new Ticket();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ticket id(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket name(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ticket desc(String desc) {
        this.desc = desc;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Ticket type(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Ticket price(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getScenerySpotId() {
        return scenerySpotId;
    }

    public void setScenerySpotId(Integer scenerySpotId) {
        this.scenerySpotId = scenerySpotId;
    }

    public Ticket scenerySpotId(Integer scenerySpotId) {
        this.scenerySpotId = scenerySpotId;
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

        if (getId().intValue() != ticket.getId().intValue()) return false;
        if (getType().intValue() != ticket.getType().intValue()) return false;
        if (getPrice().intValue() != ticket.getPrice().intValue()) return false;
        if (getScenerySpotId().intValue() != ticket.getScenerySpotId().intValue()) return false;
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

    @Override
    public Ticket clone() {
        try {
            Ticket clone = (Ticket) super.clone();
            clone.name = String.valueOf(this.name);
            clone.desc = String.valueOf(this.desc);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
