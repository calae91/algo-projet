
-- phpMyAdmin SQL Dump
-- version 2.11.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 29, 2016 at 04:55 AM
-- Server version: 5.1.57
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `a9269715_alphuez`
--

-- --------------------------------------------------------

--
-- Table structure for table `Pistes`
--

CREATE TABLE `Pistes` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `REMONTEE` varchar(60) COLLATE latin1_general_ci NOT NULL,
  `NAME` varchar(45) COLLATE latin1_general_ci NOT NULL,
  `COLOR` varchar(45) COLLATE latin1_general_ci NOT NULL,
  `TIME` int(11) NOT NULL,
  `START` varchar(45) COLLATE latin1_general_ci NOT NULL,
  `FINISH` varchar(45) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=156 ;

--
-- Dumping data for table `Pistes`
--

INSERT INTO `Pistes` VALUES(1, '0', 'Vaujaniate', 'Blue', 8, '22', '24');
INSERT INTO `Pistes` VALUES(2, 'Télésiège', 'Auris Express', 'Yellow', 6, '1', '4');
INSERT INTO `Pistes` VALUES(3, 'Télésiège', 'Sures', 'Yellow', 6, '1', '9');
INSERT INTO `Pistes` VALUES(4, 'Téléski', 'Forêt', 'Orange', 2, '132', '10');
INSERT INTO `Pistes` VALUES(5, 'Teleski', 'Piegut', 'Orange', 1, '1', '11');
INSERT INTO `Pistes` VALUES(6, 'Télésiège', 'COL', 'Yellow', 5, '1', '8');
INSERT INTO `Pistes` VALUES(7, 'Télésiège', 'Maronne', 'Yellow', 5, '5', '9');
INSERT INTO `Pistes` VALUES(8, 'Télésiège', 'Louvets', 'Yellow', 4, '12', '4');
INSERT INTO `Pistes` VALUES(9, 'Télésiège', 'Lombards', 'Yellow', 6, '14', '7');
INSERT INTO `Pistes` VALUES(10, 'Télésiège', 'Fontfroide', 'Yellow', 4, '15', '3');
INSERT INTO `Pistes` VALUES(11, 'Télésiège', 'Alpauris Partie Auris (Sens Huez-Auris)', 'Yellow', 5, '13', '12');
INSERT INTO `Pistes` VALUES(12, 'Télésiège', 'Alpauris Partie Auris (Sens Auris-Huez)', 'Yellow', 5, '13', '12');
INSERT INTO `Pistes` VALUES(13, 'Télésiège', 'Alpauris Partie Huez (Sens Auris-Huez)', 'Yellow', 7, '13', '17');
INSERT INTO `Pistes` VALUES(14, 'Télésiège', 'Alpauris Partie Auris (Sens Huez-Auris)', 'Yellow', 7, '17', '13');
INSERT INTO `Pistes` VALUES(15, 'Télésiège', 'Chalvet', 'Yellow', 6, '16', '53');
INSERT INTO `Pistes` VALUES(16, 'Télécabine', 'Télévillage (Montée)', 'Violet', 9, '6', '19');
INSERT INTO `Pistes` VALUES(17, 'Télécabine', 'Télévillage (Descente)', 'Violet', 9, '19', '6');
INSERT INTO `Pistes` VALUES(18, 'Télécabine', 'Marmottes I', 'Violet', 8, '17', '46');
INSERT INTO `Pistes` VALUES(19, 'Télécabine', 'Marmottes II', 'Violet', 6, '46', '47');
INSERT INTO `Pistes` VALUES(20, 'Télécabine', 'Marmottes III', 'Violet', 7, '47', '70');
INSERT INTO `Pistes` VALUES(21, 'Télésiège', 'Herpie', 'Yellow', 7, '64', '70');
INSERT INTO `Pistes` VALUES(22, 'Télécabine', 'Marmottes III - Retour', 'Violet', 7, '70', '47');
INSERT INTO `Pistes` VALUES(23, 'Télécabine', 'Marmottes II - Retour', 'Violet', 6, '47', '46');
INSERT INTO `Pistes` VALUES(24, 'Télécabine', 'Marmottes I - Retour', 'Violet', 8, '46', '17');
INSERT INTO `Pistes` VALUES(25, 'Télécabine', 'Pic Blanc ', 'Violet', 3, '37', '49');
INSERT INTO `Pistes` VALUES(26, 'Télécabine', 'Pic Blanc - Retour', 'Violet', 3, '49', '37');
INSERT INTO `Pistes` VALUES(27, 'Télécabine', '1er Tronçon', 'Violet', 8, '20', '38');
INSERT INTO `Pistes` VALUES(28, 'Télécabine', '1er Tronçon - Retour', 'Violet', 8, '38', '20');
INSERT INTO `Pistes` VALUES(29, 'Télécabine', '2ème Tronçon', 'Violet', 8, '38', '37');
INSERT INTO `Pistes` VALUES(30, 'Télécabine', '2ème Tronçon - Retour', 'Violet', 8, '37', '38');
INSERT INTO `Pistes` VALUES(31, 'Télésiège', 'Glacier', 'Yellow', 5, '70', '49');
INSERT INTO `Pistes` VALUES(32, 'Télésiège', 'Lièvre Blanc', 'Yellow', 10, '38', '88');
INSERT INTO `Pistes` VALUES(33, 'Télésiège', 'Romains', 'Yellow', 9, '17', '44');
INSERT INTO `Pistes` VALUES(34, 'Télésiège', 'Rifnel Express', 'Yellow', 5, '17', '124');
INSERT INTO `Pistes` VALUES(35, 'Téléski', 'Rifnel', 'Orange', 3, '17', '125');
INSERT INTO `Pistes` VALUES(36, 'Téléski', 'JEUX', 'Orange', 10, '20', '38');
INSERT INTO `Pistes` VALUES(37, 'Téléski', 'ECOLE', 'Orange', 3, '122', '123');
INSERT INTO `Pistes` VALUES(38, 'Téléski', 'Babars', 'Orange', 3, '120', '121');
INSERT INTO `Pistes` VALUES(39, 'Téléski', 'Sagnes', 'Orange', 3, '129', '130');
INSERT INTO `Pistes` VALUES(40, 'Téléski', 'Sarrasins', 'Orange', 4, '130', '131');
INSERT INTO `Pistes` VALUES(41, 'Téléski', 'Poutran', 'Orange', 4, '119', '118');
INSERT INTO `Pistes` VALUES(42, 'Télésiège', 'Signal', 'Yellow', 7, '20', '21');
INSERT INTO `Pistes` VALUES(43, 'Téléski', 'Stade', 'Orange', 5, '20', '68');
INSERT INTO `Pistes` VALUES(44, 'Téléski', 'Schuss', 'Orange', 2, '20', '68');
INSERT INTO `Pistes` VALUES(45, 'Télésiège', 'Grande Sure', 'Yellow', 7, '19', '21');
INSERT INTO `Pistes` VALUES(46, 'Télésiège', 'Petit Prince', 'Yellow', 6, '66', '21');
INSERT INTO `Pistes` VALUES(47, 'Télésiège', 'Le Villarais', 'Yellow', 15, '50', '21');
INSERT INTO `Pistes` VALUES(48, 'Téléski', 'Tortue', 'Orange', 2, '105', '106');
INSERT INTO `Pistes` VALUES(49, 'Téléski', 'Langaret', 'Orange', 4, '105', '108');
INSERT INTO `Pistes` VALUES(50, 'Téléski', 'Cloudit', 'Orange', 3, '50', '108');
INSERT INTO `Pistes` VALUES(51, 'Téléski', 'Clos du Pré', 'Orange', 4, '90', '91');
INSERT INTO `Pistes` VALUES(52, 'Téléski', 'Champ Clotury', 'Orange', 4, '82', '33');
INSERT INTO `Pistes` VALUES(53, 'Téléski', 'Olmet', 'Orange', 3, '62', '99');
INSERT INTO `Pistes` VALUES(54, 'Télécabine', 'Poutran I', 'Violet', 7, '62', '33');
INSERT INTO `Pistes` VALUES(55, 'Télécabine', 'Poutran II', 'Violet', 10, '33', '21');
INSERT INTO `Pistes` VALUES(56, 'Télécabine', 'L''Alpette', 'Violet', 15, '62', '30');
INSERT INTO `Pistes` VALUES(57, 'Télécabine', 'L''Alpette - Retour', 'Violet', 15, '30', '62');
INSERT INTO `Pistes` VALUES(58, 'Télécabine', 'Poutran II - Retour', 'Violet', 10, '21', '33');
INSERT INTO `Pistes` VALUES(59, 'Télécabine', 'Poutran I - Retour', 'Violet', 7, '33', '62');
INSERT INTO `Pistes` VALUES(60, 'Téléski', 'L''Alpette', 'Orange', 5, '71', '30');
INSERT INTO `Pistes` VALUES(61, 'Téléski', 'Lama', 'Orange', 5, '93', '30');
INSERT INTO `Pistes` VALUES(62, 'Télécabine', 'Alpette-Rousses', 'Violet', 15, '30', '36');
INSERT INTO `Pistes` VALUES(63, 'Télécabine', 'Alpette-Rousses - Retour', 'Violet', 15, '36', '30');
INSERT INTO `Pistes` VALUES(64, 'Télécabine', 'Vaujany Alpette', 'Violet', 20, '25', '30');
INSERT INTO `Pistes` VALUES(65, 'Télécabine', 'Vaujany Alpette - Retour', 'Violet', 20, '30', '25');
INSERT INTO `Pistes` VALUES(66, 'Télécabine', 'Vaujany-Enversin (sens V-E)', 'Violet', 10, '25', '27');
INSERT INTO `Pistes` VALUES(67, 'Télécabine', 'Vaujany-Enversin (sens E-V)', 'Violet', 10, '27', '25');
INSERT INTO `Pistes` VALUES(68, 'Téléski', 'Combe Bénite', 'Orange', 3, '98', '97');
INSERT INTO `Pistes` VALUES(69, 'Télécabine', 'Vaujany Vilette ', 'Violet', 5, '25', '24');
INSERT INTO `Pistes` VALUES(70, 'Télécabine', 'Vaujany Villette - Retour', 'Violet', 5, '24', '25');
INSERT INTO `Pistes` VALUES(71, 'Télécabine', 'Villette MontFrais', 'Violet', 15, '24', '22');
INSERT INTO `Pistes` VALUES(72, 'Télécabine', 'Villette MontFrais - Retour', 'Violet', 15, '22', '24');
INSERT INTO `Pistes` VALUES(73, 'Télésiège', 'Vallonnet ', 'Yellow', 6, '22', '23');
INSERT INTO `Pistes` VALUES(74, 'Télésiège', 'Montfrais', 'Yellow', 7, '22', '28');
INSERT INTO `Pistes` VALUES(75, 'Téléski', 'Montfrais', 'Orange', 5, '22', '94');
INSERT INTO `Pistes` VALUES(76, 'Téléski', 'Montfrais II', 'Orange', 7, '94', '95');
INSERT INTO `Pistes` VALUES(77, 'Télésiège', 'Clos Giraud', 'Yellow', 6, '95', '30');
INSERT INTO `Pistes` VALUES(78, '0', 'Edelweiss', 'Blue', 5, '23', '22');
INSERT INTO `Pistes` VALUES(79, '0', 'Sapins', 'Green', 4, '97', '98');
INSERT INTO `Pistes` VALUES(80, '0', 'Sapins II', 'Green', 3, '97', '27');
INSERT INTO `Pistes` VALUES(81, '0', 'Pré-rond I', 'Blue', 9, '3', '26');
INSERT INTO `Pistes` VALUES(82, '0', 'Fontfroide', 'Red', 10, '3', '15');
INSERT INTO `Pistes` VALUES(83, '0', 'Fontfroide / Escapade', 'Red', 5, '3', '26');
INSERT INTO `Pistes` VALUES(84, '0', 'Fontfroide Express', 'Red', 5, '3', '4');
INSERT INTO `Pistes` VALUES(85, '0', 'Pré-Rond II', 'Blue', 1, '26', '4');
INSERT INTO `Pistes` VALUES(86, '0', 'Escapade', 'Red', 5, '26', '8');
INSERT INTO `Pistes` VALUES(87, '0', 'Col I', 'Blue', 4, '4', '40');
INSERT INTO `Pistes` VALUES(88, '0', 'Col II', 'Blue', 3, '40', '8');
INSERT INTO `Pistes` VALUES(89, '0', 'Col III', 'Blue', 6, '8', '1');
INSERT INTO `Pistes` VALUES(90, '0', 'FontFroide Maronne', 'Red', 8, '3', '40');
INSERT INTO `Pistes` VALUES(91, '0', 'Maronne I', 'Red', 3, '4', '40');
INSERT INTO `Pistes` VALUES(92, '0', 'Maronne II', 'Red', 4, '40', '61');
INSERT INTO `Pistes` VALUES(93, '0', 'Les Farcis', 'Blue', 8, '8', '60');
INSERT INTO `Pistes` VALUES(94, '0', 'Rhodos', 'Red', 5, '9', '60');
INSERT INTO `Pistes` VALUES(95, '0', 'Gentianes', 'Blue', 4, '9', '8');
INSERT INTO `Pistes` VALUES(96, '0', 'Stade', 'Red', 3, '9', '8');
INSERT INTO `Pistes` VALUES(97, '0', 'Corniche I', 'Green', 2, '9', '57');
INSERT INTO `Pistes` VALUES(98, '0', 'Corniche II', 'Green', 4, '57', '54');
INSERT INTO `Pistes` VALUES(99, '0', 'Corniche Ravin', 'Blue', 3, '57', '54');
INSERT INTO `Pistes` VALUES(100, '0', 'Coniche Foret', 'Green', 5, '54', '132');
INSERT INTO `Pistes` VALUES(101, '0', 'Corniche Piegut ', 'Green', 5, '54', '11');
INSERT INTO `Pistes` VALUES(102, '0', 'Crocus', 'Green', 4, '11', '1');
INSERT INTO `Pistes` VALUES(103, '0', 'Foret Auris', 'Green', 3, '132', '1');
INSERT INTO `Pistes` VALUES(104, '0', 'Marmottes', 'Green', 4, '10', '132');
INSERT INTO `Pistes` VALUES(105, '0', 'Epicéas', 'Blue', 4, '10', '132');
INSERT INTO `Pistes` VALUES(106, '0', 'Eterlous', 'Green', 7, '4', '12');
INSERT INTO `Pistes` VALUES(107, '0', 'Demoiselles', 'Blue', 5, '4', '12');
INSERT INTO `Pistes` VALUES(108, '0', 'Vernettes ', 'Red', 9, '3', '15');
INSERT INTO `Pistes` VALUES(109, '0', 'Vernettes Le Gua', 'Red', 5, '3', '42');
INSERT INTO `Pistes` VALUES(110, '0', 'Le Gua I', 'Green', 3, '4', '42');
INSERT INTO `Pistes` VALUES(111, '0', 'Lys I', 'Blue', 0, '42', '45');
INSERT INTO `Pistes` VALUES(112, '0', 'Col de Cluy', 'Black', 5, '3', '59');
INSERT INTO `Pistes` VALUES(113, '0', 'Bergeries', 'Black', 6, '3', '133');
INSERT INTO `Pistes` VALUES(114, '0', 'Martagons I', 'Blue', 2, '7', '133');
INSERT INTO `Pistes` VALUES(115, '0', 'la Gua II', 'Green', 1, '42', '133');
INSERT INTO `Pistes` VALUES(116, '0', 'Martagons II', 'Blue', 0, '133', '45');
INSERT INTO `Pistes` VALUES(117, '0', 'Martagons III', 'Blue', 5, '45', '15');
INSERT INTO `Pistes` VALUES(118, '0', 'Lys II', 'Blue', 5, '45', '14');
INSERT INTO `Pistes` VALUES(119, '0', 'Bergeries II', 'Black', 1, '133', '117');
INSERT INTO `Pistes` VALUES(120, '0', 'Lys II Bis', 'Blue', 4, '117', '14');
INSERT INTO `Pistes` VALUES(121, '0', 'Le Gua III', 'Green', 5, '133', '16');
INSERT INTO `Pistes` VALUES(122, '0', 'Sarennes Finish', 'Black', 4, '59', '16');
INSERT INTO `Pistes` VALUES(123, '0', 'Le Gua IV', 'Green', 3, '16', '14');
INSERT INTO `Pistes` VALUES(124, '0', 'le Gua V', 'Green', 4, '14', '13');
INSERT INTO `Pistes` VALUES(125, '0', 'Hermine', 'Blue', 5, '70', '64');
INSERT INTO `Pistes` VALUES(126, '0', 'Cristallière', 'Blue', 6, '70', '64');
INSERT INTO `Pistes` VALUES(127, '0', 'Herpie', 'Blue', 8, '70', '64');
INSERT INTO `Pistes` VALUES(128, '0', 'Sarenne I', 'Black', 4, '49', '72');
INSERT INTO `Pistes` VALUES(129, '0', 'Sarenne II', 'Black', 6, '72', '64');
INSERT INTO `Pistes` VALUES(130, '0', 'Chateau Noir I', 'Black', 5, '72', '67');
INSERT INTO `Pistes` VALUES(131, '0', 'Chateau Noir II', 'Black', 6, '67', '65');
INSERT INTO `Pistes` VALUES(132, '0', 'Chateau Noir II Bis', 'Black', 3, '67', '64');
INSERT INTO `Pistes` VALUES(133, '0', 'Cristaux', 'Black', 6, '70', '73');
INSERT INTO `Pistes` VALUES(134, '0', 'Sarenne IV', 'Black', 2, '73', '65');
INSERT INTO `Pistes` VALUES(135, '0', 'Sarenne III', 'Black', 2, '64', '73');
INSERT INTO `Pistes` VALUES(136, '0', 'Sarenne V', 'Black', 12, '65', '59');
INSERT INTO `Pistes` VALUES(137, '0', 'Tunnel I', 'Black', 3, '49', '134');
INSERT INTO `Pistes` VALUES(138, '0', 'Glacier', 'Black', 3, '49', '134');
INSERT INTO `Pistes` VALUES(139, '0', 'Glacier Bis', 'Black', 3, '134', '70');
INSERT INTO `Pistes` VALUES(140, '0', 'Tunnel II', 'Black', 3, '134', '74');
INSERT INTO `Pistes` VALUES(141, '0', 'Tunnel III', 'Black', 7, '74', '81');
INSERT INTO `Pistes` VALUES(142, 'Télésiège', 'Lac Blanc', 'Yellow', 6, '85', '37');
INSERT INTO `Pistes` VALUES(143, '0', 'Tunnel IV', 'Black', 1, '81', '79');
INSERT INTO `Pistes` VALUES(144, '0', 'Tunnel IV bis', 'Black', 1, '81', '37');
INSERT INTO `Pistes` VALUES(145, '0', 'Tunnel V', 'Black', 2, '79', '85');
INSERT INTO `Pistes` VALUES(146, '0', 'Brèche I', 'Black', 4, '74', '78');
INSERT INTO `Pistes` VALUES(147, '0 ', 'Brèche II', 'Black', 5, '78', '85');
INSERT INTO `Pistes` VALUES(148, '0', 'Brèche II Bis', 'Black', 3, '78', '79');
INSERT INTO `Pistes` VALUES(149, '0', 'Clocher de Macle', 'Black', 3, '47', '38');
INSERT INTO `Pistes` VALUES(150, '0', 'Balcons', 'Black', 4, '47', '38');
INSERT INTO `Pistes` VALUES(151, '0', 'Promontoire', 'Red', 6, '47', '38');
INSERT INTO `Pistes` VALUES(152, '0', 'Combe Charbonnière ', 'Black ', 5, '47', '135');
INSERT INTO `Pistes` VALUES(153, '0', 'Combe Charbonnière II', 'Black', 5, '135', '77');
INSERT INTO `Pistes` VALUES(154, '0', 'Combe Charbonnière Bis', 'Black', 1, '135', '53');
INSERT INTO `Pistes` VALUES(155, '0', 'Campanules I', 'Red', 5, '53', '77');

