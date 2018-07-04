/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : hbjc

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-07-04 10:50:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'chen', '123456', '华北');
INSERT INTO `users` VALUES ('2', 'cyk', '123456', '华东');
INSERT INTO `users` VALUES ('3', 'cykk', '123456', '华南');
INSERT INTO `users` VALUES ('4', 'cykkk', '123456', '华南');
INSERT INTO `users` VALUES ('5', 'liyun', '111', '华南');
INSERT INTO `users` VALUES ('6', 'mingwnin', '1111', '华南');
INSERT INTO `users` VALUES ('7', 'wangming', '222', '西北');
INSERT INTO `users` VALUES ('8', 'miin', '333', '西南');
INSERT INTO `users` VALUES ('9', 'wangx', '333', '东北');
INSERT INTO `users` VALUES ('10', 'xiangm', '566', '东北');
INSERT INTO `users` VALUES ('11', 'yuuyio', '234', '东北');
INSERT INTO `users` VALUES ('12', 'oppp', '222', '东北');
INSERT INTO `users` VALUES ('13', 'vivo', '222', '华东');
INSERT INTO `users` VALUES ('14', 'lopp', '222', '华东');
INSERT INTO `users` VALUES ('15', 'tyrur', '333', '华东');
INSERT INTO `users` VALUES ('16', 'jhhh', '222', '华东');
INSERT INTO `users` VALUES ('17', 'kkk', '333', '华中');
INSERT INTO `users` VALUES ('18', 'lioo', '444', '华中');
INSERT INTO `users` VALUES ('19', 'admin', '123456', '华中');
INSERT INTO `users` VALUES ('20', 'ad', '777', '华中');
INSERT INTO `users` VALUES ('35', 'vis', '555', '西南');
INSERT INTO `users` VALUES ('36', 'youi', '555', '西南');
INSERT INTO `users` VALUES ('37', 'yurr', '555', '西南');
INSERT INTO `users` VALUES ('38', 'jk', '45678655', '西南');
INSERT INTO `users` VALUES ('39', 'll', '45678655', '西南');
INSERT INTO `users` VALUES ('40', 'yhj', '2334', '西南');
INSERT INTO `users` VALUES ('41', 'mkk', '232332', '西南');
INSERT INTO `users` VALUES ('42', 'jkld', '232332', '西南');
INSERT INTO `users` VALUES ('49', 'chen1', '123456', '西南');
INSERT INTO `users` VALUES ('50', 'chen2', '123456', '西南');
INSERT INTO `users` VALUES ('51', 'chen3', '123456', '西北');
INSERT INTO `users` VALUES ('52', 'chen4', '123456', '西北');
INSERT INTO `users` VALUES ('53', 'chen5', '123456', '西北');
INSERT INTO `users` VALUES ('54', 'chen6', '123456', '西北');
