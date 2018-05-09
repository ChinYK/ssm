/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.21 : Database - hbjc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hbjc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hbjc`;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`user_name`,`password`) values 
(1,'chen','123456'),
(2,'cyk','123456.0'),
(3,'cykk','123456.0'),
(4,'cykkk','123456.0'),
(5,'111','111.0'),
(6,'1111','1111.0'),
(7,'222','222.0'),
(8,'222','333.0'),
(9,'222','333.0'),
(10,'333','444.0'),
(11,'234','234.0'),
(12,'222','222.0'),
(13,'222','222.0'),
(14,'222','222.0'),
(15,'222','333.0'),
(16,'222','222.0'),
(17,'222','333.0'),
(18,'333','444.0'),
(19,'555','555.0'),
(20,'666','777.0'),
(21,'333','333.0'),
(22,'222','2222.0'),
(23,'333','333.0'),
(24,'222','2222.0'),
(25,'333','555.0'),
(26,'333','555.0'),
(27,'333','555.0'),
(28,'333','555.0'),
(29,'333','555.0'),
(30,'333','555.0'),
(31,'333','555.0'),
(32,'333','555.0'),
(33,'333','555.0'),
(34,'333','555.0'),
(35,'333','555.0'),
(36,'333','555.0'),
(37,'333','555.0'),
(38,'4567','45678655'),
(39,'4567','45678655'),
(40,'3344','2334.0'),
(41,'23233','232332.0'),
(42,'23233','232332.0'),
(43,'234','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
