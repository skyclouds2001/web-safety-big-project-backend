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

    /** 用户居住地址 | 允许为空 */
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

    public User(int id, String name, int sex, String birth, String phone, String desc, String email, String identity, String address, int type, String nickname, String password, int createTimestamp, int updateTimestamp) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.phone = phone;
        this.desc = desc;
        this.email = email;
        this.identity = identity;
        this.address = address;
        this.type = type;
        this.nickname = nickname;
        this.password = password;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birth='" + birth + '\'' +
                ", phone='" + phone + '\'' +
                ", desc='" + desc + '\'' +
                ", email='" + email + '\'' +
                ", identity='" + identity + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", createTimestamp=" + createTimestamp +
                ", updateTimestamp=" + updateTimestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        if (getId() != user.getId()) return false;
        if (getSex() != user.getSex()) return false;
        if (getType() != user.getType()) return false;
        if (getCreateTimestamp() != user.getCreateTimestamp()) return false;
        if (getUpdateTimestamp() != user.getUpdateTimestamp()) return false;
        if (!getName().equals(user.getName())) return false;
        if (getBirth() != null ? !getBirth().equals(user.getBirth()) : user.getBirth() != null) return false;
        if (!getPhone().equals(user.getPhone())) return false;
        if (getDesc() != null ? !getDesc().equals(user.getDesc()) : user.getDesc() != null) return false;
        if (getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null) return false;
        if (!getIdentity().equals(user.getIdentity())) return false;
        if (getAddress() != null ? !getAddress().equals(user.getAddress()) : user.getAddress() != null) return false;
        if (!getNickname().equals(user.getNickname())) return false;
        return getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getSex();
        result = 31 * result + (getBirth() != null ? getBirth().hashCode() : 0);
        result = 31 * result + getPhone().hashCode();
        result = 31 * result + (getDesc() != null ? getDesc().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + getIdentity().hashCode();
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + getType();
        result = 31 * result + getNickname().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getCreateTimestamp();
        result = 31 * result + getUpdateTimestamp();
        return result;
    }

}
