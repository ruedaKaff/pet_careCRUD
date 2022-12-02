-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2022 a las 11:21:04
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdspringtest`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultas`
--

CREATE TABLE `consultas` (
  `id_consulta` bigint(20) NOT NULL,
  `id_mascota` bigint(20) NOT NULL,
  `motivo` varchar(255) DEFAULT NULL,
  `servicio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consultas`
--

INSERT INTO `consultas` (`id_consulta`, `id_mascota`, `motivo`, `servicio`) VALUES
(1, 2, 'El perro ha subido mucho de peso', 'Examenes de sangre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_mascota`
--

CREATE TABLE `datos_mascota` (
  `id_mascota` bigint(20) NOT NULL,
  `edad_mascota` varchar(255) DEFAULT NULL,
  `foto_mascota` varchar(255) DEFAULT NULL,
  `nombre_mascota` varchar(255) DEFAULT NULL,
  `tipo_mascota` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `datos_mascota`
--

INSERT INTO `datos_mascota` (`id_mascota`, `edad_mascota`, `foto_mascota`, `nombre_mascota`, `tipo_mascota`) VALUES
(1, '3 anios', 'https://www.joelsartore.com/wp-content/uploads/stock/ANI085/ANI085-00029.jpg', 'Lupe', 'Gato criollo'),
(2, '6 anios', 'https://listovative.com/wp-content/uploads/2014/08/413380.jpg', 'luka', 'Perro golden');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` bigint(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `correo`, `nombre`, `password`, `username`) VALUES
(1, 'correo@uts.edu.co', 'jhan', '$2a$10$QpwxFxjaWLK4I4poO5VKsOt3ly45/Dmf8W30n4KIRv/0TeJHDyuBS', 'admin'),
(2, 'correso@uts.edu.co', 'yoyo', '$2a$10$smvOBbKdZbEfXYbm1kGBs..n1PpXQg6gHCR1VJsUfMtJaE3lDfTbq', 'yoyo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consultas`
--
ALTER TABLE `consultas`
  ADD PRIMARY KEY (`id_consulta`),
  ADD KEY `id_mascota` (`id_mascota`);

--
-- Indices de la tabla `datos_mascota`
--
ALTER TABLE `datos_mascota`
  ADD PRIMARY KEY (`id_mascota`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_cdmw5hxlfj78uf4997i3qyyw5` (`correo`),
  ADD UNIQUE KEY `UK_m2dvbwfge291euvmk6vkkocao` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `consultas`
--
ALTER TABLE `consultas`
  MODIFY `id_consulta` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `datos_mascota`
--
ALTER TABLE `datos_mascota`
  MODIFY `id_mascota` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consultas`
--
ALTER TABLE `consultas`
  ADD CONSTRAINT `consultas_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `datos_mascota` (`id_mascota`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
