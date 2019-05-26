CREATE DATABASE  IF NOT EXISTS `employee_dbase`;
USE `employee_dbase`;

DROP TABLE IF EXISTS `developer`;

CREATE TABLE `developer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `rate` DOUBLE(10, 2) DEFAULT NULL,
  `hours_in_mounth` DOUBLE(5, 2) DEFAULT NULL,
  `worked_hour` DOUBLE(5, 2) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `salary` DOUBLE(10, 2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `manager`;

CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `rate` DOUBLE(10, 2) DEFAULT NULL,
  `hours_in_mounth` DOUBLE(5, 2) DEFAULT NULL,
  `worked_hour` DOUBLE(5, 2) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `salary` DOUBLE(10, 2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


--
-- Data for tables
--
INSERT INTO `developer` VALUES 
	(1,'Laslo','Kovach',3000.0,160.0,320.0,'DEVELOPER',6000.0),
	(2,'Chris','Quilala',4000.0,160.0,160.0,'DEVELOPER',4000.0),
	(3,'Kim','Walker',4000.0,80.0,80.0,'DEVELOPER',4000.0),
	(4,'Iliya','Gerasim',5000.0,160.0,160.0,'DEVELOPER',5000.0);

INSERT INTO `manager` VALUES 
	(5,'Inka','Chiog',3000.0,160.0,320.0,'MANAGER',6000.0),
	(6,'Chris','Chiog',4000.0,160.0,160.0,'MANAGER',4000.0),
	(7,'Racine','Chiog',4000.0,80.0,80.0,'MANAGER',4000.0);

	

