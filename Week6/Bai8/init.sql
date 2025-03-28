CREATE DATABASE myapp;
\c myapp
CREATE TABLE users (id SERIAL PRIMARY KEY, name VARCHAR(255));
INSERT INTO users (name) VALUES ('Docker User');