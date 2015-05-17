-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-05-2015 a las 16:40:29
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd_ginecologia`
--
CREATE DATABASE IF NOT EXISTS `bd_ginecologia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bd_ginecologia`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_control_prenatal`
--

CREATE TABLE IF NOT EXISTS `tbl_control_prenatal` (
  `Id_control_prenatal` int(11) NOT NULL,
  `Id_paciente` int(11) NOT NULL,
  `Fecha_consulta` date NOT NULL,
  `Ta` varchar(10) NOT NULL,
  `Peso` varchar(8) NOT NULL,
  `Au` int(11) NOT NULL,
  `Fcf` varchar(2) DEFAULT NULL,
  `Eg` varchar(11) DEFAULT NULL,
  `Cita` date NOT NULL,
  `Tipaje` int(11) NOT NULL,
  `Serologia_viral` varchar(500) NOT NULL,
  `Citologia` varchar(500) NOT NULL,
  `Lab_HB` int(11) NOT NULL,
  `Lab_HTO` int(11) NOT NULL,
  `Lab_PLAQ` int(11) NOT NULL,
  `Lab_CB` int(11) NOT NULL,
  `Lab_SEG` int(11) NOT NULL,
  `Lab_LINF` int(11) NOT NULL,
  `Lab_EOSF` int(11) NOT NULL,
  `Lab_GLICEMIA` int(11) NOT NULL,
  `Lab_UREA` int(11) NOT NULL,
  `Lab_CREATININA` int(11) NOT NULL,
  `Lab_TGO` int(11) NOT NULL,
  `Lab_TGP` int(11) NOT NULL,
  `Lab_LDH` int(11) NOT NULL,
  `Lab_BT` int(11) NOT NULL,
  `Lab_BD` int(11) NOT NULL,
  `Lab_NI` int(11) NOT NULL,
  `Lab_PROTEINAS_T` int(11) NOT NULL,
  `Lab_ELECTROLITOS` int(11) NOT NULL,
  `Lab_HIV` int(11) NOT NULL,
  `Lab_VDRL` int(11) NOT NULL,
  `Lab_PT` int(11) NOT NULL,
  `Lab_PTT` int(11) NOT NULL,
  `Uroanalisis` int(11) NOT NULL,
  `Urocultivo` int(11) NOT NULL,
  `Ecosonograma` varchar(500) DEFAULT NULL,
  `Observaciones` varchar(500) DEFAULT NULL,
  `Indicaciones` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ecosonogramas_result`
--

CREATE TABLE IF NOT EXISTS `tbl_ecosonogramas_result` (
  `Id_paciente` int(11) NOT NULL,
  `Id_ecosonogramas` int(11) NOT NULL,
  `Ut_AVF` int(11) NOT NULL,
  `Ut_RVF` int(11) NOT NULL,
  `Ut_Indiferente` int(11) NOT NULL,
  `Ut_Super_Regular` int(11) NOT NULL,
  `Ut_Super_Irregular` int(11) NOT NULL,
  `Ecopatron_Homog` int(11) NOT NULL,
  `Ecopatron_Heterog` int(11) NOT NULL,
  `Dimensiones_L` int(11) NOT NULL,
  `Dimensiones_AP` int(11) NOT NULL,
  `Dimensiones_T` int(11) NOT NULL,
  `Cervix_L` int(11) NOT NULL,
  `Cervix_AP` int(11) NOT NULL,
  `Ut_Otros` int(11) NOT NULL,
  `Interf_Endomet_Homog` int(11) NOT NULL,
  `Interf_Endomet_Hetero` int(11) NOT NULL,
  `Interf_Endomet_Espesor` int(11) NOT NULL,
  `Interf_Endomet_Otros` varchar(200) NOT NULL,
  `Ova_Dere_L` int(11) NOT NULL,
  `Ova_Dere_AP` int(11) NOT NULL,
  `Ova_Dere_T` int(11) NOT NULL,
  `Ova_Dere_VOL` int(11) NOT NULL,
  `Ova_Izq_L` int(11) NOT NULL,
  `Ova_Izq_AP` int(11) NOT NULL,
  `Ova_Izq_T` int(11) NOT NULL,
  `Ova_Izq_VOL` int(11) NOT NULL,
  `Ovarios_Otros` varchar(500) NOT NULL,
  `Fondo_Saco_Libre` int(11) NOT NULL,
  `Conclusiones` varchar(800) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_eco_primer_trimestre`
--

CREATE TABLE IF NOT EXISTS `tbl_eco_primer_trimestre` (
  `Ute_Anex_Longitudinal` int(11) NOT NULL,
`Id_Eco_Primer_Trimestre` int(11) NOT NULL,
  `Id_paciente` int(11) NOT NULL,
  `Ute_Anex_AP` int(11) NOT NULL,
  `Ute_Anex_Tranverso` int(11) NOT NULL,
  `Ute_Anex_Longitud_Cervical` int(11) NOT NULL,
  `Saco_Dms` int(11) NOT NULL,
  `Saco_Equivalente` int(11) NOT NULL,
  `Saco_Caracteristicas` int(11) NOT NULL,
  `Embrion_Visualizable` tinyint(1) DEFAULT NULL,
  `Embrion_Novisualizable` tinyint(1) DEFAULT NULL,
  `Embrion_Activ_Cardiaca` tinyint(1) DEFAULT NULL,
  `Embrion_Lcc` decimal(10,0) NOT NULL,
  `Embrion_Equivalente` varchar(200) NOT NULL,
  `Embrion_Viscula_Vitelina` decimal(10,0) NOT NULL,
  `Hallazgos` varchar(200) NOT NULL,
  `Conclusiones` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_eco_segundo_tercer_trimestre`
--

CREATE TABLE IF NOT EXISTS `tbl_eco_segundo_tercer_trimestre` (
  `Id_Eco_Segundo_Tercer_Trimestre` int(11) NOT NULL,
  `Id_Paciente` int(11) NOT NULL,
  `Fur` int(11) NOT NULL,
  `Fpp` int(11) NOT NULL,
  `Eg` int(11) NOT NULL,
  `Feto` int(11) NOT NULL,
  `Presentacion` int(11) NOT NULL,
  `Situacion` int(11) NOT NULL,
  `Posicion` int(11) NOT NULL,
  `Bio_Dbp` int(11) NOT NULL,
  `Bio_Femur` int(11) NOT NULL,
  `Bio_Cerebelo` int(11) NOT NULL,
  `Bio_Ila` int(11) NOT NULL,
  `Bio_Cc` int(11) NOT NULL,
  `Bio_Tibia` int(11) NOT NULL,
  `Bio_Atrio` int(11) NOT NULL,
  `Bio_Pef` int(11) NOT NULL,
  `Bio_Ca` int(11) NOT NULL,
  `Bio_Humero` int(11) NOT NULL,
  `Bio_C_Magna` int(11) NOT NULL,
  `Bio_Sexo` int(11) NOT NULL,
  `Nodf` int(11) NOT NULL,
  `Nopt` int(11) NOT NULL,
  `Noph` int(11) NOT NULL,
  `Anat_Craneo` int(11) NOT NULL,
  `Anat_Rinones` int(11) NOT NULL,
  `Anat_Columna` int(11) NOT NULL,
  `Anat_Estomago` int(11) NOT NULL,
  `Anat_Rostro` int(11) NOT NULL,
  `Anat_Vejiga` int(11) NOT NULL,
  `Anat_Corazon` int(11) NOT NULL,
  `Anat_Extremidades` int(11) NOT NULL,
  `Anat_Abdomen` int(11) NOT NULL,
  `Anat_Cordon` int(11) NOT NULL,
  `Anat_Intestino` int(11) NOT NULL,
  `Anat_Placenta` int(11) NOT NULL,
  `Perfil_Tono` int(11) NOT NULL,
  `Perfil_MF` int(11) NOT NULL,
  `Perfil_Mr` int(11) NOT NULL,
  `Perfil_La` int(11) NOT NULL,
  `Perfil_Puntos` int(11) NOT NULL,
  `Conclusiones` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_registro_paciente`
--

CREATE TABLE IF NOT EXISTS `tbl_registro_paciente` (
`Id_paciente` int(11) NOT NULL COMMENT 'Dato de conexion con otras tablas',
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(40) NOT NULL,
  `Ci` int(10) NOT NULL,
  `Fecha_nacimiento` date NOT NULL,
  `Tlf` varchar(17) DEFAULT NULL,
  `Direccion` varchar(250) NOT NULL,
  `Ant_familiares` varchar(150) DEFAULT NULL,
  `Ant_personsales` varchar(150) DEFAULT NULL,
  `Ant_gineco_menarquia` int(3) DEFAULT NULL,
  `Ant_gineco_sexarquia` int(3) DEFAULT NULL,
  `Num_parejas_sexuales` int(2) NOT NULL,
  `Ant_gineco_ciclos` varchar(10) NOT NULL,
  `Ant_gineco_gestas` varchar(10) NOT NULL,
  `Ant_gineco_paras` varchar(10) NOT NULL,
  `Ant_gineco_abortos` varchar(10) NOT NULL,
  `Ant_gineco_pmf` varchar(10) NOT NULL,
  `Ant_gineco_fur` date NOT NULL,
  `Ant_gineco_fpp` date NOT NULL,
  `Ant_gineco_eg` varchar(12) NOT NULL,
  `Ta` varchar(10) NOT NULL,
  `Peso` varchar(8) NOT NULL,
  `Talla` varchar(5) NOT NULL,
  `General` varchar(50) NOT NULL,
  `Mamas` varchar(100) NOT NULL,
  `Abdomen` varchar(100) NOT NULL,
  `Genitales_Externos` varchar(50) NOT NULL,
  `Vagina_Cuello_Uterino` varchar(50) NOT NULL,
  `Utero_Anexos` varchar(50) NOT NULL,
  `Colposcopia` varchar(100) NOT NULL,
  `Tscto_Rectal` varchar(150) NOT NULL,
  `Diagnostico` varchar(200) NOT NULL,
  `Plan` varchar(150) NOT NULL,
  `Tipeaje` varchar(10) NOT NULL,
  `Tipeaje_Pareja` varchar(10) NOT NULL,
  `Vih` varchar(5) NOT NULL,
  `Vih_Fecha` date NOT NULL,
  `Vdrl` varchar(5) NOT NULL,
  `Vdrl_Fecha` date NOT NULL,
  `Nota` varchar(50) NOT NULL,
  `Hep_B` varchar(8) NOT NULL,
  `Hep_B_Fecha` date NOT NULL,
  `Hep_C` varchar(8) NOT NULL,
  `Hep_C_Fecha` date NOT NULL,
  `Toxotest` varchar(8) NOT NULL,
  `Toxotest_Fecha` date NOT NULL,
  `Cmv` varchar(8) NOT NULL,
  `Cmv_Fecha` date NOT NULL,
  `Rubeola` varchar(8) NOT NULL,
  `Rubeola_Fecha` date NOT NULL,
  `Hs` varchar(8) NOT NULL,
  `Hs_Fecha` date NOT NULL,
  `Hc` varchar(8) NOT NULL,
  `Hc_Fecha` date NOT NULL,
  `Gb` int(11) NOT NULL,
  `Leucocitos` int(11) NOT NULL,
  `Plaquetas` int(11) NOT NULL,
  `Hb` int(11) NOT NULL,
  `Hcto` int(11) NOT NULL,
  `Quimica` date NOT NULL,
  `Glicemia` int(11) NOT NULL,
  `Urea` int(11) NOT NULL,
  `Creatinina` varchar(8) NOT NULL,
  `Ast` int(11) NOT NULL,
  `Alt` int(11) NOT NULL,
  `Colesterol` int(11) NOT NULL,
  `Trigliceridos` int(11) NOT NULL,
  `Uroanalisis` varchar(20) NOT NULL,
  `Uroanalisis_Fecha` date NOT NULL,
  `Citologia` varchar(100) NOT NULL,
  `Citologia_Fecha` date NOT NULL,
  `Citologia_Otros` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_control_prenatal`
--
ALTER TABLE `tbl_control_prenatal`
 ADD PRIMARY KEY (`Id_control_prenatal`), ADD KEY `Id_paciente` (`Id_control_prenatal`), ADD KEY `Id_paciente_2` (`Id_paciente`);

--
-- Indices de la tabla `tbl_ecosonogramas_result`
--
ALTER TABLE `tbl_ecosonogramas_result`
 ADD PRIMARY KEY (`Id_ecosonogramas`);

--
-- Indices de la tabla `tbl_eco_primer_trimestre`
--
ALTER TABLE `tbl_eco_primer_trimestre`
 ADD PRIMARY KEY (`Id_Eco_Primer_Trimestre`);

--
-- Indices de la tabla `tbl_eco_segundo_tercer_trimestre`
--
ALTER TABLE `tbl_eco_segundo_tercer_trimestre`
 ADD PRIMARY KEY (`Id_Eco_Segundo_Tercer_Trimestre`);

--
-- Indices de la tabla `tbl_registro_paciente`
--
ALTER TABLE `tbl_registro_paciente`
 ADD PRIMARY KEY (`Id_paciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_eco_primer_trimestre`
--
ALTER TABLE `tbl_eco_primer_trimestre`
MODIFY `Id_Eco_Primer_Trimestre` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tbl_registro_paciente`
--
ALTER TABLE `tbl_registro_paciente`
MODIFY `Id_paciente` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Dato de conexion con otras tablas';
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_control_prenatal`
--
ALTER TABLE `tbl_control_prenatal`
ADD CONSTRAINT `tbl_control_prenatal_ibfk_1` FOREIGN KEY (`Id_paciente`) REFERENCES `tbl_registro_paciente` (`Id_paciente`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
