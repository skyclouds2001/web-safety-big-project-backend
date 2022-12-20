package org.fly.sky.domain;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class ScenerySpot {

    /** 景点ID */
    private int id;

    /** 景点名称 */
    private String name;

    /** 景点描述 | 允许为空 */
    private String desc;

    /** 景点地点 | 格式-省市县 */
    private String area;

    /** 景点创建时间戳 */
    private long createTimestamp;

    /** 景点更新时间戳 */
    private long updateTimestamp;

    public ScenerySpot(int id, String name, String desc, String area, long createTimestamp, long updateTimestamp) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
        return "ScenerySpot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", area='" + area + '\'' +
                ", createTimestamp=" + createTimestamp +
                ", updateTimestamp=" + updateTimestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScenerySpot that)) return false;

        if (getId() != that.getId()) return false;
        if (getCreateTimestamp() != that.getCreateTimestamp()) return false;
        if (getUpdateTimestamp() != that.getUpdateTimestamp()) return false;
        if (!getName().equals(that.getName())) return false;
        if (getDesc() != null ? !getDesc().equals(that.getDesc()) : that.getDesc() != null) return false;
        return getArea().equals(that.getArea());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (getDesc() != null ? getDesc().hashCode() : 0);
        result = 31 * result + getArea().hashCode();
        result = 31 * result + (int) (getCreateTimestamp() ^ (getCreateTimestamp() >>> 32));
        result = 31 * result + (int) (getUpdateTimestamp() ^ (getUpdateTimestamp() >>> 32));
        return result;
    }

}
