-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Nov 2024 pada 08.10
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_store`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `akun_id` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`akun_id`, `nama`) VALUES
(10, 'Nama User');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `IdProduk` int(11) NOT NULL,
  `nama_produk` varchar(100) NOT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `stok` int(11) DEFAULT 0,
  `harga` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`IdProduk`, `nama_produk`, `kategori`, `stok`, `harga`) VALUES
(1, 'Laptop', 'Elektronik', 10, 7500000.00),
(2, 'Mouse', 'Aksesoris', 50, 150000.00),
(3, 'Keyboard', 'Aksesoris', 30, 300000.00),
(4, 'Printer', 'Elektronik', 15, 1200000.00),
(5, 'Monitor', 'Elektronik', 20, 2500000.00),
(10, 'gelang', 'aksesoris', 44, 1400000.00),
(12345678, 'Buku', 'Aksesoris', 44, 12000000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `user_id` int(11) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `tanggal_daftar` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `email` varchar(100) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`user_id`, `Username`, `password`, `tanggal_daftar`, `email`, `first_name`, `last_name`) VALUES
(NULL, 'imungardadepan', 'keren', '2024-11-14 08:31:26', NULL, NULL, NULL),
(10, 'username_anda', 'password_anda', '2024-11-14 09:01:26', NULL, NULL, NULL),
(NULL, 'idrisknalpotracing', 'sip12345', '2024-11-14 09:03:17', NULL, NULL, NULL),
(NULL, NULL, NULL, '2024-11-14 09:13:50', 'email@example.com', 'Nama Depan', 'Nama Belakang'),
(NULL, 'atha', '12345', '2024-11-15 00:33:51', NULL, NULL, NULL),
(NULL, 'romlah', '12345', '2024-11-15 00:39:06', 'sip@gmail.com', 'romllah', 'bantet'),
(NULL, 'admin123', 'admin123', '2024-11-15 01:51:07', NULL, NULL, NULL),
(NULL, 'pria123', 'admin123', '2024-11-15 02:15:38', NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`akun_id`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`IdProduk`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `produk`
--
ALTER TABLE `produk`
  MODIFY `IdProduk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12345679;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `akun` (`akun_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
