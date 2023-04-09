-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2023 at 10:56 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `garage`
--

-- --------------------------------------------------------

--
-- Table structure for table `autoparts`
--

CREATE TABLE `autoparts` (
  `PartsID` int(11) NOT NULL,
  `PartsName` varchar(255) NOT NULL,
  `Number` varchar(255) NOT NULL,
  `Price` varchar(255) NOT NULL,
  `UnitsOfCalculation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `carbrand`
--

CREATE TABLE `carbrand` (
  `CarBrandID` int(11) NOT NULL,
  `CarName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CusID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Address` varchar(1500) NOT NULL,
  `Phone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CusID`, `Name`, `Address`, `Phone`) VALUES
(1, 'Phan Khánh An', 'eTown 1 Building, 6th Floor 364 Cong Hoa Street.', 38125167),
(2, 'Lưu Quốc Việt', '30 Ngo 183 Hoang Van Thai, Khuong Mai Ward', 35659716),
(3, 'Tôn Hạo Nhiên', '214 Nguyen An Ninh Street', 62375286);

-- --------------------------------------------------------

--
-- Table structure for table `importgoods`
--

CREATE TABLE `importgoods` (
  `ImportID` int(11) NOT NULL,
  `PartsID` int(11) NOT NULL,
  `ImportDate` date NOT NULL,
  `ImportTotelMoney` varchar(255) NOT NULL,
  `ImportName` varchar(255) NOT NULL,
  `ImportAmount` varchar(255) NOT NULL,
  `ImportPrice` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `InvID` int(11) NOT NULL,
  `UserID` int(11) NOT NULL,
  `PartsID` int(11) NOT NULL,
  `InvReportDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inventoryreportdetail`
--

CREATE TABLE `inventoryreportdetail` (
  `InvReportID` int(11) NOT NULL,
  `InvID` int(11) NOT NULL,
  `TonDau` varchar(255) NOT NULL,
  `PhatSinh` varchar(255) NOT NULL,
  `TonCuoi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `UserID` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`UserID`, `Username`, `Password`) VALUES
