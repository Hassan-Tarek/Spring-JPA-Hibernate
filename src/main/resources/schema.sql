CREATE DATABASE IF NOT EXISTS spring_jpa_hibernate_db;

USE spring_jpa_hibernate_db;

CREATE TABLE IF NOT EXISTS users (
    id CHAR(36) PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS products (
    code VARCHAR(255) NOT NULL,
    number BIGINT NOT NULL,
    color VARCHAR(255) NOT NULL,
    PRIMARY KEY (code, number)
);
