-- MySQL dump 10.13  Distrib 5.5.15, for Win64 (x86)
--
-- Host: localhost    Database: servicio_clinico
-- ------------------------------------------------------
-- Server version	5.5.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
create database servicio_clinico;
use servicio_clinico;
--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `codigo` varchar(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `respuestas` varchar(30) NOT NULL,
  `nivelmadurez` varchar(15) NOT NULL,
  `eleccionprofesional` varchar(15) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES ('0001','Cristhel','gonzalesmartinezcristhel@gmail.com ',17,'F','OAAAAAOOOOAOOAANAAAAAANAAANAOO','Alto','Música'),('0002','Rebeca','rebecamiranda4444@gmail.com',18,'F','ANANNNAANAANNNNNAAAAANNNNNNNNN','Medio','No decidi aun'),('0003','Valeria','avirvarela1@gmail.com',17,'F','ONAAANAAAAANNNNAANANAOANNNNNAA','Medio','Finanzas'),('0004','Carlos','carlos_ardiles@hotmail.com',18,'M','NANOAONOAANAAANNNONNANNNNAAOAA','Medio','Psicopedagogia');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `preguntas` (
  `preg1` varchar(200) DEFAULT NULL,
  `preg2` varchar(200) DEFAULT NULL,
  `preg3` varchar(200) DEFAULT NULL,
  `preg4` varchar(200) DEFAULT NULL,
  `preg5` varchar(200) DEFAULT NULL,
  `preg6` varchar(200) DEFAULT NULL,
  `preg7` varchar(200) DEFAULT NULL,
  `preg8` varchar(200) DEFAULT NULL,
  `preg9` varchar(200) DEFAULT NULL,
  `preg10` varchar(200) DEFAULT NULL,
  `preg11` varchar(200) DEFAULT NULL,
  `preg12` varchar(200) DEFAULT NULL,
  `preg13` varchar(200) DEFAULT NULL,
  `preg14` varchar(200) DEFAULT NULL,
  `preg15` varchar(200) DEFAULT NULL,
  `preg16` varchar(200) DEFAULT NULL,
  `preg17` varchar(200) DEFAULT NULL,
  `preg18` varchar(200) DEFAULT NULL,
  `preg19` varchar(200) DEFAULT NULL,
  `preg20` varchar(200) DEFAULT NULL,
  `preg21` varchar(200) DEFAULT NULL,
  `preg22` varchar(200) DEFAULT NULL,
  `preg23` varchar(200) DEFAULT NULL,
  `preg24` varchar(200) DEFAULT NULL,
  `preg25` varchar(200) DEFAULT NULL,
  `preg26` varchar(200) DEFAULT NULL,
  `preg27` varchar(200) DEFAULT NULL,
  `preg28` varchar(200) DEFAULT NULL,
  `preg29` varchar(200) DEFAULT NULL,
  `preg30` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
INSERT INTO `preguntas` VALUES ('Mis padres saben mejor que nadie lo que yo tengo que estudiar.','Yo pienso escoger la carrera que me recomienden las personas que saben.','Al momento de escoger una carrera uno/a debe tomar en cuenta la profesion que desempeñan sus padres.','Cuando llegue el momento yo decidiré, ahora no tengo porque pensar en el futuro.','Me cuesta mucho decidir por mi mismo/a, ojalá  que hubiera alguien que me dijera lo que debo escoger.','Tengo la impresión de que sirvo para muy pocas cosas.','He preguntado a otras personas para que me aclaren dudas que tengo sobre las carreras.','He leido artículos que hablan sobre las profesiones.','He recibido la ayuda de un orientador, psicólogo o profesor en asuntos vocacionales.','He consultado con mis padres acerca de la carrera que me conviene.','He intercambiado con compañeros/as o amigos/as acerca de lo que pienso hacer después de que termine mis estudios','He solicitado catálogos, programas de estudio, o bien programas de becas a una o más instituciones. (Contesta De acuerdo únicamente si fuiste tú quien tomó la decisión).','Tengo muy poca información acerca de las ocupaciones que existen en Bolivia.','El trabajo es una actividad desagradable que tenemos que realizar por obligaci¢n.','Estoy enterado/a de las especializaciones que derivan de mi carrera elegida.','No sé cuales son las ocupaciones que estan haciendo mas falta.','Tengo bien claro cu les son mis gustos y mis intereses vocacionales.','Para tener éxito en el trabajo hay que olvidar un poco los compromisos familiares y los de amistad.','Para escoger bien hay que pensar en las cosas buenas y malas que tiene cada carrera.','Es mejor no pensar mucho y decidirse de una vez.','Solo hay una profesión adecuada para cada personas.','Ya decid¡ la carrera que voy a escoger.','He aprendido a tomar desiciones de una forma sistem tica y racional.','El temor a fracasar no me deja decidir con tranquilidad.','Tengo dudas acerca de cuales son mis verdaderas habilidades.','Me gustan carreras muy diferentes.','Si una persona no puede estudiar lo que quiere se frustra para toda la vida.','Estoy confuso/a acerca de lo que soy y de lo que debo hacer en el futuro.','He cambiado mucho de opinión con relación a la carrera que me gusta.','No me gusta ninguna de las carreras que conozco.');
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesional`
--

DROP TABLE IF EXISTS `profesional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesional` (
  `codigo` varchar(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `contrasena` varchar(20) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesional`
--

LOCK TABLES `profesional` WRITE;
/*!40000 ALTER TABLE `profesional` DISABLE KEYS */;
INSERT INTO `profesional` VALUES ('1111','Bruno Bustos','samael8496@gmail.com','4901627'),('1112','Daniel Apaza','danielapaza@gmail.com','1234567'),('1113','Juana Melgarejo','melgarejo_juana@gmail.com','7654321');
/*!40000 ALTER TABLE `profesional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `respuestas`
--

DROP TABLE IF EXISTS `respuestas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `respuestas` (
  `codigo` varchar(4) NOT NULL,
  `tipoderespuesta` varchar(10) NOT NULL,
  `respuestas` varchar(30) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuestas`
--

LOCK TABLES `respuestas` WRITE;
/*!40000 ALTER TABLE `respuestas` DISABLE KEYS */;
/*!40000 ALTER TABLE `respuestas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'servicio_clinico'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-11 22:11:08
