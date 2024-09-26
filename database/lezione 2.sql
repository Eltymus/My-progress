-- QUESTI SONO I DML (Data Manipulation Language)

-- INSERT per inserire una riga
-- UPDATE per modificare uno o più valori nella Tabella
-- DELETE per eliminare una o più righe della tabella

INSERT INTO utente (id,nome,sesso,patentato)
VALUES (1,'mario','m','si');

INSERT INTO utente (id,nome)
VALUES(2,'ugo');

INSERT INTO utente (id,nome,sesso,patentato)
VALUES (1,'mario',null,null);

CREATE TABLE Y(a INT,b DATETIME,c VARCHAR(100));

INSERT INTo Y(a,b,c)

VALUES(10, CURDATE(),'data di sistema');

INSERT INTO Y (a,b,c)
VALUES(20,SYSDATE(),'data di sistema con ora');


INSERT INTO Y (a,b,c)
VALUES(20,now(),USER());

CREATE TABLE prova_data(a DATETIME);

INSERT INTO prova_data(a)
VALUES('2024-07-11');


CREATE TABLE multi(a INT ,b VARCHAR (100) , c VARCHAR (100));


INSERT INTo multi(a,b,c)
VALUES (1,'ciao','gatto'),
			(2,'bau','topo'),
			(3,'cip','ffsd'),
			(4,'sdf','sdf');
			
INSERT INTO tizio(nome,cognome,email,telefono,eta)
VALUES ('Mario','rossi','rossi@gmail.com','111','19');


INSERT INTO tizio(nome,cognome,email,telefono,eta)
VALUES ('Giuse','verdi','verdi@gmail.com','111','19');

INSERT INTO caio (nome,id_tizio)
VALUES ('aaa',4);-- non va perchè non c'è l'id 4


INSERT INTO dept(dept_no)
VALUES (30);

INSERT INTO emp (emp_no,e_name,job,hire_date,sal,dept_no,sex,email)
VALUES (3,'Guyy','Clerk', '1998-15-11' , 2600 , 30 ,'f','G@gmail.com');

UPDATE emp 
SET job = 'clerks'
WHERE id = 3 AND job IS null

