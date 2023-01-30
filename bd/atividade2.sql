CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
	id bigint auto_increment,
tipo varchar(255) not null,
primary key(id)
);
CREATE TABLE tb_pizzas(
	id int auto_increment,
sabor varchar(255) not null,
preco decimal not null,
tipId int,
primary key(id),
constraint Fk_Tipo foreign key(tipId)
references tb_categorias(id)
);

INSERT INTO tb_categorias(tipo) values
	("Doces"),
    ("Queijos"),
    ("Portuguesa"),
    ("Frango com catupiry"),
    ("Cebola Shernows");
    
INSERT INTO tb_pizzas(sabor,preco,tipId) values
	("Mussarela,40.00,2"),
    ("Cheddar, 32.00,2"),
    ("Seu Ronaldo", 66.00,3),
    ("Messi",57.00,3),
    ("Frangolia",58.00,4),
    ("Cebolitos",50.00,5),
    ("Chocolate", 43.00,1),
    ("Sorvete", 49.00,1);
    
    
SELECT * FROM tb_categorias;
SELECT * FROM tb_pizzas WHERE PRECO > 45.00;
SELECT * FROM tb_pizzas WHERE preco > 50.00 AND preco < 100.00;
SELECT * FROM tb_pizzas WHERE sabor LIKE 'M%';

SELECT sabor, preco, tb_categorias.tipo FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.tipID;

SELECT sabor, preco, tb_categorias.tipo FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.tipID
WHERE tb_categorias.id = 1;
