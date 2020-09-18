# springboot_mybatis
大数据报表展示
转存的数据库jd_shopping.sql内容如下:

/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : jd_shopping

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2019-12-26 22:31:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `goods_info`
-- ----------------------------
DROP TABLE IF EXISTS `goods_info`;
CREATE TABLE `goods_info` (
  `goods_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(100) DEFAULT NULL,
  `goods_price` double DEFAULT NULL,
  `goods_num` int(11) DEFAULT NULL,
  `goods_type` char(1) DEFAULT NULL,
  `create_id` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`goods_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_info
-- ----------------------------
INSERT INTO `goods_info` VALUES ('1', '中兴nubia', '1999', '1000', '1', null, null, null, null);
INSERT INTO `goods_info` VALUES ('2', '三星s8', '1500', '100', '1', null, null, null, null);
INSERT INTO `goods_info` VALUES ('3', '一加五', '3999', '1000', '1', null, null, null, null);
INSERT INTO `goods_info` VALUES ('4', '卫龙', '10', '1000', '2', null, null, null, null);
INSERT INTO `goods_info` VALUES ('5', '三只松鼠', '25', '1000', '2', null, null, null, null);
INSERT INTO `goods_info` VALUES ('6', '法式面包', '15', '1000', '2', null, null, null, null);

-- ----------------------------
-- Table structure for `order_details_info`
-- ----------------------------
DROP TABLE IF EXISTS `order_details_info`;
CREATE TABLE `order_details_info` (
  `order_details_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `goods_num` int(11) DEFAULT '1',
  `goods_price` double DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_details_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_details_info
-- ----------------------------
INSERT INTO `order_details_info` VALUES ('1', '201912101', '1', '1', '100', null, null);
INSERT INTO `order_details_info` VALUES ('2', '201912101', '2', '1', '111', null, null);

-- ----------------------------
-- Table structure for `order_info`
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `pay_money` double DEFAULT NULL,
  `order_status` char(1) DEFAULT '1',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=325 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('35', '201912160913425', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('36', '201912160914035', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('37', '201912160918105', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('38', '201912160935495', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('39', '201912160936225', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('40', '201912160936435', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('41', '201912160939325', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('42', '201912160946355', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('43', '201912160951415', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('44', '201912162129055', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('45', '201912170056525', '3', null, '1', null, null);
INSERT INTO `order_info` VALUES ('46', '201912170112465', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('47', '201912170114275', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('48', '201912170115595', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('49', '201912170116035', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('50', '201912170119235', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('51', '201912171054525', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('52', '201912171115117', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('53', '201912171132547', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('54', '201912171142455', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('55', '201912171451455', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('56', '201912171457235', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('57', '201912171707315', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('58', '201912181434299', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('59', '2019121818525810', '3', null, '1', null, null);
INSERT INTO `order_info` VALUES ('60', '2019121819564810', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('61', '2019121819584210', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('62', '2019121820025810', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('63', '2019121820335211', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('64', '2019121820461010', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('65', '201912191027119', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('66', '201912191056129', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('67', '2019121912440010', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('68', '2019121912511010', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('69', '201912191257291', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('70', '201912191257431', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('71', '201912191504031', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('72', '201912191515441', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('73', '201912191517021', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('74', '201912191517101', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('75', '201912191520531', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('76', '201912191521041', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('77', '201912191651451', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('78', '201912191651461', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('79', '201912191651471', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('80', '201912191651471', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('81', '201912191651471', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('82', '201912191651481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('83', '201912191651481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('84', '201912191651481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('85', '201912191651481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('86', '201912191651481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('87', '201912191651481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('88', '201912191651491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('89', '201912191651491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('90', '201912191651491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('91', '201912191651501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('92', '201912191651501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('93', '201912191655131', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('94', '201912191655141', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('95', '201912191655141', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('96', '201912191655141', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('97', '201912191655151', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('98', '201912191655151', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('99', '201912191655151', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('100', '201912191655151', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('101', '201912191655151', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('102', '201912191655161', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('103', '201912191655161', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('104', '201912191655161', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('105', '201912191655161', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('106', '201912191655161', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('107', '201912191655161', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('108', '201912191655171', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('109', '201912191655171', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('110', '201912191655171', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('111', '201912191655171', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('112', '201912191655171', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('113', '201912191655181', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('114', '201912191655181', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('115', '201912191655181', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('116', '201912191655221', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('117', '201912191655231', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('118', '201912191701291', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('119', '201912191703011', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('120', '201912191703021', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('121', '201912191703031', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('122', '201912191703031', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('123', '201912191703041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('124', '201912191703041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('125', '201912191703041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('126', '201912191703041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('127', '201912191703041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('128', '201912191703041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('129', '201912191703051', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('130', '201912191722261', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('131', '201912191722591', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('132', '201912191723071', '3', null, '1', null, null);
INSERT INTO `order_info` VALUES ('133', '201912191728331', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('134', '201912191728341', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('135', '201912191728341', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('136', '201912191728341', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('137', '201912191728351', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('138', '201912191728351', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('139', '201912191728351', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('140', '201912191728351', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('141', '201912191730221', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('142', '201912191730231', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('143', '201912191730231', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('144', '201912191730231', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('145', '201912191730231', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('146', '201912191730231', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('147', '201912191730241', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('148', '201912191730241', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('149', '201912191734441', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('150', '201912191734451', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('151', '201912191807041', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('152', '201912191807051', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('153', '201912191807051', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('154', '201912191807051', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('155', '201912191807051', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('156', '201912191807051', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('157', '201912191807061', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('158', '201912191807061', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('159', '201912191807061', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('160', '201912191807061', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('161', '201912191807071', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('162', '201912191807071', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('163', '201912191807071', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('164', '201912191807071', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('165', '201912191808411', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('166', '201912191848571', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('167', '201912191849281', '3', null, '1', null, null);
INSERT INTO `order_info` VALUES ('168', '201912191909491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('169', '201912191909491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('170', '201912191909491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('171', '201912191909491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('172', '201912191909501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('173', '201912191909501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('174', '201912191909501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('175', '201912191927341', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('176', '201912191927351', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('177', '201912191927371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('178', '201912191930511', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('179', '201912191945231', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('180', '201912191945241', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('181', '201912191945241', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('182', '201912191945251', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('183', '201912191945251', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('184', '201912192007041', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('185', '201912192007051', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('186', '201912192007051', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('187', '201912192007051', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('188', '201912192007061', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('189', '201912192049581', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('190', '201912192057481', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('191', '201912200939361', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('192', '201912200939361', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('193', '201912200939361', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('194', '201912200939371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('195', '201912200939371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('196', '201912200939371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('197', '201912202022091', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('198', '201912202022091', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('199', '201912202029201', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('200', '201912202029571', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('201', '201912202030031', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('202', '201912202031051', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('203', '201912202031141', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('204', '201912202031251', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('205', '201912202031351', '4', null, '1', null, null);
INSERT INTO `order_info` VALUES ('206', '201912221917021', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('207', '201912221917061', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('208', '201912221917071', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('209', '201912221917081', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('210', '201912221917081', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('211', '201912221917091', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('212', '201912221917091', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('213', '201912221917091', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('214', '201912221917091', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('215', '201912221917091', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('216', '201912221921261', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('217', '201912221921271', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('218', '201912221921271', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('219', '201912221921291', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('220', '201912221921361', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('221', '201912221921361', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('222', '201912221921371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('223', '201912221921371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('224', '201912221921371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('225', '201912221945381', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('226', '201912221949471', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('227', '201912221949561', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('228', '201912221949571', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('229', '201912221949571', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('230', '201912221949571', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('231', '201912221954241', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('232', '201912221954251', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('233', '201912221955341', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('234', '201912221955341', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('235', '201912221957031', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('236', '201912221959081', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('237', '201912221959271', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('238', '201912222000471', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('239', '201912222000481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('240', '201912222000491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('241', '201912222000571', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('242', '201912222027381', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('243', '201912222027391', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('244', '201912222027451', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('245', '201912222027591', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('246', '201912222027591', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('247', '201912222027591', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('248', '201912222027591', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('249', '201912231501321', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('250', '201912231501321', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('251', '201912231501331', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('252', '201912231501331', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('253', '201912231501331', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('254', '201912231503101', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('255', '201912231503111', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('256', '201912231503121', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('257', '201912231504411', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('258', '201912231504481', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('259', '201912231507131', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('260', '201912231507241', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('261', '201912231507241', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('262', '201912231507251', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('263', '201912231507251', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('264', '201912231507261', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('265', '201912231509091', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('266', '201912231509121', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('267', '201912231509181', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('268', '201912231509191', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('269', '201912231509201', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('270', '201912231512191', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('271', '201912231512201', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('272', '201912231512201', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('273', '201912231512291', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('274', '201912241009491', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('275', '201912241009501', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('276', '201912241009511', '6', null, '1', null, null);
INSERT INTO `order_info` VALUES ('277', '201912241419441', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('278', '201912241419491', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('279', '201912241419491', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('280', '201912241419501', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('281', '201912241419501', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('282', '201912241419501', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('283', '201912241419501', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('284', '201912241419501', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('285', '201912241419511', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('286', '201912241419511', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('287', '201912241422281', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('288', '201912241422291', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('289', '201912241422291', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('290', '201912241422291', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('291', '201912241422301', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('292', '201912241422301', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('293', '201912241422301', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('294', '201912241422301', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('295', '201912241925111', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('296', '201912241925121', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('297', '201912241925121', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('298', '201912241925121', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('299', '201912241925121', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('300', '201912241925181', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('301', '201912241925181', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('302', '201912241925191', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('303', '201912241925191', '2', null, '1', null, null);
INSERT INTO `order_info` VALUES ('304', '201912241925241', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('305', '201912241925241', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('306', '201912241925241', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('307', '201912241925241', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('308', '201912241925241', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('309', '201912241925251', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('310', '201912241925251', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('311', '201912241925251', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('312', '201912241925251', '5', null, '1', null, null);
INSERT INTO `order_info` VALUES ('313', '201912252109551', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('314', '201912252109561', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('315', '201912252110371', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('316', '201912252112491', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('317', '201912252112501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('318', '201912252112501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('319', '201912252112501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('320', '201912252112501', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('321', '201912252112511', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('322', '201912252112521', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('323', '201912252112531', '1', null, '1', null, null);
INSERT INTO `order_info` VALUES ('324', '201912252113131', '2', null, '1', null, null);

-- ----------------------------
-- Table structure for `shopping_car_info`
-- ----------------------------
DROP TABLE IF EXISTS `shopping_car_info`;
CREATE TABLE `shopping_car_info` (
  `shopping_car_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `lastUpdated` datetime DEFAULT NULL,
  PRIMARY KEY (`shopping_car_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopping_car_info
-- ----------------------------
INSERT INTO `shopping_car_info` VALUES ('29', '5', '1', '2019-12-16 09:13:05', null);
INSERT INTO `shopping_car_info` VALUES ('30', '5', '2', '2019-12-16 09:39:33', null);
INSERT INTO `shopping_car_info` VALUES ('31', '5', '3', '2019-12-17 00:56:54', null);
INSERT INTO `shopping_car_info` VALUES ('39', '8', '3', '2019-12-18 10:23:00', null);
INSERT INTO `shopping_car_info` VALUES ('40', '8', '5', '2019-12-18 13:31:13', null);
INSERT INTO `shopping_car_info` VALUES ('41', '9', '1', '2019-12-18 14:33:57', null);
INSERT INTO `shopping_car_info` VALUES ('42', '10', '1', '2019-12-18 18:36:45', null);
INSERT INTO `shopping_car_info` VALUES ('43', '10', '2', '2019-12-18 18:38:30', null);
INSERT INTO `shopping_car_info` VALUES ('44', '10', '3', '2019-12-18 18:39:54', null);
INSERT INTO `shopping_car_info` VALUES ('45', '10', '5', '2019-12-18 19:05:13', null);
INSERT INTO `shopping_car_info` VALUES ('46', '9', '2', '2019-12-18 19:47:51', null);
INSERT INTO `shopping_car_info` VALUES ('47', '11', '1', '2019-12-18 20:34:00', null);
INSERT INTO `shopping_car_info` VALUES ('48', '9', '6', '2019-12-19 10:56:11', null);
INSERT INTO `shopping_car_info` VALUES ('49', '1', '1', '2019-12-19 12:57:30', null);
INSERT INTO `shopping_car_info` VALUES ('50', '1', '6', '2019-12-19 15:15:44', null);
INSERT INTO `shopping_car_info` VALUES ('51', '1', '5', '2019-12-19 15:20:52', null);
INSERT INTO `shopping_car_info` VALUES ('52', '1', '3', '2019-12-19 17:23:07', null);
INSERT INTO `shopping_car_info` VALUES ('53', '1', '4', '2019-12-20 20:30:06', null);
INSERT INTO `shopping_car_info` VALUES ('54', '1', '2', '2019-12-24 19:25:12', null);

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id_key` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `userpwd` varchar(32) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `shopping_success_num` int(11) DEFAULT NULL,
  `shopping_fail_num` int(11) DEFAULT NULL,
  `total_money_shopping_success` double DEFAULT NULL,
  `total_money_shopping_fail` double DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `create_id` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `uppdate_id` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '1', 'c4ca4238a0b923820dcc509a6f75849b', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user_info` VALUES ('2', '2', 'c81e728d9d4c2f636f067f89cc14862c', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user_info` VALUES ('3', '3', 'eccbc87e4b5ce2fe28308fd9f2a7baf3', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user_info` VALUES ('4', '4', 'a87ff679a2f3e71d9181a67b7542122c', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `user_state_count`
-- ----------------------------
DROP TABLE IF EXISTS `user_state_count`;
CREATE TABLE `user_state_count` (
  `user_state_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `active_user_num` int(11) DEFAULT NULL,
  `all_user_num` int(11) DEFAULT NULL,
  `new_user_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_state_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_state_count
-- ----------------------------
INSERT INTO `user_state_count` VALUES ('1', '12000', '13000', '1');

///////////////////////////////////////////////////// //////////////////////////////////////////////
日志埋点设计
time 时间(年月日时分秒) 
type 0 登录注册和其他1 电子数码2                                    
action 1 详情点击2 添加到购物车3 购买4 登录5 注册6 购物车7 全部商品 
userid 0 表示没有登录userid 已经登录的
goodsid 0 没有商品1 中兴nubia2 三星s83 一加五4 卫龙5 三只松鼠6 法式面包
state    	 1 已经存在2 点击成功3 点击失败
price 0 不存在price 其他

////////////////////// hive建表//////////////////////////////////////////////////////
如果不存在shopweblog，则创建外部表（
time string,
type string,
action string,
userid string,
goodsid string,
state string,
price string
)
partitioned by(day string)
row format delimited fields terminated by ' '
LOCATION '/shopweblog';
//////////////////////////
购物商场系统启动前要启动hdfs，纱，动物园管理员，hive
///////////////////////////////////////////////////// 
卡夫卡配置：
c1.sources = r1
c1.channels = c1
c1.sinks = k1

# configure the source
c1.sources.r1.type = avro
c1.sources.r1.bind = hadoop-senior.shinelon.com
c1.sources.r1.port = 55555

# configure the channels
c1.channels.c1.type = memory
#下面这2个值是要capacity比transactionCapacity 设置的大
c1.channels.c1.capacity = 1000000000
c1.channels.c1.transactionCapacity = 100000000

# Describe the sink
# 描述和配置 sink 组件：k1

c1.sinks.k1.type = org.apache.flume.sink.kafka.KafkaSink
c1.sinks.k1.brokerList = hadoop-senior.shinelon.com:9092
c1.sinks.k1.topic = weblog
c1.sinks.k1.batchSize = 4
c1.sinks.k1.requiredAcks = 1 

#bind channels
c1.sources.r1.channels = c1
c1.sinks.k1.channel = c1
//////////////////////////////////////////////////////
创建主题
/opt/cdh/kafka_2.11-2.3.1/bin/kafka-topics.sh --zookeeper virhost01：2181-创建-复制因子1-分区1-主题weblog1
///////////////////////////////////////////////////// ////////////////
斯卡拉语言的离线实时运算
///////////离线///////////////////////////
package cs

import java.util.Calendar
import org.apache.spark.sql.SaveMode
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

object Test {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("lixian")
    val sc = new SparkContext(conf)
    val hiveContext = new HiveContext(sc)
    hiveContext.sql("use default")
    hiveContext.sql("msck repair table shopweblog")
    val res = hiveContext.sql("select type,goodsid,count(goodsid) as num,day from shopweblog where type > '0' group by type,goodsid,day")
    hiveContext.sql("drop table if exists click_result")
    res.write.mode(SaveMode.Overwrite).saveAsTable("click_result")

    val cal = Calendar.getInstance()
    val year = cal.get(Calendar.YEAR)
    val month = cal.get(Calendar.MONTH)+1
    val day = cal.get(Calendar.DAY_OF_MONTH)
    val date = ""+year+month+day
    val result = hiveContext.sql("select type,goodsid,num,day from (select type,goodsid,num,day,row_number() over (partition by type" +
      " order by num desc) rank from click_result where day = "+date+") t where t.rank<=2")
    result.write.mode("append")
      .format("jdbc")
      .option("driver","com.mysql.jdbc.Driver")
      .option("url","jdbc:mysql://virhost01:3306/shopweb?useUnicode=true&characterEncoding=UTF-8")
      .option("dbtable","click_topN")
      .option（“用户”，“根”）
      .option（“密码”，“ 123456”）////
      .option（“ truncate”，false）.save（）////
    sc.stop（）
  }
}
/////////////实时////////////////////////////////////////////////////////////////////////
package com.qrsx

import java.text.SimpleDateFormat
import kafka.serializer.StringDecoder
import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Durations, StreamingContext}

object KafkaSparkStreamingOnlineAll {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("updatestatebykey")
      .setMaster("local[2]")
    val jsc = new StreamingContext(conf,Durations.seconds(10))
    jsc.checkpoint("./text")

    //val lineDStream = jsc.socketTextStream("192.168.58.128",9999)
    val topicsSet = "weblog1".split(" ").toSet
    val kafkaParams = Map[String, String]("metadata.broker.list" -> "virhost01:9092")
    val messages = KafkaUtils.createDirectStream[String, String, StringDecoder, StringDecoder](
      //NoClassDefFoundError: kafka/api/TopicMetadataRequest
      //说是我的kafka 的jar包的版本的问你题
      //NoClassDefFoundError: com/typesafe/scalalogging/Logger$
      jsc, kafkaParams, topicsSet)

    //打印获取到的数据
    val lineDStream = messages.map(_._2)//.flatMap(_.split("\t")).map((_,1)).map(_._2).map(("人数",_))
    //之前一直报 数组越界异常  是因为 这里我将DStrem flatmap了一下  然后就只有 一个元素了  flatmap返回值是一个list 是list 了就不能split 了
    //split 只能分割元祖外的 具体看split和flatmap的区别
    //第一个是 userid  第二个是 具体的商品id 第三个1是数量   update一下  到数据库中
    //订单数量
    //成功订单的数量
    val VdingdanV=lineDStream.filter(_.split(" ")(2)=="3").filter(_.split(" ")(5)=="2").map(x=>{val line = x.split(" ");((line(3),line(4)),1)})
      .updateStateByKey((seq:Seq[Int],option:Option[Int])=>{
        var value=0
        value +=option.getOrElse(0)
        for (elem <-seq){
          value +=elem
        }
        Option(value)
      }).map(x=>{(x._1._1,x._2)})//userid 和 订单数量value

    val wordDStream1 =lineDStream.filter(_.split(" ")(2)=="3").filter(_.split(" ")(5)=="2").map(x=>{val line = x.split(" ");(1,1)})
      .reduceByKey(_+_)//.map(_._2)
    val wordDStream2 =lineDStream.filter(_.split(" ")(2)=="3").filter(_.split(" ")(5)=="2").map(x=>{val line = x.split(" ");(1,line(6).toInt)})
      .reduceByKey(_+_)//.map(_._2)
    val wordDStream=wordDStream1.join(wordDStream2)//（key,(1,2)）的形式  我真的太强了  这样就有了key 和value的形式
      .map(x=>(x._2._1,x._2._2))
    wordDStream.print()
    wordDStream.foreachRDD((rdd,timestamp1) => {
      val sdf = new SimpleDateFormat("yyyyMMdd")//这里还必须是这种的时间格式的 mysql中的datetime 才会识别  其他格式会报错
      val ts: String =sdf.format(timestamp1.milliseconds)//这是在格式化时间//不是道为什么 这个timestamp1凭空来的变量  怎么就成功了

      rdd.foreachPartition(
        eachPartition=>{

          val conn = ConnectionPool.getConnection
          eachPartition.foreach(record=>{
            val num =record._1
            val price=record._2
            val sqli = "insert into timecount(time,Dcount,price) values ("+"\""+ts+"\""+","+num+","+price+")"//这里在输入string类型的时候需要在 这个变量的两边添加 引号 并用\转义

            val stmt =  conn.createStatement
            stmt.executeUpdate(sqli)


          })
          ConnectionPool.returnConnection(conn)
        }
      )
    })

    VdingdanV.foreachRDD(rdd => {
      rdd.foreachPartition(
        eachPartition=>{
          val conn = ConnectionPool.getConnection//这句话 如果写在外面的一层中  就会报空指针异常
          eachPartition.foreach(record=>{
            val sqli = "insert into wordcount(userid,Dcount) values ("+record._1+","+record._2+")"
            val sqld = "delete from wordcount where userid="+record._1
            //val sqlu = "update wordcount set Dcount="+record._2+" where userid ="+record._1
            val stmt =  conn.createStatement
            stmt.executeUpdate(sqld)//执行不成功 就说明没有这个userid

            stmt.executeUpdate(sqli)


          })
          ConnectionPool.returnConnection(conn)
        }
      )
    })

    //=====================================================================
    // 对读取到的信息进行处理
    //val lines = messages.map(_._2)
    val lines = lineDStream
    lines.print()
    val searchWordsDStream = lines.map(_.split(" ")).map(x=>(x(0),x(1),x(2),x(3),x(4),x(5),x(6)))
    // -- 1.1、当天（注意时间）活跃用户数， 登录成功的总用户数
    //-- x(3) == 4  ,x(6) ==2   0 0 4 0 0 2
    val rdd2 = searchWordsDStream.filter(_._3.toInt==4).filter(_._6.toInt==2).map(Tuple2(_,1))
    val result = rdd2.reduceByKeyAndWindow(
      (v1:Int,v2:Int)=>
        (v1+v2),(v1:Int,v2:Int)=>
        (v1-v2)
      ,Durations.seconds(10),Durations.seconds(10))
    // 把计算后的num 取出来
    val newUserNum = result.map(x=>x._2)
    // 把计算后的结果插入数据库
    newUserNum.foreachRDD((rdd,timestamp) => {
      // 设置时间格式
      val sdf = new SimpleDateFormat("yyyyMMdd")
      val ts: String =sdf.format(timestamp.milliseconds)
      rdd.foreachPartition(eachPartition => {
        val conn = ConnectionPool.getConnection
        eachPartition.foreach(num => {
          val sql = "insert into user_active_count (new_user_active_num,count_time ) values("+ num +","+ " \" " + ts + " \" " + ")"
          val stmt = conn.createStatement
          stmt.executeUpdate(sql)
        })
        ConnectionPool.returnConnection(conn)
      })
    })

    //=====================================
    val rdd3 = searchWordsDStream.filter(_._3.toInt==5).filter(_._6.toInt==2).map(Tuple2(_,1))
    val result1 = rdd3.reduceByKeyAndWindow(
      (v1:Int,v2:Int)=> (v1+v2),
      (v1:Int,v2:Int)=> (v1-v2),
      Durations.seconds(10),Durations.seconds(10)
    )
    val newUserNum1 = result1.map(x=>x._2)
    // 把计算后的结果插入数据库
    newUserNum1.foreachRDD((rdd,timestamp)=>{
      // 设置时间格式
      val sdf = new SimpleDateFormat("yyyyMMdd")
      val ts = sdf.format(timestamp.milliseconds)
      rdd.foreachPartition(eachPartition => {
        val conn = ConnectionPool.getConnection
        eachPartition.foreach(num =>{
          val sql = "insert into user_increase_count (new_user_increase_num,count_time ) values("+ num +","+ " \" " + ts + " \" " + ")"
          val stmt = conn.createStatement()
          stmt.executeUpdate(sql)
        })
        ConnectionPool.returnConnection(conn)
      })
    })

    VdingdanV.print()
    jsc.start()
    jsc.awaitTermination()
    jsc.stop()

    /**
     * 数据库中字段是  key 是 userid   value是数量
     * 现在需要连接数据库连接池  是一个map(_,_)的形式
     * dstream  foreachrdd  处理  需要去连接数据库   用一个if  else 的语句来进行判断 如果select userid成功有数据 那么就可以 update
     * 否则就去insert 数据
     *
     */
  }

}
///////////////////////////////////////////////////// /////////////////////////////
离线实时存储的数据库shopweb.sql
/*
Navicat MySQL Data Transfer

Source Server         : virhost01
Source Server Version : 50173
Source Host           : virhost01:3306
Source Database       : shopweb

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2019-12-26 22:57:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `click_topN`
-- ----------------------------
DROP TABLE IF EXISTS `click_topN`;
CREATE TABLE `click_topN` (
  `type` int(11) DEFAULT NULL,
  `goodsid` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `day` varchar(155) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of click_topN
-- ----------------------------
INSERT INTO `click_topN` VALUES ('2', '6', '6', '20191224');
INSERT INTO `click_topN` VALUES ('1', '3', '4', '20191224');
INSERT INTO `click_topN` VALUES ('1', '1', '26', '20191223');
INSERT INTO `click_topN` VALUES ('1', '1', '22', '20191222');
INSERT INTO `click_topN` VALUES ('1', '1', '26', '20191223');
INSERT INTO `click_topN` VALUES ('1', '1', '2', '20191224');
INSERT INTO `click_topN` VALUES ('2', '5', '3', '20191224');
INSERT INTO `click_topN` VALUES ('1', '1', '144', '20191221');
INSERT INTO `click_topN` VALUES ('1', '1', '212', '20191220');
INSERT INTO `click_topN` VALUES ('2', '1', '12', '20191219');
INSERT INTO `click_topN` VALUES ('1', '1', '13', '20191218');
INSERT INTO `click_topN` VALUES ('2', '2', '11', '20191217');
INSERT INTO `click_topN` VALUES ('1', '1', '14', '20191225');
INSERT INTO `click_topN` VALUES ('2', '4', '1', '20191225');
INSERT INTO `click_topN` VALUES ('1', '2', '5', '20191225');
INSERT INTO `click_topN` VALUES ('2', '5', '1', '20191225');

-- ----------------------------
-- Table structure for `timecount`
-- ----------------------------
DROP TABLE IF EXISTS `timecount`;
CREATE TABLE `timecount` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` varchar(100) DEFAULT NULL,
  `Dcount` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of timecount
-- ----------------------------
INSERT INTO `timecount` VALUES ('1', '20191218', '12', '11');
INSERT INTO `timecount` VALUES ('2', '20191219', '21', '14');
INSERT INTO `timecount` VALUES ('3', '20191220', '12', '112');
INSERT INTO `timecount` VALUES ('4', '20191221', '52', '1212');
INSERT INTO `timecount` VALUES ('5', '20191222', '43', '121');
INSERT INTO `timecount` VALUES ('6', '20191223', '34', '2');
INSERT INTO `timecount` VALUES ('7', '20191224', '55', '212');
INSERT INTO `timecount` VALUES ('8', '20191225', '35', '14');
INSERT INTO `timecount` VALUES ('9', '20191225', '2', '3998');
INSERT INTO `timecount` VALUES ('10', '20191225', '1', '1999');
INSERT INTO `timecount` VALUES ('11', '20191225', '1', '1999');
INSERT INTO `timecount` VALUES ('12', '20191225', '7', '13993');
INSERT INTO `timecount` VALUES ('13', '20191225', '1', '1500');

-- ----------------------------
-- Table structure for `user_active_count`
-- ----------------------------
DROP TABLE IF EXISTS `user_active_count`;
CREATE TABLE `user_active_count` (
  `user_active_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `new_user_active_num` int(11) DEFAULT NULL,
  `count_time` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_active_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_active_count
-- ----------------------------
INSERT INTO `user_active_count` VALUES ('11', '7', ' 20191218');
INSERT INTO `user_active_count` VALUES ('12', '21', ' 20191219');
INSERT INTO `user_active_count` VALUES ('13', '11', ' 20191220');
INSERT INTO `user_active_count` VALUES ('14', '10', ' 20191221');
INSERT INTO `user_active_count` VALUES ('15', '12', ' 20191222');
INSERT INTO `user_active_count` VALUES ('16', '60', ' 20191223');
INSERT INTO `user_active_count` VALUES ('17', '78', ' 20191224');
INSERT INTO `user_active_count` VALUES ('18', '1', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('19', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('20', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('21', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('22', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('23', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('24', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('25', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('26', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('27', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('28', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('29', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('30', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('31', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('32', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('33', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('34', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('35', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('36', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('37', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('38', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('39', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('40', '1', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('41', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('42', '0', ' 20191225 ');
INSERT INTO `user_active_count` VALUES ('43', '0', ' 20191225 ');

-- ----------------------------
-- Table structure for `user_increase_count`
-- ----------------------------
DROP TABLE IF EXISTS `user_increase_count`;
CREATE TABLE `user_increase_count` (
  `user_increase_id_key` int(11) NOT NULL AUTO_INCREMENT,
  `new_user_increase_num` int(11) DEFAULT NULL,
  `count_time` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_increase_id_key`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_increase_count
-- ----------------------------
INSERT INTO `user_increase_count` VALUES ('1', '2', ' 20191218');
INSERT INTO `user_increase_count` VALUES ('2', '2', ' 20191219');
INSERT INTO `user_increase_count` VALUES ('3', '4', ' 20191220');
INSERT INTO `user_increase_count` VALUES ('4', '5', ' 20191221');
INSERT INTO `user_increase_count` VALUES ('5', '4', ' 20191222');
INSERT INTO `user_increase_count` VALUES ('6', '1', ' 20191223');
INSERT INTO `user_increase_count` VALUES ('7', '5', ' 20191224');
INSERT INTO `user_increase_count` VALUES ('11', '1', ' 20191225 ');
INSERT INTO `user_increase_count` VALUES ('12', '0', ' 20191225 ');
INSERT INTO `user_increase_count` VALUES ('13', '0', ' 20191225 ');
INSERT INTO `user_increase_count` VALUES ('14', '1', ' 20191225 ');
INSERT INTO `user_increase_count` VALUES ('15', '0', ' 20191225 ');
INSERT INTO `user_increase_count` VALUES ('16', '0', ' 20191225 ');
INSERT INTO `user_increase_count` VALUES ('17', '0', ' 20191225 ');

-- ----------------------------
-- Table structure for `wordcount`
-- ----------------------------
DROP TABLE IF EXISTS `wordcount`;
CREATE TABLE `wordcount` (
  `userid` varchar(100) DEFAULT NULL,
  `Dcount` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wordcount
-- ----------------------------
插入`wordcount`值（'1'，'1'）;
///////////////////////////////////////////////////////////////////
