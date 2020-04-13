CREATE DATABASE  IF NOT EXISTS `covid19` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `covid19`;


 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(200) NOT NULL,

  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;


 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_session` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `session_token` varchar(45) NOT NULL,
  `session_start_time` datetime DEFAULT NULL,
  `session_expiry_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_info_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_info_id_458_idx` (`user_info_id`),
  CONSTRAINT `fk_user_info_id_459` FOREIGN KEY (`user_info_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=322 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


 SET character_set_client = utf8mb4 ;
CREATE TABLE `records` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `state` int(11),
  `total` int(11),
  `active` int(11),
  `recovered` int(11),
  `deaths` int(11),
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;