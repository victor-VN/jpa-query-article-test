CREATE TABLE empresa (
    cpf VARCHAR(14) NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    estado VARCHAR(255) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    numero_funcionarios INT NOT NULL,
    qtd_filiais INT NOT NULL
);


INSERT INTO empresa (cpf, nome, estado, uf, numero_funcionarios, qtd_filiais) VALUES
('12345678901', 'Empresa Alpha', 'São Paulo', 'SP', 150, 10),
('98765432100', 'Empresa Beta', 'Rio de Janeiro', 'RJ', 75, 5),
('45612378900', 'Empresa Gama', 'Minas Gerais', 'MG', 200, 20),
('32178965400', 'Empresa Delta', 'Bahia', 'BA', 50, 2),
('65498732100', 'Empresa Épsilon', 'Paraná', 'PR', 120, 8);
