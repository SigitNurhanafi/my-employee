CREATE DATABASE IF NOT EXISTS `my-employee` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin */;
USE `my-employee`;

CREATE TABLE IF NOT EXISTS `employees` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `salary` int(50) unsigned NOT NULL,
  `grade_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);