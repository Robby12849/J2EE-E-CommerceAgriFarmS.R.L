-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: db_agrifarmsrl
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accesso`
--

DROP TABLE IF EXISTS `accesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accesso` (
  `id_accesso` int NOT NULL AUTO_INCREMENT,
  `dataora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `id_utente` int DEFAULT NULL,
  PRIMARY KEY (`id_accesso`),
  KEY `id_utente` (`id_utente`),
  CONSTRAINT `accesso_ibfk_1` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accesso`
--

LOCK TABLES `accesso` WRITE;
/*!40000 ALTER TABLE `accesso` DISABLE KEYS */;
INSERT INTO `accesso` VALUES (1,'2024-05-12 13:32:09',3),(2,'2024-05-16 06:39:47',5),(3,'2024-05-16 06:42:26',5),(4,'2024-05-16 06:44:59',5),(5,'2024-05-16 15:40:14',5),(6,'2024-05-16 15:42:00',5),(7,'2024-05-16 15:48:44',5),(8,'2024-05-16 15:50:41',5),(9,'2024-05-16 15:51:40',5),(10,'2024-05-16 15:52:40',5),(11,'2024-05-16 16:01:03',5),(12,'2024-05-16 16:08:58',5),(13,'2024-05-16 16:10:39',5),(14,'2024-05-16 16:15:56',5),(15,'2024-05-16 16:17:21',5),(16,'2024-05-16 16:43:21',5),(17,'2024-05-16 17:39:42',5),(18,'2024-05-16 17:40:30',5),(19,'2024-05-16 17:41:25',5),(20,'2024-05-16 17:42:56',5),(21,'2024-05-16 17:44:08',5),(22,'2024-05-16 17:48:12',5),(23,'2024-05-16 17:48:57',5),(24,'2024-05-16 17:50:30',5),(25,'2024-05-16 17:52:03',5),(26,'2024-05-16 17:55:07',5),(27,'2024-05-16 17:58:33',5),(28,'2024-05-16 17:59:06',5),(29,'2024-05-16 18:06:42',5),(30,'2024-05-16 18:10:01',5),(31,'2024-05-16 18:10:59',5),(32,'2024-05-16 18:17:45',5),(33,'2024-05-16 18:20:24',5),(34,'2024-05-17 13:27:05',5),(35,'2024-05-17 13:28:53',5),(36,'2024-05-17 13:33:52',5),(37,'2024-05-17 13:40:40',5),(38,'2024-05-17 13:40:48',5),(39,'2024-05-17 13:42:23',5),(40,'2024-05-17 13:44:26',5),(41,'2024-05-17 13:45:53',5),(42,'2024-05-17 13:47:09',5),(43,'2024-05-17 13:48:33',5),(44,'2024-05-17 13:50:57',5),(45,'2024-05-17 13:51:17',5),(46,'2024-05-17 13:51:26',5),(47,'2024-05-17 14:02:27',5),(48,'2024-05-17 14:04:42',5),(49,'2024-05-17 14:07:56',5),(50,'2024-05-17 14:08:13',5),(51,'2024-05-18 09:11:17',5),(52,'2024-05-18 09:24:59',5),(53,'2024-05-18 09:30:26',5),(54,'2024-05-18 09:32:02',5),(55,'2024-05-18 09:32:44',5),(56,'2024-05-18 09:33:19',5),(57,'2024-05-18 09:36:12',5),(58,'2024-05-18 09:37:42',5),(59,'2024-05-18 09:43:43',5),(60,'2024-05-18 09:51:19',5),(61,'2024-05-18 09:55:29',5),(62,'2024-05-18 09:57:26',5),(63,'2024-05-18 09:59:54',5),(64,'2024-05-18 10:00:09',5),(65,'2024-05-18 10:01:08',5),(66,'2024-05-18 10:03:01',5),(67,'2024-05-18 10:03:11',5),(68,'2024-05-18 10:24:38',5),(69,'2024-05-18 10:24:48',5),(70,'2024-05-18 10:25:20',5),(71,'2024-05-18 10:25:30',5),(72,'2024-05-18 10:25:37',5),(73,'2024-05-18 10:27:08',5),(74,'2024-05-18 10:27:19',5),(75,'2024-05-18 10:27:28',5),(76,'2024-05-18 10:28:28',5),(77,'2024-05-18 10:28:52',5),(78,'2024-05-18 10:29:04',5),(79,'2024-05-18 10:29:26',5),(80,'2024-05-18 12:19:40',5),(81,'2024-05-18 12:34:37',5),(82,'2024-05-18 12:36:30',5),(83,'2024-05-18 12:38:03',5),(84,'2024-05-18 12:38:31',5),(85,'2024-05-18 12:38:43',5),(86,'2024-05-18 12:39:33',5),(87,'2024-05-18 12:39:46',5),(88,'2024-05-18 12:39:53',5),(89,'2024-05-18 12:41:08',5),(90,'2024-05-18 12:41:18',5),(91,'2024-05-18 12:41:26',5),(92,'2024-05-18 12:42:05',5),(93,'2024-05-18 17:38:13',5),(94,'2024-05-18 17:38:22',5),(95,'2024-05-18 17:38:30',5),(96,'2024-05-19 19:29:49',5),(97,'2024-05-19 19:33:00',5),(98,'2024-05-19 19:33:19',5),(99,'2024-05-19 19:34:28',5),(100,'2024-05-19 19:35:58',5),(101,'2024-05-19 19:38:27',5),(102,'2024-05-19 19:38:41',5),(103,'2024-05-19 19:40:22',5),(104,'2024-05-19 19:40:34',5),(105,'2024-05-19 19:41:22',5),(106,'2024-05-19 19:44:27',5),(107,'2024-05-19 19:47:47',5),(108,'2024-05-19 19:48:59',5),(109,'2024-05-19 19:49:07',5),(110,'2024-05-19 19:53:28',5),(111,'2024-05-19 19:53:59',5),(112,'2024-05-19 19:54:17',5),(113,'2024-05-19 19:54:25',5),(114,'2024-05-19 19:56:33',5),(115,'2024-05-19 19:58:20',5),(116,'2024-05-19 20:00:36',5),(117,'2024-05-19 20:00:50',5),(118,'2024-05-19 20:01:24',5),(119,'2024-05-19 20:02:05',5),(120,'2024-05-19 20:02:59',5),(121,'2024-05-19 20:04:05',5),(122,'2024-05-19 20:09:17',5),(123,'2024-05-19 20:09:34',5),(124,'2024-05-19 20:14:09',5),(125,'2024-05-19 20:16:11',5),(126,'2024-05-19 20:16:22',5),(127,'2024-05-19 20:16:30',5),(128,'2024-05-19 20:18:33',5),(129,'2024-05-19 20:19:16',5),(130,'2024-05-19 20:21:46',5),(131,'2024-05-19 20:21:56',5),(132,'2024-05-19 20:23:27',5),(133,'2024-05-19 20:24:28',5),(134,'2024-05-19 20:24:47',5),(135,'2024-05-19 20:29:23',5),(136,'2024-05-19 20:30:47',5),(137,'2024-05-19 20:31:24',5),(138,'2024-05-19 20:33:15',5),(139,'2024-05-19 20:33:35',5),(140,'2024-05-19 20:34:07',5),(141,'2024-05-19 20:36:54',5),(142,'2024-05-19 20:38:02',5),(143,'2024-05-19 20:38:58',5),(144,'2024-05-19 22:37:41',5),(145,'2024-05-19 22:38:07',5),(146,'2024-05-19 22:40:05',5),(147,'2024-05-19 22:42:19',5),(148,'2024-05-19 22:43:35',5),(149,'2024-05-19 22:43:46',5),(150,'2024-05-19 22:45:36',5);
/*!40000 ALTER TABLE `accesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `acquisto`
--

