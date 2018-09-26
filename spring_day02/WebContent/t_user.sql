/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_xf

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-09-26 17:39:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'tom');
INSERT INTO `t_user` VALUES ('2', 'jack');
INSERT INTO `t_user` VALUES ('4', 'tom');
INSERT INTO `t_user` VALUES ('5', 'jack');
INSERT INTO `t_user` VALUES ('6', 'tom');
INSERT INTO `t_user` VALUES ('7', 'jack');
INSERT INTO `t_user` VALUES ('8', 'tom');
INSERT INTO `t_user` VALUES ('9', 'jack');
INSERT INTO `t_user` VALUES ('10', 'tom');
INSERT INTO `t_user` VALUES ('11', 'jack');
INSERT INTO `t_user` VALUES ('12', 'tom');
INSERT INTO `t_user` VALUES ('13', 'jack');
INSERT INTO `t_user` VALUES ('14', 'tom');
INSERT INTO `t_user` VALUES ('15', 'jack');
