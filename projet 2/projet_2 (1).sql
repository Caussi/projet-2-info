-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mar 05 Janvier 2021 à 16:47
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projet_2`
--

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE `entreprise` (
  `id` int(11) NOT NULL,
  `idprofil` int(11) DEFAULT NULL,
  `nom` varchar(255) NOT NULL,
  `disponibilite` varchar(255) NOT NULL,
  `expertise` varchar(255) NOT NULL,
  `mail` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `entreprise`
--

INSERT INTO `entreprise` (`id`, `idprofil`, `nom`, `disponibilite`, `expertise`, `mail`) VALUES
(1, 2, 'Google', 'lundi et mardi', 'java', 'google@gmail.com'),
(2, NULL, 'Facebook', 'mercredi', 'css', 'facebook@gmail.com'),
(3, 5, 'Amazon', 'mercredi jeudi vendredi', 'gestion de projet de groupe', 'amazon@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `profil`
--

CREATE TABLE `profil` (
  `id` int(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `telephone` int(11) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `ville` varchar(255) NOT NULL,
  `diplome` varchar(255) NOT NULL,
  `expertise` varchar(255) NOT NULL,
  `disponibilite` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `profil`
--

INSERT INTO `profil` (`id`, `nom`, `prenom`, `mdp`, `telephone`, `adresse`, `ville`, `diplome`, `expertise`, `disponibilite`, `mail`) VALUES
(1, 'nom', 'prenom', 'mdp', 4, 'adresse', 'ville', 'diplôme', 'espertise', 'disponibilité', 'mail'),
(2, 'Flint', 'Jonathan', 'mdp1', 5, '4615  Pine Street', 'Pennsylvania', 'Ingénieur informatique', 'java, bdd', 'mardi, mercredi', 'flint.jonathan@gmail.com'),
(3, 'Hulda', 'Jean-Marie', 'mdp2', 615245968, '1672  Sardis Station', 'Eagan', 'Ingénieur informatique', 'gestion de projet informatique, management du personnel', 'vendredi après-midi', 'jeanmarie.hulda@gmail.com'),
(5, 'Nandita', 'Mira', 'mdp3', 625487541, '3443  Watson Lane', 'Cranes Mill', 'master mention Psychologie Sociale, du Travail et des Organisations', 'la gestion de groupe, de conflit, et la vie au travail', 'lundi matin, mercredi matin et jeudi ', 'mandita.mira@gmail.com');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `entreprise`
--
ALTER TABLE `entreprise`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idProfil` (`idprofil`),
  ADD KEY `idprofil_3` (`idprofil`),
  ADD KEY `idprofil_2` (`idprofil`) USING BTREE;

--
-- Index pour la table `profil`
--
ALTER TABLE `profil`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `entreprise`
--
ALTER TABLE `entreprise`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `profil`
--
ALTER TABLE `profil`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
