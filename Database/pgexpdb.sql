-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: pgexp
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `area`
--

CREATE DATABASE  IF NOT EXISTS `pgexp`

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `area` (
  `area_id` int NOT NULL AUTO_INCREMENT,
  `area_name` varchar(45) NOT NULL,
  `pincode` int NOT NULL,
  `city_id` int DEFAULT NULL,
  PRIMARY KEY (`area_id`),
  UNIQUE KEY `area_id_UNIQUE` (`area_id`),
  UNIQUE KEY `pincode_UNIQUE` (`pincode`),
  KEY `city_id_idx` (`city_id`),
  CONSTRAINT `city_id` FOREIGN KEY (`city_id`) REFERENCES `cities` (`city_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
INSERT INTO `area` VALUES (1,'deccan',411004,1),(2,'kothrud',411038,1),(3,'hinjewadi',411033,1),(4,'baner',411057,1),(5,'aundh',411007,1),(6,'juhu',400049,2),(7,'dadar',400014,2),(8,'bandra',400050,2),(9,'colaba',400005,2),(10,'gangapur road',422222,3),(11,'indira nagar',422009,3),(12,'canada corner',422001,3),(13,'phaltan',415523,5),(14,'patas',412219,5),(15,'sangvi',412213,5),(16,'akoli',444607,4),(17,'arjun nagar',444603,4),(18,'gadge nagar',444604,4);
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cities` (
  `city_id` int NOT NULL AUTO_INCREMENT,
  `city_name` varchar(45) NOT NULL,
  PRIMARY KEY (`city_id`),
  UNIQUE KEY `city_id_UNIQUE` (`city_id`),
  UNIQUE KEY `city_name_UNIQUE` (`city_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES (4,'amravati'),(2,'mumbai'),(3,'nashik'),(1,'pune'),(5,'satara');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `occupant`
--

DROP TABLE IF EXISTS `occupant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `occupant` (
  `occupant_id` int NOT NULL AUTO_INCREMENT,
  `occupant_name` varchar(45) NOT NULL,
  `occupant_email` varchar(45) NOT NULL,
  `occupant_password` varchar(45) NOT NULL,
  `occupant_phone` int DEFAULT NULL,
  `occupant_gender` varchar(10) NOT NULL,
  `occupant_age` int NOT NULL,
  `occupant_address` varchar(45) NOT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`occupant_id`),
  UNIQUE KEY `occupant_id_UNIQUE` (`occupant_id`),
  UNIQUE KEY `email_UNIQUE` (`occupant_email`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `occupant`
--

LOCK TABLES `occupant` WRITE;
/*!40000 ALTER TABLE `occupant` DISABLE KEYS */;
/*!40000 ALTER TABLE `occupant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `owner`
--

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner` (
  `owner_id` int NOT NULL AUTO_INCREMENT,
  `owner_name` varchar(45) NOT NULL,
  `owner_email` varchar(45) NOT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `reg_date` varchar(45) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`owner_id`),
  UNIQUE KEY `owner_id_UNIQUE` (`owner_id`),
  UNIQUE KEY `owner_email_UNIQUE` (`owner_email`),
  UNIQUE KEY `contact_UNIQUE` (`contact`),
  KEY `fk_user_id_owner` (`user_id`),
  CONSTRAINT `fk_user_id_owner` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owner`
--

LOCK TABLES `owner` WRITE;
/*!40000 ALTER TABLE `owner` DISABLE KEYS */;
INSERT INTO `owner` VALUES (1,'Akshay','akshay@gmail.com','8600863330','',NULL),(2,'Aayush','aayush@mail.com','9158627272','',NULL),(3,'Madhu','madhu@gmail.com','9152525252',NULL,NULL),(4,'Aniket','aniket@gmail.com','8630302050',NULL,NULL);
/*!40000 ALTER TABLE `owner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `role_name_UNIQUE` (`role_name`),
  UNIQUE KEY `role_id_UNIQUE` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'admin'),(3,'occupant'),(2,'owner');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `user_email` varchar(45) NOT NULL,
  `user_active_status` int NOT NULL,
  `user_role` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  UNIQUE KEY `user_email_UNIQUE` (`user_email`),
  KEY `user_role_idx` (`user_role`),
  CONSTRAINT `user_role` FOREIGN KEY (`user_role`) REFERENCES `roles` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-08  8:49:49
