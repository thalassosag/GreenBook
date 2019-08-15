/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : green

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-08-12 08:35:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `article_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `article_title` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `atticle_craete_time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `article_id` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for `article_comment`
-- ----------------------------
DROP TABLE IF EXISTS `article_comment`;
CREATE TABLE `article_comment` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `article_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `user_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `comment_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `superior_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `content` varchar(150) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `comment_time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `article_id_constraint` (`article_id`),
  KEY `user_id_constraint` (`user_id`),
  KEY `comment_id` (`comment_id`),
  KEY `superior_id_constraint` (`superior_id`),
  CONSTRAINT `superior_id_constraint` FOREIGN KEY (`superior_id`) REFERENCES `article_comment` (`comment_id`),
  CONSTRAINT `article_id_constraint` FOREIGN KEY (`article_id`) REFERENCES `article` (`article_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_id_constraint` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of article_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `article_thumbsup`
-- ----------------------------
DROP TABLE IF EXISTS `article_thumbsup`;
CREATE TABLE `article_thumbsup` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `article_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `user_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `thumbsup_time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `article_id_c` (`article_id`),
  KEY `user_id_c` (`user_id`),
  CONSTRAINT `user_id_c` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `article_id_c` FOREIGN KEY (`article_id`) REFERENCES `article` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of article_thumbsup
-- ----------------------------

-- ----------------------------
-- Table structure for `ingredient`
-- ----------------------------
DROP TABLE IF EXISTS `ingredient`;
CREATE TABLE `ingredient` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ingredient_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `ingredient_name` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `ingredient_content` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of ingredient
-- ----------------------------

-- ----------------------------
-- Table structure for `picture`
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `picture_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `address` varchar(100) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of picture
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `product_price` double NOT NULL,
  `product_star` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for `product_category`
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `category_name` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product_category
-- ----------------------------

-- ----------------------------
-- Table structure for `product_category_cascade`
-- ----------------------------
DROP TABLE IF EXISTS `product_category_cascade`;
CREATE TABLE `product_category_cascade` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `category_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_id_constraint` (`product_id`),
  KEY `category_id_constraint` (`category_id`),
  CONSTRAINT `category_id_constraint` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_id_constraint` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product_category_cascade
-- ----------------------------

-- ----------------------------
-- Table structure for `product_comment`
-- ----------------------------
DROP TABLE IF EXISTS `product_comment`;
CREATE TABLE `product_comment` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `user_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `comment_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `superior_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `content` varchar(150) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `comment_time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comment_id` (`comment_id`),
  KEY `product_id_c` (`product_id`),
  CONSTRAINT `product_id_c` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `product_ingredient`
-- ----------------------------
DROP TABLE IF EXISTS `product_ingredient`;
CREATE TABLE `product_ingredient` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `ingredient_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product_ingredient
-- ----------------------------

-- ----------------------------
-- Table structure for `product_picture`
-- ----------------------------
DROP TABLE IF EXISTS `product_picture`;
CREATE TABLE `product_picture` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `picture_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product_picture
-- ----------------------------

-- ----------------------------
-- Table structure for `product_tag`
-- ----------------------------
DROP TABLE IF EXISTS `product_tag`;
CREATE TABLE `product_tag` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `tag_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `article_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of product_tag
-- ----------------------------

-- ----------------------------
-- Table structure for `tag_table`
-- ----------------------------
DROP TABLE IF EXISTS `tag_table`;
CREATE TABLE `tag_table` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tag_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `tag_name` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of tag_table
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `user_name` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `user_password` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `user_nickname` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `user_phonenumber` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `user_email` varchar(30) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `user_head_portrait` varchar(30) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_ip` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `user_signup_time` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for `user_relation`
-- ----------------------------
DROP TABLE IF EXISTS `user_relation`;
CREATE TABLE `user_relation` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `follower_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `history_product_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `history_article_id` varchar(20) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of user_relation
-- ----------------------------
