DROP DATABASE IF EXISTS dev;
CREATE DATABASE dev;

USE dev;

DROP TABLE IF EXISTS scenery_spot;

CREATE TABLE scenery_spot  (
     `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '景点ID',
     `name` varchar(255) NOT NULL COMMENT '景点名称',
     `desc` varchar(255) NULL COMMENT '景点描述',
     `area` varchar(255) NOT NULL COMMENT '景点地点 格式-省市县',
     `createTimestamp` bigint UNSIGNED NOT NULL COMMENT '景点创建时间戳',
     `updateTimestamp` bigint UNSIGNED NOT NULL COMMENT '景点更新时间戳',
     PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS ticket;

CREATE TABLE ticket  (
    `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '门票ID',
    `name` varchar(255) NOT NULL COMMENT '门票名称',
    `desc` varchar(255) NULL COMMENT '门票描述',
    `type` tinyint UNSIGNED NOT NULL COMMENT '门票类型 0-成人票 1-儿童票 2-其他' CHECK ( type IN (0, 1, 2) ),
    `price` decimal(10, 2) UNSIGNED NOT NULL COMMENT '门票价格',
    `scenerySpotId` int UNSIGNED NOT NULL COMMENT '所属景点ID',
    `createTimestamp` bigint UNSIGNED NOT NULL COMMENT '门票创建时间戳',
    `updateTimestamp` bigint UNSIGNED NOT NULL COMMENT '门票更新时间戳',
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order`  (
     `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '订单ID',
     `time` int UNSIGNED NOT NULL COMMENT '预定日期 格式YYYYMMSS' CHECK ( time >= 10000000 AND time <= 99999999 ),
     `ticketId` int UNSIGNED NOT NULL COMMENT '所属门票ID',
     `amount` int UNSIGNED NOT NULL COMMENT '购买门票数量',
     `cost` decimal(10, 2) UNSIGNED NOT NULL COMMENT '订单总金额',
     `customerId` int UNSIGNED NOT NULL COMMENT '所属客户ID',
     `note` varchar(255) NULL COMMENT '订单备注',
     `createTimestamp` bigint UNSIGNED NOT NULL COMMENT '订单创建时间戳',
     `updateTimestamp` bigint UNSIGNED NOT NULL COMMENT '订单更新时间戳',
     PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS user;

CREATE TABLE user  (
     `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户ID',
     `name` varchar(255) NOT NULL COMMENT '用户姓名',
     `sex` tinyint NULL COMMENT '用户性别' CHECK ( sex in (0, 1) ),
     `birth` varchar(255) NULL COMMENT '用户出生日期',
     `phone` varchar(255) NOT NULL COMMENT '用户电话号码',
     `desc` varchar(255) NULL COMMENT '门票描述',
     `email` varchar(255) NULL COMMENT '用户邮箱',
     `identity` varchar(255) NOT NULL COMMENT '用户身份证号码',
     `address` varchar(255) NULL COMMENT '用户居住地址',
     `type` tinyint UNSIGNED NOT NULL COMMENT '用户类型 0-普通用户 1-管理员' CHECK ( type IN (0, 1) ),
     `nickname` varchar(255) NOT NULL COMMENT '账号昵称',
     `password` varchar(255) NOT NULL COMMENT '账号密码',
     `createTimestamp` bigint UNSIGNED NOT NULL COMMENT '客户创建时间戳',
     `updateTimestamp` bigint UNSIGNED NOT NULL COMMENT '客户更新时间戳',
     UNIQUE (phone, identity),
     PRIMARY KEY (`id`)
);
