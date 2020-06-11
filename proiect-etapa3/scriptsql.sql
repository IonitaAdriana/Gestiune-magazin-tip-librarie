DROP TABLE angajat;
DROP TABLE client;
DROP TABLE carti;
DROP TABLE boardgames;

CREATE TABLE angajat (
  id number(11) PRIMARY KEY,
  name varchar(64),
  department varchar(64),
  salary number(11) );
  
CREATE TABLE client (
  id number(11) PRIMARY KEY,
  name varchar(64),
  varsta number(11),
  puncte number(11),
  card varchar(1) );
  
CREATE TABLE carti (
  id number(11) PRIMARY KEY,
  titlu varchar(64),
  autor varchar(64) );
  
CREATE TABLE boardgames (
  id number(11) PRIMARY KEY,
  varsta number(11),
  durata number(11),
  tip varchar(64) );

SELECT * FROM angajat;
SELECT * FROM client;
SELECT * FROM carti;
SELECT * FROM boardgames;

--angajat
INSERT INTO angajat (id, name, department, salary) VALUES (1,'Doe John', 'HR', 55000);
INSERT INTO angajat (id, name, department, salary) VALUES (2,'Public Mary', 'Engineering', 75000);
INSERT INTO angajat(id, name, department, salary) VALUES (3,'Queue Susan', 'Legal', 130000);

--client
INSERT INTO client (id, name, varsta, puncte, card) VALUES (1,'Doe John', 35, 50, 'Y');
INSERT INTO client (id, name, varsta, puncte, card) VALUES (2,'Doe Mary', 32, 20, 'Y');
INSERT INTO client (id, name, varsta, puncte, card) VALUES (3,'Public Steve', 42, 0, 'N');

--carti
INSERT INTO carti (id, titlu, autor) VALUES (1,'Baltagul', 'Mihail Sadoveanu');
INSERT INTO carti (id, titlu, autor) VALUES (2,'Ion', 'Liviu Rebreanu');
INSERT INTO carti (id, titlu, autor) VALUES (3,'Moara cu noroc', 'Ioan Slavici');

--boardgames
INSERT INTO boardgames (id, varsta, durata, tip) VALUES (1,10, 1, 'story telling');
INSERT INTO boardgames (id, varsta, durata, tip) VALUES (2,15, 3, 'strategie');
INSERT INTO boardgames (id, varsta, durata, tip) VALUES (3,12, 1, 'card game');

COMMIT;

SELECT * FROM angajat;
SELECT * FROM client;
SELECT * FROM carti;
DROP TABLE boardgames;
