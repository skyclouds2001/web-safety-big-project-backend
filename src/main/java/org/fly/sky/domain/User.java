package org.fly.sky.domain;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class User implements Cloneable {

    /** 用户ID */
    private Integer id;

    /** 用户姓名 */
    private String name;

    /** 用户性别 | 0-男 1-女 | 允许为空 */
    private Integer sex;

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
    private Integer type;

    /** 账号昵称 */
    private String nickname;

    /** 账号密码 */
    private String password;

    /** 客户创建时间戳 */
    private long createTimestamp;

    /** 客户更新时间戳 */
    private long updateTimestamp;

    private User() {}

    public User(Integer id, String name, Integer sex, String birth, String phone, String desc, String email, String identity, String address, Integer type, String nickname, String password, long createTimestamp, long updateTimestamp) {
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

    public static User createUser() {
        return new User();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User id(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public User sex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public User birth(String birth) {
        this.birth = birth;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User phone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public User desc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public User identity(String identity) {
        this.identity = identity;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User address(String address) {
        this.address = address;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public User type(Integer type) {
        this.type = type;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User password(String password) {
        this.password = password;
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

        if (getId().intValue() != user.getId().intValue()) return false;
        if (getSex().intValue() != user.getSex().intValue()) return false;
        if (getType().intValue() != user.getType().intValue()) return false;
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
        result = 31 * result + (int) (getCreateTimestamp() ^ (getCreateTimestamp() >>> 32));
        result = 31 * result + (int) (getUpdateTimestamp() ^ (getUpdateTimestamp() >>> 32));
        return result;
    }

    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            clone.name = String.valueOf(this.name);
            clone.birth = String.valueOf(this.birth);
            clone.phone = String.valueOf(this.phone);
            clone.desc = String.valueOf(this.desc);
            clone.email = String.valueOf(this.email);
            clone.identity = String.valueOf(this.identity);
            clone.address = String.valueOf(this.address);
            clone.nickname = String.valueOf(this.nickname);
            clone.password = String.valueOf(this.password);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
