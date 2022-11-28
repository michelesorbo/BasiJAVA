-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Creato il: Nov 28, 2022 alle 16:53
-- Versione del server: 5.7.34
-- Versione PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `basijava`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `calciatori`
--

CREATE TABLE `calciatori` (
  `ntessera` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cognome` varchar(100) NOT NULL,
  `dataNascita` date DEFAULT NULL,
  `squadra` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `calciatori`
--

INSERT INTO `calciatori` (`ntessera`, `nome`, `cognome`, `dataNascita`, `squadra`) VALUES
(111, 'Victor', 'Osimhen', '1998-12-29', 1),
(112, 'Matteo', 'Politano', '1994-11-09', 1),
(113, 'Hirving', 'Lozano', '1995-07-30', 1),
(221, 'Olivier', 'Giroud', '1986-08-30', 3);

-- --------------------------------------------------------

--
-- Struttura della tabella `classi`
--

CREATE TABLE `classi` (
  `nome` varchar(10) NOT NULL,
  `piano` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `classi`
--

INSERT INTO `classi` (`nome`, `piano`) VALUES
('1A', '1° Piano'),
('1B', '2° Piano'),
('1C', '2° Piano'),
('1D', '2° Piano'),
('1E', '2° Piano'),
('2A', '2° Piano'),
('2B', '2° Piano'),
('2C', '2° Piano'),
('2D', '2° Piano'),
('3E', '2° Piano');

-- --------------------------------------------------------

--
-- Struttura della tabella `squadre`
--

CREATE TABLE `squadre` (
  `ID` int(5) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `annoFondazione` varchar(4) NOT NULL,
  `citta` varchar(150) DEFAULT NULL,
  `serie` varchar(100) NOT NULL,
  `categoria` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `squadre`
--

INSERT INTO `squadre` (`ID`, `nome`, `annoFondazione`, `citta`, `serie`, `categoria`) VALUES
(1, 'SC Napoli', '1926', 'Napoli', 'Serie A', 'Professionisti'),
(2, 'Inter', '1912', 'Milano', 'Serie A', 'Professionisti'),
(3, 'Milan', '1911', 'Milano', 'Serie B', 'Professionisti'),
(4, 'Torino', '1904', 'Torino', 'Serie B', 'Dilettanti'),
(5, 'Benevento', '1904', 'Torino', 'Serie B', 'Dilettanti'),
(6, 'Avellino', '1904', 'Torino', 'Serie D', 'Amatoriali'),
(7, 'Casertana', '1904', NULL, 'Serie D', 'Amatoriali'),
(8, 'Juventus', '1901', 'Torino', 'Serie C', 'Dilettanti'),
(9, 'Liverpool', '1856', 'Liverpool', 'Serie A', 'Prof'),
(10, 'Bologna', '1931', 'Bologna', 'Serie D', 'Amatoriali'),
(11, 'Sampdoria', '1856', 'Genova', 'Serie A', 'Professionisti');

-- --------------------------------------------------------

--
-- Struttura della tabella `studenti`
--

CREATE TABLE `studenti` (
  `cf` varchar(16) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cognome` varchar(150) NOT NULL,
  `nome_c` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `studenti`
--

INSERT INTO `studenti` (`cf`, `nome`, `cognome`, `nome_c`) VALUES
('AMT001', 'Salvatore', 'Amato', '1A'),
('MRR001', 'Martine', 'Marrelli', '2A'),
('PNZ003', 'Rossella', 'Punzo', '2B'),
('SRB001', 'Michele', 'Sorbo', '1A');

-- --------------------------------------------------------

--
-- Struttura della tabella `user`
--

CREATE TABLE `user` (
  `id` int(5) NOT NULL,
  `user` varchar(150) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `user`
--

INSERT INTO `user` (`id`, `user`, `pwd`, `mail`) VALUES
(1, 'michele', '1234', 'michele.sorbo@gmail.com'),
(2, 'mario', '1234', 'mario@rossi.it');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `calciatori`
--
ALTER TABLE `calciatori`
  ADD PRIMARY KEY (`ntessera`);

--
-- Indici per le tabelle `classi`
--
ALTER TABLE `classi`
  ADD PRIMARY KEY (`nome`);

--
-- Indici per le tabelle `squadre`
--
ALTER TABLE `squadre`
  ADD PRIMARY KEY (`ID`);

--
-- Indici per le tabelle `studenti`
--
ALTER TABLE `studenti`
  ADD PRIMARY KEY (`cf`),
  ADD KEY `Cancella` (`nome_c`);

--
-- Indici per le tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `squadre`
--
ALTER TABLE `squadre`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT per la tabella `user`
--
ALTER TABLE `user`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `studenti`
--
ALTER TABLE `studenti`
  ADD CONSTRAINT `Cancella` FOREIGN KEY (`nome_c`) REFERENCES `classi` (`nome`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