-- --------------------------------------------------------

--
-- Table structure for table `SOMMET`
--

CREATE TABLE `SOMMET` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(90) COLLATE latin1_general_ci NOT NULL,
  `ACTIVE_IN_APPLI` tinyint(1) NOT NULL,
  `Altitude` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=136 ;

--
-- Dumping data for table `SOMMET`
--

INSERT INTO `SOMMET` VALUES(3, 'Signal de L''homme', 1, 2176);
INSERT INTO `SOMMET` VALUES(1, 'Auris en Oisans', 1, 1600);
INSERT INTO `SOMMET` VALUES(4, 'Auris Express Amont', 1, 1867);
INSERT INTO `SOMMET` VALUES(5, 'Maronne', 1, 1450);
INSERT INTO `SOMMET` VALUES(6, 'Huez', 1, 1500);
INSERT INTO `SOMMET` VALUES(7, 'Lombards Amont', 1, 1817);
INSERT INTO `SOMMET` VALUES(8, 'Col Haut', 1, 0);
INSERT INTO `SOMMET` VALUES(9, 'Maronne / Sures', 1, 0);
INSERT INTO `SOMMET` VALUES(10, 'Forêt', 1, 0);
INSERT INTO `SOMMET` VALUES(11, 'Piegut Haut', 1, 0);
INSERT INTO `SOMMET` VALUES(12, 'Alpauris / Louvet', 1, 0);
INSERT INTO `SOMMET` VALUES(13, 'Alpauris Centre', 1, 0);
INSERT INTO `SOMMET` VALUES(14, 'Lombards Bas', 1, 0);
INSERT INTO `SOMMET` VALUES(15, 'Fontfroide Bas', 1, 0);
INSERT INTO `SOMMET` VALUES(16, 'Chalvet bas', 1, 0);
INSERT INTO `SOMMET` VALUES(17, 'Alpe d''Huez Bergers', 1, 1860);
INSERT INTO `SOMMET` VALUES(18, 'Alpe d''Huez Eclose', 1, 1815);
INSERT INTO `SOMMET` VALUES(19, 'Alpe d''Huez Vieil Alpe', 1, 1860);
INSERT INTO `SOMMET` VALUES(20, 'Alpe d''Huez Cognet', 1, 1860);
INSERT INTO `SOMMET` VALUES(21, 'Signal ', 1, 2115);
INSERT INTO `SOMMET` VALUES(22, 'Montfrais', 1, 1650);
INSERT INTO `SOMMET` VALUES(23, 'Vallonnet Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(24, 'La Villette', 1, 0);
INSERT INTO `SOMMET` VALUES(25, 'Vaujany', 1, 1250);
INSERT INTO `SOMMET` VALUES(26, 'Pré-Rond / Font-Froide', 0, 0);
INSERT INTO `SOMMET` VALUES(27, 'L''enversin d''oz', 1, 1250);
INSERT INTO `SOMMET` VALUES(28, 'Montfrais Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(29, 'Clos Giraud', 1, 0);
INSERT INTO `SOMMET` VALUES(30, 'L''Alpette', 1, 2050);
INSERT INTO `SOMMET` VALUES(133, 'Bergerie Gua', 0, 0);
INSERT INTO `SOMMET` VALUES(64, 'Herpie', 1, 0);
INSERT INTO `SOMMET` VALUES(33, 'Poutran Champ', 1, 0);
INSERT INTO `SOMMET` VALUES(132, 'Forêt Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(36, 'Dome des petites rousses', 1, 2800);
INSERT INTO `SOMMET` VALUES(37, 'Grotte de glace', 1, 2700);
INSERT INTO `SOMMET` VALUES(38, 'Chavannus', 1, 2100);
INSERT INTO `SOMMET` VALUES(39, 'Schuss', 1, 186);
INSERT INTO `SOMMET` VALUES(40, 'Col / Maronne', 0, 0);
INSERT INTO `SOMMET` VALUES(129, 'Sagnes aval', 1, 0);
INSERT INTO `SOMMET` VALUES(42, 'Vernettes / le Gua', 0, 0);
INSERT INTO `SOMMET` VALUES(43, 'Alpe d''uez - Alpauris', 1, 1860);
INSERT INTO `SOMMET` VALUES(44, 'Romain_Top', 1, 2100);
INSERT INTO `SOMMET` VALUES(45, 'Tétras / Le Gua / Martagons / Lys', 0, 0);
INSERT INTO `SOMMET` VALUES(46, 'Plat des marmottes', 1, 2300);
INSERT INTO `SOMMET` VALUES(47, 'Clocher de macle', 1, 2800);
INSERT INTO `SOMMET` VALUES(49, 'Pic Blanc', 1, 3330);
INSERT INTO `SOMMET` VALUES(50, 'Villard Reculas', 1, 1480);
INSERT INTO `SOMMET` VALUES(130, 'Sarrasins / Sagnes', 1, 0);
INSERT INTO `SOMMET` VALUES(59, 'Sarennes / Col de Cluy', 0, 0);
INSERT INTO `SOMMET` VALUES(53, 'Chalvet_Top', 1, 0);
INSERT INTO `SOMMET` VALUES(54, 'Corniche II', 0, 0);
INSERT INTO `SOMMET` VALUES(57, 'Corniche I', 0, 0);
INSERT INTO `SOMMET` VALUES(58, 'Crocus / Marmottes', 0, 0);
INSERT INTO `SOMMET` VALUES(60, 'Rhodos / Les Farcis', 0, 0);
INSERT INTO `SOMMET` VALUES(61, 'Les Farcis Maronne ', 0, 0);
INSERT INTO `SOMMET` VALUES(62, 'Oz en oisans', 1, 1350);
INSERT INTO `SOMMET` VALUES(63, 'Les Farcis / La Fuma', 0, 0);
INSERT INTO `SOMMET` VALUES(65, 'Chateau Noir / Sarenne', 0, 0);
INSERT INTO `SOMMET` VALUES(66, 'petit prince', 1, 0);
INSERT INTO `SOMMET` VALUES(67, 'Chateau Noir / Herpie', 0, 0);
INSERT INTO `SOMMET` VALUES(68, 'Stade', 1, 0);
INSERT INTO `SOMMET` VALUES(69, 'Grande Sure', 1, 1860);
INSERT INTO `SOMMET` VALUES(70, 'Glacier De Sarenne', 1, 3060);
INSERT INTO `SOMMET` VALUES(71, 'L''alpette - carrelet', 1, 0);
INSERT INTO `SOMMET` VALUES(72, 'Glacier de Sarenne Point De Vue ', 1, 0);
INSERT INTO `SOMMET` VALUES(73, 'Sarenne / Cristaux ', 0, 0);
INSERT INTO `SOMMET` VALUES(74, 'Tunnel / Brèche', 0, 0);
INSERT INTO `SOMMET` VALUES(76, 'Combe de Charbonnière / Campanules', 0, 0);
INSERT INTO `SOMMET` VALUES(77, 'Campanules / FIN Combe ', 0, 0);
INSERT INTO `SOMMET` VALUES(78, 'Brèche / Lac Blanc VIA Tunnel ', 0, 0);
INSERT INTO `SOMMET` VALUES(79, 'Lac Blanc VIA Tunnel', 0, 0);
INSERT INTO `SOMMET` VALUES(80, 'bartavelles/carrelet', 0, 0);
INSERT INTO `SOMMET` VALUES(81, 'Tunnel GDG / Lac Blanc', 0, 0);
INSERT INTO `SOMMET` VALUES(82, 'Champ Clotury Aval', 0, 0);
INSERT INTO `SOMMET` VALUES(83, 'bartavelles/rousses', 0, 0);
INSERT INTO `SOMMET` VALUES(84, 'Rousses / Le Belvédère', 0, 0);
INSERT INTO `SOMMET` VALUES(85, 'Lac Blanc', 1, 0);
INSERT INTO `SOMMET` VALUES(86, 'Le Belvédère / Chamois', 0, 0);
INSERT INTO `SOMMET` VALUES(87, 'Couloir Lièvre Blanc', 0, 0);
INSERT INTO `SOMMET` VALUES(88, 'Lièvre Blanc', 1, 0);
INSERT INTO `SOMMET` VALUES(89, 'Poutal/Encolies', 0, 0);
INSERT INTO `SOMMET` VALUES(90, 'Clos du pré aval', 1, 0);
INSERT INTO `SOMMET` VALUES(91, 'Clos du pré Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(93, 'Lama Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(94, 'Montfrais II - Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(95, 'Montfrais II - Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(96, 'Déversoir / La Balme ', 0, 0);
INSERT INTO `SOMMET` VALUES(97, 'Combe benite Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(98, 'Combe Bénite Aval (Enversins)', 1, 0);
INSERT INTO `SOMMET` VALUES(99, 'Olmet Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(101, 'Olympiques / Vachettes', 0, 0);
INSERT INTO `SOMMET` VALUES(102, 'Olympique VERS Resto', 0, 0);
INSERT INTO `SOMMET` VALUES(103, 'Vachettes Restaurant ', 0, 0);
INSERT INTO `SOMMET` VALUES(104, 'Altiport / La balme', 0, 0);
INSERT INTO `SOMMET` VALUES(105, 'Tortue Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(106, 'Tortue Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(108, 'Langaret Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(111, 'ALTIPORT ', 1, 1812);
INSERT INTO `SOMMET` VALUES(112, 'Romains / Mélèzes', 0, 0);
INSERT INTO `SOMMET` VALUES(113, 'Romains / Loup Blanc', 0, 0);
INSERT INTO `SOMMET` VALUES(114, 'Loup Blanc / Altiport', 0, 0);
INSERT INTO `SOMMET` VALUES(115, 'Agneaux / Romains', 0, 0);
INSERT INTO `SOMMET` VALUES(116, 'Pierre Novat / Agneaux', 0, 0);
INSERT INTO `SOMMET` VALUES(117, 'Lys Bergeries', 0, 0);
INSERT INTO `SOMMET` VALUES(118, 'Poutran Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(119, 'Poutran Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(120, 'Babars Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(121, 'Babars Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(122, 'Ecole Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(123, 'Ecole Aval', 1, 0);
INSERT INTO `SOMMET` VALUES(124, 'Rifnel Express Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(125, 'Rifnel Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(126, 'Vachettes Subdivision', 0, 0);
INSERT INTO `SOMMET` VALUES(127, 'Ancolies / Poutat', 0, 0);
INSERT INTO `SOMMET` VALUES(128, 'Vachettes / Romains', 0, 0);
INSERT INTO `SOMMET` VALUES(131, 'Sarrasins - Amont', 1, 0);
INSERT INTO `SOMMET` VALUES(134, 'Tunnel / Glacier', 0, 0);
INSERT INTO `SOMMET` VALUES(135, 'Mine de L''Herpie', 1, 0);
