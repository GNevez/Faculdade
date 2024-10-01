-- tabela funcionarios
CREATE TABLE Funcionarios (
    ID_Funcionario INT PRIMARY KEY AUTO_INCREMENT, -- id do funcionário
    Nome VARCHAR(100) NOT NULL,                    -- nome do funcionário
    Salario DECIMAL(10, 2) NOT NULL,               -- salario do funcionário
    Departamento VARCHAR(50) NOT NULL               -- departamento func
);

-- tabela veiculos
CREATE TABLE Veiculos (
    ID_Veiculo INT PRIMARY KEY AUTO_INCREMENT,      -- id do veículo
    Marca VARCHAR(50) NOT NULL,                     -- marca do veículo
    Placa VARCHAR(10) UNIQUE NOT NULL,              -- placa do veículo
    Modelo VARCHAR(50) NOT NULL,                    -- modelo do veículo
    Valor DECIMAL(10, 2) NOT NULL,                  -- valor do veículo
    Ano_Fabricacao INT NOT NULL                     -- ano de fabricação do veículo
);

-- tabela clientes
CREATE TABLE Clientes (
    ID_Cliente INT PRIMARY KEY AUTO_INCREMENT,       -- id do cliente
    Nome VARCHAR(100) NOT NULL,                      -- nome do cliente
    CNH VARCHAR(15) UNIQUE NOT NULL,                 -- cnh do cliente
    Tipo_Cliente ENUM('Física', 'Jurídica') NOT NULL,-- tipo de cliente 
    Cartão_Pagamento VARCHAR(20) NOT NULL            -- cartão de pagamento associado ao cliente
);

-- tabela vendas
CREATE TABLE Vendas (
    ID_Venda INT PRIMARY KEY AUTO_INCREMENT,          -- id da venda
    Data_Venda DATE NOT NULL,                        -- data da venda
    Valor_Venda DECIMAL(10, 2) NOT NULL,            -- valor da venda
    ID_Veiculo INT,                                  -- referência ao veículo vendido
    ID_Cliente INT,                                  -- referência ao cliente comprador
    ID_Funcionario INT,                              -- referência ao funcionário que realizou a venda
    FOREIGN KEY (ID_Veiculo) REFERENCES Veiculos(ID_Veiculo),      -- chave estrangeira para a tabela veiculos
    FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente),      -- chave estrangeira para a tabela clientes
    FOREIGN KEY (ID_Funcionario) REFERENCES Funcionarios(ID_Funcionario) -- chave estrangeira para a tabela funcionarios
);
