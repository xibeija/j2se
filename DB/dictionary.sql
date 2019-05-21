# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2019-05-22 00:16:54
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "dictionary"
#

DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `receive` varchar(100) DEFAULT NULL,
  `response` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "dictionary"
#

INSERT INTO `dictionary` VALUES (1,'你好','好你妹！'),(2,'你叫什么','你想泡我啊？'),(3,'你叫什么','同志，不约'),(4,'打你哦','来啊，来打我啊，不打有点挫');