DROP TABLE IF EXISTS `acquisto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acquisto` (
  `id_acquisto` int NOT NULL AUTO_INCREMENT,
  `id_utente` int DEFAULT NULL,
  `id_strumento` int DEFAULT NULL,
  `dataora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `costototale` int NOT NULL,
  PRIMARY KEY (`id_acquisto`),
  KEY `id_utente` (`id_utente`),
  KEY `id_strumento` (`id_strumento`),
  CONSTRAINT `acquisto_ibfk_1` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`),
  CONSTRAINT `acquisto_ibfk_2` FOREIGN KEY (`id_strumento`) REFERENCES `strumento` (`id_strumento`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acquisto`
--

LOCK TABLES `acquisto` WRITE;
/*!40000 ALTER TABLE `acquisto` DISABLE KEYS */;
INSERT INTO `acquisto` VALUES (50,5,36,'2024-05-18 12:41:29',20),(51,5,8,'2024-05-18 12:41:29',40000),(52,5,12,'2024-05-18 17:38:26',1100),(53,5,10,'2024-05-18 17:38:26',1300),(54,5,3,'2024-05-19 19:38:36',240),(55,5,23,'2024-05-19 19:38:36',350),(56,5,15,'2024-05-19 19:38:36',700),(57,5,15,'2024-05-19 19:41:17',700),(58,5,15,'2024-05-19 19:41:17',700),(59,5,15,'2024-05-19 19:41:17',700),(60,5,18,'2024-05-19 19:49:03',400),(61,5,18,'2024-05-19 19:53:22',400),(62,5,14,'2024-05-19 19:54:21',500),(63,5,14,'2024-05-19 19:59:55',500),(64,5,14,'2024-05-19 19:59:55',500),(65,5,14,'2024-05-19 19:59:55',500),(66,5,11,'2024-05-19 20:00:53',1200),(67,5,20,'2024-05-19 20:01:28',2300),(68,5,20,'2024-05-19 20:15:03',2300),(69,5,20,'2024-05-19 20:15:03',2300),(70,5,20,'2024-05-19 20:15:03',2300),(71,5,20,'2024-05-19 20:15:03',2300),(72,5,20,'2024-05-19 20:15:03',2300),(73,5,16,'2024-05-19 22:38:10',400),(74,5,21,'2024-05-19 22:43:50',1200);
/*!40000 ALTER TABLE `acquisto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carrello`
--

DROP TABLE IF EXISTS `carrello`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrello` (
  `id_oggetto` int NOT NULL AUTO_INCREMENT,
  `id_utente` int DEFAULT NULL,
  `id_strumento` int DEFAULT NULL,
  PRIMARY KEY (`id_oggetto`),
  KEY `id_utente` (`id_utente`),
  KEY `id_strumento` (`id_strumento`),
  CONSTRAINT `carrello_ibfk_1` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`),
  CONSTRAINT `carrello_ibfk_2` FOREIGN KEY (`id_strumento`) REFERENCES `strumento` (`id_strumento`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrello`
--

LOCK TABLES `carrello` WRITE;
/*!40000 ALTER TABLE `carrello` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrello` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feed`
--

DROP TABLE IF EXISTS `feed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feed` (
  `id_feedback` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `acquisto` varchar(50) DEFAULT NULL,
  `contenuto` text NOT NULL,
  `data` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `id_utente` int DEFAULT NULL,
  PRIMARY KEY (`id_feedback`),
  KEY `id_utente` (`id_utente`),
  CONSTRAINT `feed_ibfk_1` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feed`
--

LOCK TABLES `feed` WRITE;
/*!40000 ALTER TABLE `feed` DISABLE KEYS */;
/*!40000 ALTER TABLE `feed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `strumento`
--

DROP TABLE IF EXISTS `strumento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `strumento` (
  `id_strumento` int NOT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `famiglia` varchar(70) DEFAULT NULL,
  `costo` int DEFAULT NULL,
  `foto` varchar(250) DEFAULT NULL,
  `potenza_cv` int DEFAULT NULL,
  `modello` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_strumento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `strumento`
--

LOCK TABLES `strumento` WRITE;
/*!40000 ALTER TABLE `strumento` DISABLE KEYS */;
INSERT INTO `strumento` VALUES (3,'alpina','decespugliatori',240,'https://m.media-amazon.com/images/I/71WLy2B4HcL.__AC_SY300_SX300_QL70_ML2_.jpg',2,'abr42'),(4,'Goldoni','trattori',30000,'https://www.goldoni.com/www.goldoni.it/repository/1/4/11893/15723/eng-15766.jpg',100,'frutteto'),(5,'Lamborghini','trattori',35000,'https://www.otm-srl.com/wp-content/uploads/2019/05/t13004_3.jpg',95,'vigneto'),(6,'NewHolland','trattori',45000,'https://cnhi-p-001-delivery.sitecorecontenthub.cloud/api/public/content/33a9979db99d410592ab1d3601829539?v=fcbe5676',90,'frutteto'),(8,'Same','trattori',40000,'https://www.lectura-specs.it/models/renamed/orig/trattrici-agricole--trazione-a-4-ruote-frutteto-80-classic-same.jpg',80,'frutteto'),(9,'Carraro','trattori',35000,'https://www.divincenzotractors.it/wp-content/uploads/2013/10/FruttetoBasso.jpg',90,'oliveto'),(10,'Grillo','motozzappe',1300,'https://www.graziotti.it/data/shop/imgarticolo.php?id=137&truesize=1',7,'2500 diesel'),(11,'Honda','motozzappe',1200,'https://www.agrifer.it/it/wp-content/uploads/2022/02/MOTOZAPPA-F220.webp',2,'f 220'),(12,'Honda','motozzappe',1100,'https://www.demasimacchineagricole.com/wp-content/uploads/2021/04/motozappa-honda-fj-500-se-completa-di-frese.png',4,'fj 500'),(13,'Vigor','motozzappe',900,'https://www.mondobrico.com/wp-content/uploads/8000597807.jpg',6,'vmxz 55'),(14,'OleoMac','motozzappe',500,'https://www.brichome.it/wp-content/uploads/2020/02/Motozappa-Oleo-Mac-MH-155-K-Prodotto-1200x1200.jpg.webp',3,'mh155k'),(15,'stihl','decespugliatori',700,'https://www.ferramentagiusti.com/images/shop/prodotti/decespugliatore-stihl-fs-260-r-diverse-versioni.jpg',3,'fs260r'),(16,'Bluebird','decespugliatori',400,'https://www.bluebirdind.ch/90059-large_default/decespugliatore-linea-bluebird-cg-520h.jpg',3,'CG 520H'),(17,'Honda','decespugliatori',600,'https://www.centroverderovigo.com/public/catalog/product/medium/decespugliatore-honda-umk-450-ue-000.jpg ',3,'UMK 450'),(18,'Stihl','decespugliatori',400,'https://giachinogarden.it/wp-content/uploads/2020/05/products-fs235r.jpg',3,'fs235r'),(19,'kawasaki','decespugliatori',500,'https://www.bestprato.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/d/e/decespugliatore-kawasaki.jpg',1,'tj35e'),(20,'stihl','motoseghe',2300,'https://www.ferramentagiusti.com/images/shop/prodotti/motosega-stihl-ms-881.jpg',7,'ms881'),(21,'stihl','motoseghe',1200,'https://www.mobiglia.it/storage/2022/01/stihl-ms-261-1.webp',3,'ms261 C-M'),(22,'MGF','motoseghe',150,'https://www.lineaverdegiardino.it/260-large_default/motosega-mgf-cs2500.jpg',1,' CS2500 m25'),(23,'MGF','motoseghe',350,'https://www.fiaba.net/wp-content/uploads/2021/07/MGF-motosega-tcs2600c-potatura-carving-fsx-scaled.jpg',1,' CS2500s carving'),(24,NULL,'accessori',2500,'https://app.renaioli.net/js/uploadify/files/ProductPicture/ARATRO-10-DISCHI-SERIE-T-20-TORRE-FRANCESCO1612173316.png ',NULL,'aratro10dischi'),(25,'Castoro','accessori',900,'https://grintoso.com/pub/media/catalog/product/cache/028a529ea23ae85c71a5920a099ca4d8/t/r/trinciaerba-sarmenti-per-trattori-grintoso-castoro125-13_7.jpg',NULL,'Trinciatrice per Trattori da 15 a 25 Hp'),(26,NULL,'accessori',3000,'https://th.bing.com/th/id/OIP.wLr_7uuts6YMp9unIxT1dgHaFj?w=252&h=189&c=7&r=0&o=5&dpr=1.3&pid=1.7',NULL,'Rimorchi cisterne con carrello'),(27,NULL,'accessori',3500,'https://th.bing.com/th/id/OIP.Ay_yEaur3eruEgjM753f-wHaFj?w=188&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7',NULL,'Rimorchio agricolo 40 Q'),(28,NULL,'ricambi',90,'https://www.agrilavor.com/131894-thickbox_default/sedile-trattore-cobo-gt60-guide-regolabili.jpg',NULL,'Sedile di ricambio per trattore'),(29,NULL,'ricambi',140,'https://i.ebayimg.com/images/g/c0MAAOSwsVVfT6Se/s-l1600.jpg',NULL,'Zavorra in ghisa per trattore 40 kg'),(31,NULL,'ricambi',300,'https://th.bing.com/th/id/OIP.CtxBt7eLvLgQWqVl-htKmAHaFj?w=287&h=215&c=7&r=0&o=5&dpr=1.3&pid=1.7',NULL,'DINAMO'),(32,NULL,'ricambi',410,'https://i.ebayimg.com/images/g/Zj0AAOSwxzxfpQKd/s-l1600.jpg',NULL,'Kit frizione diametro 250mm'),(33,NULL,'ricambi',300,'https://m.media-amazon.com/images/I/31Ab6CMf6iL._AC_.jpg',NULL,'Presa di forza a cardanico per trattore'),(34,NULL,'ricambi',160,'https://i.ebayimg.com/images/g/fRYAAOSwlvpfspbo/s-l1600.jpg',NULL,'Terzo punto idraulico per trattore'),(35,'Terra Plus','concimi',25,'https://www.gardenup.it/1587-large_default/terra-plus-vita-4-8-15-bacillus-subtilis-compo.jpg',NULL,'organo-minerali con batterio Bacillus subtilis'),(36,'URTIMAX','concimi',20,'https://www.gardenup.it/1587-large_default/terra-plus-vita-4-8-15-bacillus-subtilis-compo.jpg',NULL,'Terra acquatica 1L'),(37,'LERAVA','concimi',50,'https://m.media-amazon.com/images/I/51ybyUGGc6L._SY445_SX342_QL70_ML2_.jpg',NULL,'Concime per Agrumi organico - 800g'),(38,'TERRA VEGA','concimi',180,'https://m.media-amazon.com/images/I/51ybyUGGc6L._SY445_SX342_QL70_ML2_.jpg',NULL,'CANNA-TANICA 20L'),(39,'VIGORSTART','concimi',35,'https://i.ebayimg.com/images/g/fwsAAOSwaWZjyR5C/s-l1600.jpg',NULL,'CONCIME CON BORO PER ULIVO 25KG'),(40,'PAPILLON','concimi',35,'https://th.bing.com/th/id/OIP.ZH8FtndHl9oimsVA5CNKNAAAAA?w=194&h=194&c=7&r=0&o=5&dpr=1.3&pid=1.7',NULL,'CONCIME GRANULARE PER PRATO 2KG'),(41,'U-Power','dpi',60,'https://m.media-amazon.com/images/I/81oElnzI3XL._AC_SX679_.jpg',NULL,'Scarpe Antinfortunistiche Unisex'),(42,'Reflexx','dpi',10,'https://www.aerofeel.com/comceptr/uploads/guanti-spalmati-da-lavoro-in-nitrile.png',NULL,'guanti da lavoro in nitrile'),(43,NULL,'dpi',10,'https://www.cecchi-negozio.it/pub/media/catalog/product/cache/image/600x600/e9c3970ab036de70892d86c6d221abfe/o/c/occhialinautica_cecchi_.jpg',NULL,'Occhiali protettivi'),(44,'Oregon Waipoua','dpi',160,'https://www.cecchi-negozio.it/pub/media/catalog/product/cache/image/600x600/e9c3970ab036de70892d86c6d221abfe/o/c/occhialinautica_cecchi_.jpg',NULL,'Pantaloni Protettivi per Motosega, Tipo A');
/*!40000 ALTER TABLE `strumento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente`
--

DROP TABLE IF EXISTS `utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utente` (
  `id_utente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `numerotel` varchar(50) DEFAULT NULL,
  `ruolo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_utente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES (3,'Roberto','De Bari','robyd','robydebari2005@gmail.com','robb','3383004741','utente'),(4,'Roberto','De Bari','robyd','robydebari2005@gmail.com','robb','3383004741','utente'),(5,'rob','deb','robyd','ro','ro','34','utente');
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-20 16:35:01