(1, 'manhhc', '123456'),
(2, 'hangntt', '123456'),
(3, 'khoiptx', '123456'),
(4, 'huongbt', '123456'),
(5, 'hans', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `receipt`
--

CREATE TABLE `receipt` (
  `RecptID` int(11) NOT NULL,
  `ReceiptID` int(11) NOT NULL,
  `RecptDate` date NOT NULL,
  `MoneyReceived` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Phone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `receiption`
--

CREATE TABLE `receiption` (
  `ReceiptID` int(11) NOT NULL,
  `CusID` int(11) NOT NULL,
  `LicensePlate` varchar(50) NOT NULL,
  `ReceiptDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receiption`
--

INSERT INTO `receiption` (`ReceiptID`, `CusID`, `LicensePlate`, `ReceiptDate`) VALUES
(1, 1, '51F-11111', '2023-03-01'),
(2, 2, '59A-123456', '2023-04-01');

-- --------------------------------------------------------

--
-- Table structure for table `repair`
--

CREATE TABLE `repair` (
  `RepairID` int(11) NOT NULL,
  `ReceiptID` int(11) NOT NULL,
  `RepairDate` date NOT NULL,
  `TotalRepair` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `repairdetail`
--

CREATE TABLE `repairdetail` (
  `RepairDetailID` int(11) NOT NULL,
  `RepairID` int(11) NOT NULL,
  `WageID` int(11) NOT NULL,
  `PartsID` int(11) NOT NULL,
  `Content` varchar(255) NOT NULL,
  `PartsAmount` varchar(255) NOT NULL,
  `PartsPrice` varchar(255) NOT NULL,
  `WageValue` varchar(255) NOT NULL,
  `TotalMoney` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `salereport`
--

CREATE TABLE `salereport` (
  `SaleID` int(11) NOT NULL,
  `UserID` int(11) NOT NULL,
  `SaleDate` date NOT NULL,
  `SaleRevenue` varchar(255) NOT NULL,
  `SaleName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `salereportdetail`
--

CREATE TABLE `salereportdetail` (
  `SaleReportID` int(11) NOT NULL,
  `SaleID` int(11) NOT NULL,
  `CarBrandID` int(11) NOT NULL,
  `AmountOfTurn` varchar(255) NOT NULL,
  `TotalMoney` varchar(255) NOT NULL,
  `Rate` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `wage`
--

CREATE TABLE `wage` (
  `WageID` int(11) NOT NULL,
  `WageName` varchar(255) NOT NULL,
  `WageValue` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autoparts`
--
ALTER TABLE `autoparts`
  ADD PRIMARY KEY (`PartsID`);

--
-- Indexes for table `carbrand`
--
ALTER TABLE `carbrand`
  ADD PRIMARY KEY (`CarBrandID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CusID`);

--
-- Indexes for table `importgoods`
--
ALTER TABLE `importgoods`
  ADD PRIMARY KEY (`ImportID`),
  ADD KEY `FK_IMPORT_GOODS_AUTO_PARTS` (`PartsID`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`InvID`),
  ADD KEY `FK_INVENTORY_AUTO_PARTS` (`PartsID`),
  ADD KEY `FK_INVENTORY_LOGIN` (`UserID`);

--
-- Indexes for table `inventoryreportdetail`
--
ALTER TABLE `inventoryreportdetail`
  ADD PRIMARY KEY (`InvReportID`),
  ADD KEY `FK_INVENTORY_DETAILS_INVENTORY` (`InvID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `receipt`
--
ALTER TABLE `receipt`
  ADD PRIMARY KEY (`RecptID`),
  ADD KEY `FK_RECEIPT_RECEIPTION` (`ReceiptID`);

--
-- Indexes for table `receiption`
--
ALTER TABLE `receiption`
  ADD PRIMARY KEY (`ReceiptID`),
  ADD KEY `FK_RECEIPTION_CUSTOMER` (`CusID`);

--
-- Indexes for table `repair`
--
ALTER TABLE `repair`
  ADD PRIMARY KEY (`RepairID`),
  ADD KEY `FK_REPAIR_RECEIPTION` (`ReceiptID`);

--
-- Indexes for table `repairdetail`
--
ALTER TABLE `repairdetail`
  ADD PRIMARY KEY (`RepairDetailID`),
  ADD KEY `FK_REPAIR_DETAILS_REPAIR` (`RepairID`),
  ADD KEY `FK_REPAIR_DETAILS_WAGE` (`WageID`),
  ADD KEY `FK_REPAIR_DETAILS_AUTO_PARTS` (`PartsID`);

--
-- Indexes for table `salereport`
--
ALTER TABLE `salereport`
  ADD PRIMARY KEY (`SaleID`),
  ADD KEY `FK_SALE_REPORT_LOGIN` (`UserID`);

--
-- Indexes for table `salereportdetail`
--
ALTER TABLE `salereportdetail`
  ADD PRIMARY KEY (`SaleReportID`),
  ADD KEY `FK_SALE_REPORT_DETAILS_SALE_REPORT` (`SaleID`),
  ADD KEY `FK_SALE_REPORT_DETAILS_CAR_BRAND` (`CarBrandID`);

--
-- Indexes for table `wage`
--
ALTER TABLE `wage`
  ADD PRIMARY KEY (`WageID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `autoparts`
--
ALTER TABLE `autoparts`
  MODIFY `PartsID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `carbrand`
--
ALTER TABLE `carbrand`
  MODIFY `CarBrandID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `CusID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `importgoods`
--
ALTER TABLE `importgoods`
  MODIFY `ImportID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `InvID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inventoryreportdetail`
--
ALTER TABLE `inventoryreportdetail`
  MODIFY `InvReportID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `receipt`
--
ALTER TABLE `receipt`
  MODIFY `RecptID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `receiption`
--
ALTER TABLE `receiption`
  MODIFY `ReceiptID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `repair`
--
ALTER TABLE `repair`
  MODIFY `RepairID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `repairdetail`
--
ALTER TABLE `repairdetail`
  MODIFY `RepairDetailID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `salereport`
--
ALTER TABLE `salereport`
  MODIFY `SaleID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `salereportdetail`
--
ALTER TABLE `salereportdetail`
  MODIFY `SaleReportID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `wage`
--
ALTER TABLE `wage`
  MODIFY `WageID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `importgoods`
--
ALTER TABLE `importgoods`
  ADD CONSTRAINT `FK_IMPORT_GOODS_AUTO_PARTS` FOREIGN KEY (`PartsID`) REFERENCES `autoparts` (`PartsID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `inventory`
--
ALTER TABLE `inventory`
  ADD CONSTRAINT `FK_INVENTORY_AUTO_PARTS` FOREIGN KEY (`PartsID`) REFERENCES `autoparts` (`PartsID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_INVENTORY_LOGIN` FOREIGN KEY (`UserID`) REFERENCES `login` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `inventoryreportdetail`
--
ALTER TABLE `inventoryreportdetail`
  ADD CONSTRAINT `FK_INVENTORY_DETAILS_INVENTORY` FOREIGN KEY (`InvID`) REFERENCES `inventory` (`InvID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `receipt`
--
ALTER TABLE `receipt`
  ADD CONSTRAINT `FK_RECEIPT_RECEIPTION` FOREIGN KEY (`ReceiptID`) REFERENCES `receiption` (`ReceiptID`);

--
-- Constraints for table `receiption`
--
ALTER TABLE `receiption`
  ADD CONSTRAINT `FK_RECEIPTION_CUSTOMER` FOREIGN KEY (`CusID`) REFERENCES `customer` (`CusID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `repair`
--
ALTER TABLE `repair`
  ADD CONSTRAINT `FK_REPAIR_RECEIPTION` FOREIGN KEY (`ReceiptID`) REFERENCES `receiption` (`ReceiptID`);

--
-- Constraints for table `repairdetail`
--
ALTER TABLE `repairdetail`
  ADD CONSTRAINT `FK_REPAIR_DETAILS_AUTO_PARTS` FOREIGN KEY (`PartsID`) REFERENCES `autoparts` (`PartsID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_REPAIR_DETAILS_REPAIR` FOREIGN KEY (`RepairID`) REFERENCES `repair` (`RepairID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_REPAIR_DETAILS_WAGE` FOREIGN KEY (`WageID`) REFERENCES `wage` (`WageID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `salereport`
--
ALTER TABLE `salereport`
  ADD CONSTRAINT `FK_SALE_REPORT_LOGIN` FOREIGN KEY (`UserID`) REFERENCES `login` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `salereportdetail`
--
ALTER TABLE `salereportdetail`
  ADD CONSTRAINT `FK_SALE_REPORT_DETAILS_CAR_BRAND` FOREIGN KEY (`CarBrandID`) REFERENCES `carbrand` (`CarBrandID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_SALE_REPORT_DETAILS_SALE_REPORT` FOREIGN KEY (`SaleID`) REFERENCES `salereport` (`SaleID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
