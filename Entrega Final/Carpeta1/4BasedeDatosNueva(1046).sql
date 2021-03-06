/*
 Navicat Premium Data Transfer

 Source Server         : BrunoBustos
 Source Server Type    : MySQL
 Source Server Version : 50515
 Source Host           : localhost:3306
 Source Schema         : servicio_clinico

 Target Server Type    : MySQL
 Target Server Version : 50515
 File Encoding         : 65001

 Date: 14/06/2021 10:34:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

create database servicio_clinico;
use servicio_clinico;
-- ----------------------------
-- Table structure for alumno
-- ----------------------------
DROP TABLE IF EXISTS `alumno`;
CREATE TABLE `alumno`  (
  `codigo` varchar(4) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `correo` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` varchar(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `respuestas` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nivelmadurez` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `eleccionprofesional` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`codigo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of alumno
-- ----------------------------
INSERT INTO `alumno` VALUES ('0001', 'Cristhel', 'mart_cristhel@gmail.com', 17, 'F', 'OAAAAAOOOOAOOAANAAAAAANAAANAOO', 'Alto', 'Musica');
INSERT INTO `alumno` VALUES ('0002', 'Rebeca', 'reb_miran@gmail.com', 18, 'F', 'ANANNNAANAANNNNNAAAAANNNNNNNNN', 'Medio', 'No decidi aun');
INSERT INTO `alumno` VALUES ('0003', 'Valeria', 'avirvar1@gmail.com', 17, 'F', 'ONAAANAAAAANNNNAANANAOANNNNNAA', 'Medio', 'Finanzas');

-- ----------------------------
-- Table structure for preguntas
-- ----------------------------
DROP TABLE IF EXISTS `preguntas`;
CREATE TABLE `preguntas`  (
  `preg1` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg2` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg3` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg4` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg5` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg6` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg7` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg8` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg9` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg10` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg11` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg12` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg13` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg14` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg15` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg16` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg17` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg18` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg19` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg20` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg21` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg22` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg23` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg24` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg25` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg26` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg27` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg28` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg29` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `preg30` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of preguntas
-- ----------------------------
INSERT INTO `preguntas` VALUES ('Mis padres saben mejor que nadie lo que yo tengo que estudiar.', 'Yo pienso escoger la carrera que me recomienden las personas que saben.', 'Al momento de escoger una carrera uno/a debe tomar en cuenta la profesion que desempenan sus padres.', 'Cuando llegue el momento yo decidire, ahora no tengo porque pensar en el futuro.', 'Me cuesta mucho decidir por mi mismo/a, ojala?? que hubiera alguien que me dijera lo que debo escoger.', 'Tengo la impresi??n de que sirvo para muy pocas cosas.', 'He preguntado a otras personas para que me aclaren dudas que tengo sobre las carreras.', 'He leido articulos que hablan sobre las profesiones.', 'He recibido la ayuda de un orientador, psicologo o profesor en asuntos vocacionales.', 'He consultado con mis padres acerca de la carrera que me conviene.', 'He intercambiado con companeros/as o amigos/as acerca de lo que pienso hacer despues de que termine mis estudios.', 'He solicitado catalogos, programas de estudio, o bien programas de becas a una o mas instituciones. (Contesta De acuerdo ??nicamente si fuiste tu quien tomo la decision).', 'Tengo muy poca informacion acerca de las ocupaciones que existen en Bolivia.', 'El trabajo es una actividad desagradable que tenemos que realizar por obligacion.', 'Estoy enterado/a de las especializaciones que derivan de mi carrera elegida.', 'No se cuales son las ocupaciones que estan haciendo mas falta.', 'Tengo bien claro cuales son mis gustos y mis intereses vocacionales.', 'Para tener exito en el trabajo hay que olvidar un poco los compromisos familiares y los de amistad.', 'Para escoger bien hay que pensar en las cosas buenas y malas que tiene cada carrera.', 'Es mejor no pensar mucho y decidirse de una vez.', 'Solo hay una profesion adecuada para cada persona.', 'Ya decidi la carrera que voy a escoger.', 'He aprendido a tomar desiciones de una forma sistematica y racional.', 'El temor a fracasar no me deja decidir con tranquilidad.', 'Tengo dudas acerca de cuales son mis verdaderas habilidades.', 'Me gustan carreras muy diferentes.', 'Si una persona no puede estudiar lo que quiere se frustra para toda la vida.', 'Estoy confuso/a acerca de lo que soy y de lo que debo hacer en el futuro.', 'He cambiado mucho de opinion con relacion a la carrera que me gusta.', 'No me gusta ninguna de las carreras que conozco.');

-- ----------------------------
-- Table structure for profesional
-- ----------------------------
DROP TABLE IF EXISTS `profesional`;
CREATE TABLE `profesional`  (
  `codigo` varchar(4) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `correo` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `contrasena` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`codigo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of profesional
-- ----------------------------
INSERT INTO `profesional` VALUES ('1111', 'Bruno Bustos', 'samael8496@gmail.com', '4901627');
INSERT INTO `profesional` VALUES ('1112', 'Daniel Apaza', 'danielapaza@gmail.com', '1234567');
INSERT INTO `profesional` VALUES ('1113', 'Juana Melgarejo', 'melgarejo_juana@gmail.com', '7654321');

SET FOREIGN_KEY_CHECKS = 1;
