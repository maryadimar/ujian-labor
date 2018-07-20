-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2018 at 04:26 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_mulia_terpadu`
--

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE IF NOT EXISTS `pasien` (
  `kd_pasien` varchar(20) NOT NULL,
  `nm_pasien` varchar(20) NOT NULL,
  `kategori_pasien` varchar(20) NOT NULL,
  `no_faskes` varchar(20) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `notlp` varchar(20) NOT NULL,
  PRIMARY KEY (`kd_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`kd_pasien`, `nm_pasien`, `kategori_pasien`, `no_faskes`, `alamat`, `notlp`) VALUES
('KD001', 'kode 22', 'UMUM', '1241241', 'jl. d', '22121212'),
('KD002', 'bahar gila', 'UMUM', '-----------', 'jl palsu', '09546'),
('KD003', 'udin gila', 'ASKES', '12341', 'jl palsu bener', '09546111'),
('KD004', 'jaya gila', 'JAMKESDA', '1241', 'jl . lupa ingat', '134535');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `no_registrasi` varchar(10) NOT NULL,
  `tgl_konsul` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `kd_pasien` varchar(10) NOT NULL,
  `nm_pasien` varchar(25) NOT NULL,
  `diagnosis` varchar(50) NOT NULL,
  `penanganan` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  PRIMARY KEY (`no_registrasi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no_registrasi`, `tgl_konsul`, `kd_pasien`, `nm_pasien`, `diagnosis`, `penanganan`, `keterangan`) VALUES
('o676o', '2001-01-18 00:00:00', 'e5tuy', '5yu5', 'uy', 'eyu', 'ye'),
('rhw', '2001-01-18 00:00:00', 'hrf', 'fh', 'rhyr', 'ryh', 'ryr4w');
