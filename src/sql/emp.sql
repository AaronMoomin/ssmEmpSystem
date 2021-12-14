/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 14/12/2021 20:30:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `birthday` timestamp(0) NULL DEFAULT NULL,
  `entry_date` timestamp(0) NULL DEFAULT NULL,
  `job` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `salary` double NULL DEFAULT NULL,
  `resume` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  `dept_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 115 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (3, 'tom', '2014-12-08 09:17:00', '2011-11-11 00:00:00', '全栈', 100, '啊这', 1);
INSERT INTO `emp` VALUES (100, 'aaron', '2000-11-11 00:00:00', '2010-11-11 11:11:00', '前端', 5000, '没有说明', 2);
INSERT INTO `emp` VALUES (102, 'tom', '2021-05-11 15:01:00', '2017-01-17 17:58:00', '前端', 5020, '没有说明就是一堆说明', 1);
INSERT INTO `emp` VALUES (103, 'jack', '2021-12-07 16:29:00', '2021-12-30 16:29:00', '全栈', 1000, '便宜', 2);
INSERT INTO `emp` VALUES (104, 'mary', '2021-12-15 16:34:00', '2021-11-17 16:34:00', '前端', 10000, '啊这', 1);
INSERT INTO `emp` VALUES (105, 'tomy', '2021-12-02 16:34:00', '2021-12-05 16:34:00', '后端', 11110, '啊这', 2);
INSERT INTO `emp` VALUES (106, 'moomin', '2021-12-31 19:21:00', '2021-12-11 19:21:00', '前端', 5020, '啊这', 1);
INSERT INTO `emp` VALUES (107, 'mike', '2021-12-10 19:51:00', '2021-12-30 19:51:00', '后端', 10000, '没有说明就是一堆说明', 1);
INSERT INTO `emp` VALUES (108, 'mike2', '2021-12-26 19:51:00', '2021-12-15 19:51:00', '后端', 11111, '便宜', 1);
INSERT INTO `emp` VALUES (109, 'tooo', '2021-12-30 19:52:00', '2021-11-30 19:52:00', '前端', 5020, '啊这', 1);
INSERT INTO `emp` VALUES (111, '闲总', '2000-07-11 16:57:00', '2021-12-10 14:57:00', '前端', 10000000, '大佬', 1);
INSERT INTO `emp` VALUES (113, 'js', '2021-12-09 15:42:00', '2021-12-24 15:42:00', '前端', 9999, '无敌是多么寂寞', 1);

SET FOREIGN_KEY_CHECKS = 1;
