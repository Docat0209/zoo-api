-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema zoo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema zoo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `zoo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `zoo` ;

-- -----------------------------------------------------
-- Table `zoo`.`animal_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`animal_type` (
  `id_animal_type` INT NOT NULL AUTO_INCREMENT,
  `class_name` VARCHAR(45) NOT NULL,
  `order_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_animal_type`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`zoo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`zoo` (
  `id_zoo` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `address` TEXT NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id_zoo`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`enclosure`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`enclosure` (
  `id_enclosure` INT NOT NULL AUTO_INCREMENT,
  `id_zoo` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `introduce` TEXT NOT NULL,
  PRIMARY KEY (`id_enclosure`),
  INDEX `FK_id_zoo3_idx` (`id_zoo` ASC) VISIBLE,
  CONSTRAINT `FK_id_zoo3`
    FOREIGN KEY (`id_zoo`)
    REFERENCES `zoo`.`zoo` (`id_zoo`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`status` (
  `id_status` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_status`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`animal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`animal` (
  `id_animal` INT NOT NULL AUTO_INCREMENT,
  `id_animal_type` INT NOT NULL,
  `id_zoo` INT NOT NULL,
  `id_enclosure` INT NOT NULL,
  `id_status` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `introduction` TEXT NOT NULL,
  `nofication` TEXT NOT NULL,
  `img_url` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id_animal`),
  INDEX `id_zoo_idx` (`id_zoo` ASC) VISIBLE,
  INDEX `id_status_idx` (`id_status` ASC) VISIBLE,
  INDEX `FK_id_enclosure1_idx` (`id_enclosure` ASC) VISIBLE,
  INDEX `FK_id_animal_type1_idx` (`id_animal_type` ASC) VISIBLE,
  CONSTRAINT `FK_id_animal_type1`
    FOREIGN KEY (`id_animal_type`)
    REFERENCES `zoo`.`animal_type` (`id_animal_type`),
  CONSTRAINT `FK_id_enclosure1`
    FOREIGN KEY (`id_enclosure`)
    REFERENCES `zoo`.`enclosure` (`id_enclosure`),
  CONSTRAINT `FK_id_status1`
    FOREIGN KEY (`id_status`)
    REFERENCES `zoo`.`status` (`id_status`),
  CONSTRAINT `FK_id_zoo1`
    FOREIGN KEY (`id_zoo`)
    REFERENCES `zoo`.`zoo` (`id_zoo`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`food`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`food` (
  `id_food` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `protein_g` INT NOT NULL,
  `carbohydrate_g` INT NOT NULL,
  `fat_g` INT NOT NULL,
  PRIMARY KEY (`id_food`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`feed_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`feed_log` (
  `id_feed_log` INT NOT NULL AUTO_INCREMENT,
  `id_food` INT NOT NULL,
  `id_animal` INT NOT NULL,
  `time` TIMESTAMP NOT NULL,
  PRIMARY KEY (`id_feed_log`),
  INDEX `id_animal_idx` (`id_animal` ASC) VISIBLE,
  INDEX `FK_id_food1_idx` (`id_food` ASC) VISIBLE,
  CONSTRAINT `FK_id_animal1`
    FOREIGN KEY (`id_animal`)
    REFERENCES `zoo`.`animal` (`id_animal`),
  CONSTRAINT `FK_id_food1`
    FOREIGN KEY (`id_food`)
    REFERENCES `zoo`.`food` (`id_food`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`staff_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`staff_type` (
  `id_staff_type` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_staff_type`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `zoo`.`staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zoo`.`staff` (
  `id_staff` INT NOT NULL AUTO_INCREMENT,
  `id_staff_type` INT NOT NULL,
  `id_zoo` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `salary` INT NOT NULL,
  PRIMARY KEY (`id_staff`),
  INDEX `id_staff_type_idx` (`id_staff_type` ASC) VISIBLE,
  INDEX `id_zoo_idx` (`id_zoo` ASC) VISIBLE,
  INDEX `id_staff_zoo_idx` (`id_zoo` ASC) INVISIBLE,
  CONSTRAINT `FK_id_staff_type1`
    FOREIGN KEY (`id_staff_type`)
    REFERENCES `zoo`.`staff_type` (`id_staff_type`),
  CONSTRAINT `FK_id_zoo2`
    FOREIGN KEY (`id_zoo`)
    REFERENCES `zoo`.`zoo` (`id_zoo`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
