# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2019-05-23 00:28:33
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "dictionary"
#

DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `receive` varchar(100) DEFAULT NULL,
  `response` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "dictionary"
#

INSERT INTO `dictionary` VALUES (1,'���','�����ã�'),(2,'���ʲô','�������Ұ���'),(3,'���ʲô','ͬ־����Լ'),(4,'����Ŷ','�����������Ұ��������е��');
