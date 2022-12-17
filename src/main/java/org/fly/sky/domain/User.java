package org.fly.sky.domain;

/**
 * 用户
 */
public class User {

    /** 用户ID */
    private int id;

    /** 用户姓名 */
    private String name;

    /** 用户性别 | 0-男 1-女 | 允许为空 */
    private int sex;

    /** 用户出生日期 | 允许为空 */
    private String birth;

    /** 用户电话号码 */
    private String phone;

    /** 用户个人简介 | 允许为空 */
    private String desc;

    /** 用户邮箱 | 允许为空 */
    private String email;

    /** 用户身份证号码 */
    private String identity;

    /** 用户居住地址 */
    private String address;

    /** 用户类型 0-普通用户 1-管理员 */
    private int type;

    /** 账号昵称 */
    private String nickname;

    /** 账号密码 */
    private String password;

    /** 客户创建时间戳 */
    private int createTimestamp;

    /** 客户更新时间戳 */
    private int updateTimestamp;

}
