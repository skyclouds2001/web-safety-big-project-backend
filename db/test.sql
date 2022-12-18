USE DEV;

DELETE FROM scenery_spot WHERE TRUE;

INSERT INTO scenery_spot (name, `desc`, area, createTimestamp, updateTimestamp) VALUES ('黄山', 'huang-shan', '安徽省黄山市', now(), now());

DELETE FROM ticket WHERE TRUE;

INSERT INTO ticket (name, `desc`, type, price, scenerySpotId, createTimestamp, updateTimestamp) VALUES ('成人票', 'person', 0, 100, 1, now(), now());

DELETE FROM `order` WHERE TRUE;

INSERT INTO `order` (time, ticketId, amount, cost, customerId, note, createTimestamp, updateTimestamp) VALUES ('20221201', 1, 1, 100, 1, 'order', now(), now());

DELETE FROM user WHERE TRUE;

INSERT INTO user (name, sex, birth, phone, email, identity, address, type, nickname, password, `desc`, createTimestamp, updateTimestamp) VALUES ('张三', 0, '20200101', '13888888888', 'zhangsan@666.com', '331082202001010019', '河南省郑州市中原区', 1, 'zhang', 'zhang', 'zhang-san', now(), now());
