-- Criar banco de dados
CREATE DATABASE db_venda_veiculo_exercicio;

-- Usar o banco de dados criado
USE db_venda_veiculo_exercicio;

-- CRIAR TABELAS

-- Criar tabela cliente
CREATE TABLE cliente(
    id_cliente INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Chave primaria
    nome VARCHAR(45) NOT NULL,
    cnh VARCHAR(25),
    tipo_cliente VARCHAR(15) NOT NULL,
    CHECK (tipo_cliente in ('Fisica','Juridica')), -- opcoes possiveis de tipo_cliente
    cartao VARCHAR(16)
);

-- Criar tabela funcionario
CREATE TABLE funcionario(
    id_funcionario INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Chave primaria
    nome VARCHAR(45) NOT NULL,
    salario DOUBLE NOT NULL DEFAULT '0',
    departamento VARCHAR(45) NOT NULL
);

-- Criar tabela veiculo_venda
CREATE TABLE veiculo_venda(
    id_venda INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Chave primaria
    valor_venda DOUBLE NOT NULL,
    data_venda DATE NOT NULL,
    cliente_id INT UNSIGNED NOT NULL,
    funcionario_id INT UNSIGNED NOT NULL,
   
    FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id_funcionario)
);

-- Criar tabela veiculo
CREATE TABLE veiculo(
    id_veiculo INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Chave primaria
    marca VARCHAR(30) NOT NULL,
    placa VARCHAR(10) NOT NULL UNIQUE,
    valor DOUBLE NOT NULL,
    modelo VARCHAR(30) NOT NULL,
    ano INT NOT NULL,
    venda_id INT UNSIGNED,
   
    FOREIGN KEY (venda_id) REFERENCES veiculo_venda(id_venda)
);

-- INSERIR DADOS

-- Inserir dados na tabela cliente
INSERT INTO cliente(nome, cnh, tipo_cliente, cartao) VALUES
('João Silva', '12345678900', 'Fisica', '1234567812345678'),
('Maria Oliveira', '98765432100', 'Fisica', '8765432187654321'),
('Empresa X Ltda', NULL, 'Juridica', '1122334455667788'),
('Pedro Santos', '45678912300', 'Fisica', '2233445566778899'),
('Companhia Y S.A.', NULL, 'Juridica', '9988776655443322');

-- Inserir dados na tabela funcionario
INSERT INTO funcionario (nome, salario, departamento) VALUES
('Ana Costa', 3500.00, 'Recursos Humanos'),
('Carlos Pereira', 4200.50, 'Desenvolvimento'),
('Fernanda Almeida', 3700.75, 'Marketing'),
('João Mendes', 4500.00, 'Vendas'),
('Maria Santos', 4000.25, 'Financeiro');

-- Inserir dados na tabela veiculo
INSERT INTO veiculo (marca, placa, valor, modelo, ano, venda_id) VALUES
('Toyota', 'ABC1234', 75000.00, 'Corolla', 2023, 1),
('Honda', 'XYZ5678', 62000.00, 'Civic', 2022, 2),
('Ford', 'LMN9101', 83000.00, 'Mustang', 2024, 3);

-- Inserir dados na tabela veiculo_venda
INSERT INTO veiculo_venda (valor_venda, data_venda, cliente_id, funcionario_id) VALUES
(75000.00, '2024-08-15', 1, 2),
(62000.00, '2024-08-20', 2, 1),
(83000.00, '2024-09-01', 3, 3);

-- CONSULTAS

-- Selecionar todos os dados das tabelas cliente, funcionario, veiculo, e veiculo_venda
SELECT * -- selecionar tudo
FROM cliente; -- da tabela cliente

SELECT *
FROM funcionario;

SELECT *
FROM veiculo;

SELECT *
FROM veiculo_venda;

-- Listar todos os veículos vendidos, incluindo marca, modelo, ano, placa, valor de venda, data da venda, nome do cliente e nome do funcionário que realizou a venda
SELECT
    v.marca, v.modelo, v.placa, -- dados da tabela veiculo
    vv.valor_venda, vv.data_venda, -- dados da tabela veiculo_venda
    c.nome AS nome_cliente, -- nome do cliente
    f.nome AS nome_funcionario -- nome do funcionario
FROM veiculo v -- tabela
JOIN veiculo_venda vv ON v.venda_id = vv.id_venda -- venda_id de veiculo é igual a id_venda de veiculo_venda
JOIN cliente c ON vv.cliente_id = c.id_cliente -- cliente_id de veiculo_venda = id_cliente de cliente
JOIN funcionario f ON vv.funcionario_id = f.id_funcionario; -- funcionario_id de veiculo_venda = id_funcionario de funcionario

-- Atualizar o preço de um veiculo da tabela veiculo
UPDATE veiculo -- atualizar tabela veiculo
SET valor = 63000 -- setar novo valor
WHERE id_veiculo = 2; -- onde id for igual a 2

-- Atualizar o registro de um veículo que ainda não foi vendido, atribuindo a ele uma venda existente
INSERT INTO veiculo_venda (valor_venda, data_venda, cliente_id, funcionario_id) VALUES
(30000.00, '2024-09-01', 5, 4);
INSERT INTO veiculo (marca, placa, valor, modelo, ano, venda_id) VALUES
('Chevrolet', 'DEF5678', 30000.00, 'Celta', 2010, 4);

-- Listar todos os veículos que foram vendidos após uma data específica
SELECT
    v.marca, v.modelo, v.placa, -- dados da tabela veiculo
    vv.valor_venda, vv.data_venda, -- dados da tabela veiculo_venda
    c.nome AS nome_cliente, -- nome do cliente
    f.nome AS nome_funcionario -- nome do funcionario
FROM veiculo v -- tabela
JOIN veiculo_venda vv ON v.venda_id = vv.id_venda -- venda_id de veiculo é igual a id_venda de veiculo_venda
JOIN cliente c ON vv.cliente_id = c.id_cliente -- cliente_id de veiculo_venda = id_cliente de cliente
JOIN funcionario f ON vv.funcionario_id = f.id_funcionario -- funcionario_id de veiculo_venda = id_funcionario de funcionario
WHERE vv.data_venda >  '2024-08-22'; -- condição, data apos 22/08/2024