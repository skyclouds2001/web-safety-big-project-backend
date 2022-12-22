package org.fly.sky.domain;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class ScenerySpot implements Cloneable {

    /** 景点ID */
    private Integer id;

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

    private ScenerySpot() {}

    public ScenerySpot(Integer id, String name, String desc, String area, long createTimestamp, long updateTimestamp) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.area = area;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public static ScenerySpot createScenerySpot() {
        return new ScenerySpot();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ScenerySpot id(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScenerySpot name(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ScenerySpot desc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ScenerySpot area(String area) {
        this.area = area;
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

        if (getId().intValue() != that.getId().intValue()) return false;
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

    @Override
    public ScenerySpot clone() {
        try {
            ScenerySpot clone = (ScenerySpot) super.clone();
            clone.name = String.valueOf(this.name);
            clone.desc = String.valueOf(this.desc);
            clone.area = String.valueOf(this.area);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
