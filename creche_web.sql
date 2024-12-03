
CREATE DATABASE creche_web;
USE creche_web;

CREATE TABLE crianca (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    responsavel VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    contato VARCHAR(20) NOT NULL
);


CREATE TABLE turma (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_turma VARCHAR(100) NOT NULL,
    horarios VARCHAR(50) NOT NULL
);


CREATE TABLE atividade_evento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data DATE NOT NULL,
    descricao TEXT NOT NULL
);


