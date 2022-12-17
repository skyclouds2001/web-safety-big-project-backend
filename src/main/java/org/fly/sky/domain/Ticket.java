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

    /** 门票类型 | 0-成人票 1-儿童票 */
    private int type;

    /** 门票价格 */
    private int price;

    /** 所属景点ID */
    private int scenerySpotId;

    /** 门票创建时间戳 */
    private int createTimestamp;

    /** 门票更新时间戳 */
    private int updateTimestamp;

}
