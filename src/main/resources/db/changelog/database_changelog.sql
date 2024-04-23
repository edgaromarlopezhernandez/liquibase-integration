-- liquibase formatted sql

-- changeset edgarlh:1618410269031-1
CREATE TABLE `liquibasedb`.`movies` (
  `movie_id` INT NOT NULL,
  `name` VARCHAR(50) NULL,
  `description` VARCHAR(255) NULL,
  PRIMARY KEY (`movie_id`));