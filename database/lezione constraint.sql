`lezione16/09`-- QUESTI SONO I DDL (Data Definition Language)

-- testCREATE DATABASE corsoSql;
-- DDL
-- CREATE
-- DROP
-- ALTER
-- RENAME
-- TRUNCATE

CREATE TABLE if not exists libro (id INT, titolo VARCHAR (100), prezzo DECIMAL , data_pub DATE ) ;

DROP TABLE if exists persona;

CREATE TABLE copia_libro LIKE libro ;

DROP TABLE if EXISTS libro , copia_libro;

CREATE TABLE persona( id INT , nome VARCHAR (100)) ; 

-- add aggiunge una o più colonne

ALTER TABLE persona ADD indirizzo CHAR (100),
							ADD eta INT ;
							
-- modify modifica solo il tipo
							
ALTER TABLE persona MODIFY COLUMN indirizzo VARCHAR (100);

-- change il nome e il tipo della colonna

ALTER TABLE persona CHANGE COLUMN eta anni INT ;


-- eliminazione più colonne
ALTER TABLE persona DROP COLUMN indirizzo;


-- rinomina tabella
RENAME TABLE persona TO persona2;
							
-- comandi multipli

ALTER TABLE persona2 
							CHANGE COLUMN nome nominativo VARCHAR(100),
							ADD eta INT ;
maglia
CREATE TABLE maglia(id INT ,
							tipo VARCHAR (100),
							taglia ENUM('xs','s','m','l','xl')) 

CREATE TABLE utente (id INT,
							nome VARCHAR (100),
							sesso ENUM ('m','f','x'),
							patentato ENUM ('si','no'));
							
CREATE TABLE impiegato (id INT,
								nome VARCHAR (50) ,
								data_assunzione DATETIME ,
								stipendioInLire INT ,
								sipendioInEuro INT ,
								num_reparto INT,
								livello INT ,
								sesso ENUM ('m','f')
								);
							

ALTER TABLE impiegato CHANGE COLUMN id id_impiegati INT ;

ALTER TABLE impiegato DROP COLUMN stipendioInLire;

ALTER TABLE impiegato ADD cognome varCHAR (100);
							
ALTER TABLE impiegato MODIFY COLUMN livello VARCHAR (10);

ALTER TABLE impiegato CHANGE COLUMN sipendioInEuro Stipendio INT ;

RENAME TABLE impiegato TO impiegati;
							
-- constraint -> SONO VINCOLI SUI VALORI AMMESSI (nelle colonne)
-- not null--> obbliga a inserire qualcosa in una colonna , non accetta colonna vuota
CREATE TABLE tizio (id INT NOT NULL , nome VARCHAR (100) NOT NULL  , cognome VARCHAR (100), email VARCHAR (100));

					
ALTER TABLE tizio MODIFY cognome VARCHAR(100) NOT NULL; 
					
--- UNIQUE -> rende i valori fra righe tutti diversi non ammettendo duplicati

ALTER TABLE tizio ADD CONSTRAINT email_uq UNIQUE (email) ; 
					
					
ALTER TABLE tizio ADD COLUMN telefono  VARCHAR (100);
ALTER TABLE tizio ADD CONSTRAINT telefono_uq UNIQUE (telefono);
					
ALTER TABLE tizio DROP CONSTRAINT telefono_uq;
					
ALTER TABLE tizio add COLUMN eta INT;			

--- check obbliga a inserire solo alcuni valori

ALTER TABLE tizio ADD CONSTRAINT eta_ck CHECK (eta>18);		

ALTER TABLE tizio ADD CONSTRAINT nome_ck CHECK (length(nome)>3);
					
CREATE TABLE tizio2(id INT, email VARCHAR(50) NOT NULL UNIQUE CHECK(email LIKE '%@%'));

ALTER TABLE tizio2 ADD CONSTRAINT 

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

ALTER TABLE tizio ADD CONSTRAINT pk_id PRIMARY KEY (id);


ALTER TABLE tizio MODIFY COLUMN id INT AUTO_INCREMENT ;
-- auto increment si usa solo nelle primary key
CREATE TABLE caio (id INT AUTO_INCREMENT PRIMARY KEY ,
							nome VARCHAR(100) , 
							id_tizio INT );

-- creo una foreign key senza altre opzioni
ALTER TABLE caio ADD CONSTRAINT fk_id FOREIGN KEY (id_tizio) REFERENCES tizio(id);

ALTER TABLE caio DROP CONSTRAINT fk_id;

-- con ON DELETE CASCADE oppure con ON DELETE SET NULL potete gestire eliminazione o mettere un null in automatico quando si
-- elimina un dato e tutti i dati legati ad esso nelle tabelle legate con foreign key (elimina il contenuto ma la riga rimane) 

ALTER TABLE caio ADD CONSTRAINT fk_id FOREIGN KEY (id_tizio) REFERENCES tizio(id) ON DELETE CASCADE ;

-- creare le tabelle emp e dept

CREATE TABLE if not exists dept (id INT AUTO_INCREMENT PRIMARY KEY ,
							dept_no INT , 
							d_name VARCHAR (30),
							city VARCHAR(30));

CREATE TABLE if not exists emp (id INT AUTO_INCREMENT PRIMARY KEY ,
							dept_no INT , 
							e_name VARCHAR (30),
							emp_no INT ,
							job VARCHAR(30),
							hire_date DATE ,
							sal INT ,
							sex ENUM ('m','f'),
							email VARCHAR(20) NOT NULL UNIQUE CHECK(email LIKE '%@%'));


ALTER TABLE emp ADD CONSTRAINT fk_id FOREIGN KEY (dept_no) REFERENCES dept(dept_no) on DELETE SET NULL;

ALTER TABLE dept ADD CONSTRAINT unique_name UNIQUE (dept_no);

ALTER TABLE emp MODIFY e_name VARCHAR(30)  NOT NULL ;
					
ALTER TABLE emp ADD CONSTRAINT min_sal CHECK (sal>1000);		

ALTER TABLE emp DROP CONSTRAINT fk_id;






					