USE rh_melli;

DROP TABLE tb_colaboradores;

CREATE TABLE tb_colaboradores(
	id INT AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    idade INT NOT NULL,
    cpf varchar(255) NOT NULL,
    salario DECIMAL(6, 2) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_colaboradores(nome, idade, cpf, salario)
values("jaime", 25, "123.123.123-12", 1200.00);

INSERT INTO tb_colaboradores(nome, idade, cpf, salario)
values("Leandrinho", 40, "123.123.123-50", 2000.00);

INSERT INTO tb_colaboradores(nome, idade, cpf, salario)
values("Robertinho", 32, "123.123.123-61", 3000.00);

INSERT INTO tb_colaboradores(nome, idade, cpf, salario)
values("Juninho", 25, "123.123.123-90", 3200.00);

INSERT INTO tb_colaboradores(nome, idade, cpf, salario)
values("Thiaguinho", 28, "123.123.123-34", 2400.00);

SELECT * FROM tb_colaboradores WHERE salario > 2000;

SELECT * FROM tb_colaboradores WHERE salario < 2000;

SET SQL_SAFE_UPDATES = 0;
UPDATE colaboradores SET salario = 1800.00 WHERE id = 1;
