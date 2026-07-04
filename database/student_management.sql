-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: finalstudent
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `student_details`
--

DROP TABLE IF EXISTS `student_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `branch` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `rollno` varchar(255) NOT NULL,
  `year` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK54l8nlcu41wn5lnxqx3vgmywe` (`email`),
  UNIQUE KEY `UKjr997h73g67sqtafvotfx5j0c` (`rollno`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_details`
--

LOCK TABLES `student_details` WRITE;
/*!40000 ALTER TABLE `student_details` DISABLE KEYS */;
INSERT INTO `student_details` VALUES (1,'Hyderabad','cse','229x1a0591@gprec.ac.in','9876543210','229x1a0591','1','Rahul Sharma Ji'),(2,'Bangalore','ECE','229x1a0592@gprec.ac.in','9876543211','229x1a0592','2','Priya Reddy'),(3,'Chennai','IT','229x1a0593@gprec.ac.in','9876543212','229x1a0593','3','Amit Kumar'),(4,'Delhi','MECH','229x1a0594@gprec.ac.in','9876543213','229x1a0594','4','Sneha Gupta'),(5,'Mumbai','EEE','229x1a0595@gprec.ac.in','9876543214','229x1a0595','1','Vikram Singh'),(6,'Pune','CSE','229x1a0596@gprec.ac.in','9876543215','229x1a0596','2','Anjali Verma'),(7,'Kolkata','ECE','229x1a0597@gprec.ac.in','9876543216','229x1a0597','3','Rohit Yadav'),(8,'Hyderabad','IT','229x1a0598@gprec.ac.in','9876543217','229x1a0598','4','Divya Nair'),(9,'Bangalore','cse','229x1a0599@gprec.ac.in','9876543218','229x1a0599','1','Suresh mEHTA'),(10,'Chennai','EEE','229x1a0600@gprec.ac.in','9876543219','229x1a0600','2','Neha Joshi'),(11,'Delhi','CSE','229x1a0601@gprec.ac.in','9876543220','229x1a0601','3','Arjun Patel'),(12,'Mumbai','ECE','229x1a0602@gprec.ac.in','9876543221','229x1a0602','4','Kavya Iyer'),(13,'Pune','IT','229x1a0603@gprec.ac.in','9876543222','229x1a0603','1','Manoj Rathi'),(14,'Kolkata','MECH','229x1a0604@gprec.ac.in','9876543223','229x1a0604','2','Swati Mishra'),(15,'Hyderabad','EEE','229x1a0605@gprec.ac.in','9876543224','229x1a0605','3','Nikhil Rao'),(16,'Bangalore','CSE','229x1a0606@gprec.ac.in','9876543225','229x1a0606','4','Pooja Kulkarni'),(17,'Chennai','ECE','229x1a0607@gprec.ac.in','9876543226','229x1a0607','1','Aditya Menon'),(19,'Mumbai','MECH','229x1a0609@gprec.ac.in','9876543228','229x1a0609','3','Karan Malhotra'),(20,'Pune','EEE','229x1a0610@gprec.ac.in','9876543229','229x1a0610','4','Meera Chopra'),(22,'Hyderabad','ece','naush@gmail.com','8074323994','229x1a0310','3','Nausheen'),(23,'Brpl','me','shakirabanu@gmail.com','9959857644','229x1a0508','4','Shakira'),(25,'ku','me','abcdefgh@gmail.com','1234543216','229x1a0555','4','Sariya');
/*!40000 ALTER TABLE `student_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-07-04  9:49:11
