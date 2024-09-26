

-- DDL data definition language

CREATE TABLE if not exists prova(a INT,
						 b VARCHAR(50));
						 
DROP TABLE prova;						 

ALTER TABLE prova ADD c CHAR(10); -- aggiungere una colonna

ALTER TABLE prova modify c varCHAR(10); -- modificare il tipo

ALTER TABLE prova CHANGE c x varCHAR(10); -- modificare il tipo

RENAME TABLE prova TO prova2;

ALTER TABLE prova2 DROP X;

-- CONSTRAINT

-- NOT null
ALTER TABLE prova2 MODIFY a int NOT NULL;
ALTER TABLE prova2 ADD c INT NOT NULL;

-- unique
ALTER TABLE prova2 ADD email VARCHAR(50);
ALTER TABLE prova2 ADD CONSTRAINT uq_email UNIQUE(email);

-- check
ALTER TABLE prova2 ADD anni INT;
ALTER TABLE prova2 ADD CONSTRAINT ck_anni CHECK(anni>18);

-- primary key
ALTER TABLE prova2 ADD id INT;
ALTER TABLE prova2 ADD CONSTRAINT pk_id PRIMARY KEY(id);

-- auto_increment
ALTER TABLE prova2 MODIFY COLUMN id INT AUTO_INCREMENT;
ALTER TABLE prova2 AUTO_INCREMENT=100;


CREATE TABLE seconda (id INT NOT NULL PRIMARY KEY,
							 aCaso CHAR,
							 id_prova2 INT);


ALTER TABLE seconda ADD CONSTRAINT fk_id_prova2 FOREIGN KEY(id_prova2) REFERENCES prova2(id);-- on delete cascade / on delete set null

-- -------------------------------------------------------------------------------------------------

--- DML data manipulation language
-- insert 
INSERT INTO prova2(a,b,c,email,anni)
VALUES(10,"ciao",20,"aa@aa.com",19);

INSERT INTO prova2(a,c,email)
VALUES(10,30,"bb@aa.com");

INSERT INTO seconda(id,aCaso,id_prova2)
VALUES(1,"xx",100);

INSERT INTO seconda
VALUES(2,"yyy",102);

-- update 
UPDATE prova2
SET b="miao"
WHERE id=102;


UPDATE prova2
SET anni=30
WHERE a=10 AND anni IS NULL;

INSERT INTO prova2(a,b,c,email,anni)
VALUES(10,NULL,30,"cc@cc.com",40);

UPDATE prova2
SET anni=50
WHERE c=20 OR b IS NULL;

-- delete
DELETE FROM prova2 
WHERE b IS NULL;


DELETE FROM prova2
WHERE id=100;

-- -------------------------------------------------------------------
SELECT * -- colonne 
FROM prova2;

SELECT a, b
FROM prova2;

SELECT 'fghfghfgh';

SELECT 1+1

SELECT 'somma',1+1 as somma

SELECT cust_name AS nome
FROM customers;

SELECT O.order_num AS "NUMERO ORDINE" -- alias di colonna
FROM orders AS O -- alias di tabella
ORDER BY order_num DESC; -- ordina le righe

SELECT c.cust_name AS "nome cliente"
FROM customers c
ORDER BY cust_name desc;

SELECT e.JOB,e.SAL -- colonne
FROM emp e 
-- WHERE job="account" --righe
ORDER BY e.job, e.SAL desc;


SELECT distinct job -- distinct elimina i duplicati
FROM emp
ORDER BY job;


SELECT * FROM emp LIMIT 0,5; -- dalla righe 1 e ne fa vedere 5

SELECT * FROM emp LIMIT 5,10; -- parte dalla 5 riga e ne fa vedere 10

SELECT *
FROM emp
ORDER BY sal DESC LIMIT 0,1; -- impiegato col salario maggiore di tutti


SELECT ename, job, sal FROM 
								(SELECT * FROM emp
								WHERE sal>10000) AS x;
			
SELECT * from			
		(SELECT *, sal*12 AS salario_annuo
		FROM emp) Y
WHERE salario_annuo>90000
ORDER BY job, sal;


SELECT CONCAT(e.FIRST_NAME,' ',e.LAST_NAME) AS nominativo
FROM employees e;


SELECT CONCAT('Prodotto: ', p.prod_name) AS nome_prodotto,
		 CONCAT('Prezzo: ',p.prod_price) AS prezzo
FROM products p
WHERE prod_price>8 -- si può usare solo il nome della colonna
ORDER BY nome_prodotto; -- si può usare l'alias o il nome colonna

SELECT * FROM emp
WHERE deptno IN(10,20);  -- deptno =10 or deptno=20;


SELECT * FROM emp
WHERE deptno NOT IN(10,20); 


SELECT * FROM emp 
WHERE ename LIKE '%s%' -- % tanti caratteri
AND deptno=10;


SELECT * FROM emp 
WHERE ename LIKE '__s%' -- _ un carattere solo
AND deptno=10
OR mgr IS NULL;


SELECT * FROM emp
WHERE sal BETWEEN 10000 AND 15000;


SELECT * FROM emp
WHERE (HIRE_DATE between '1995/01/01' and '1997/12/31' AND job='prog')
OR (sal>5000 AND HIRE_DATE between '1995/01/01' and '1997/12/31') 
order BY HIRE_DATE;


SELECT *
FROM emp WHERE (ename='David' OR ename ='Lex') AND sal>10000;


--- trovare da emp i programmatori che guadagnano più di 6000 €, il loro nome inizia per N e il loro capo è Neena.

SELECT * FROM emp
WHERE sal>6000
AND job='prog'
AND ename LIKE 'N%'
AND mgr=101;


-- trovare i prodotti venduti dal venditore 'BRS01', e anche i prodotti che costano meno di 4 euro che hanno la parola 'Rabbit'
SELECT * FROM products 
WHERE vend_id='brs01'
OR prod_price<4 AND prod_desc LIKE '%rabbit%';

-- Trovare i clienti che abitano in arizona oppure i clienti che abitano a Columbus e non hanno una email
SELECT * FROM customers
WHERE cust_state='az'
OR cust_city='columbus' AND cust_email IS NULL;


SELECT cust_name, UPPER(cust_name), LOWER('DFDSGSDGDFGDFGDFG')
FROM customers;

SELECT cust_name,SUBSTRING(cust_name,9,4)
FROM customers
WHERE cust_id='1000000001';

SELECT cust_name, LENGTH(cust_name), LENGTH(SUBSTRING(cust_name,9,4)), SUBSTRING(cust_name,-2)
FROM customers;

SELECT '   CIAO', LTRIM('   CIAO'), RTRIM('CIAO      '), TRIM('      CIAO       ');


SELECT 45.781, ROUND(45.781), CEILING(17.34), FLOOR(17.34),POWER(2,4), SQRT(25),4%3;


SELECT SYSDATE(), NOW(), CURDATE(),CURTIME(), DAY(NOW()), MONTH(NOW()),YEAR(NOW()),HOUR(NOW()),MINUTE(NOW()), SECOND(NOW());

SELECT DATE_FORMAT('2020-09-16 15:22:30','%d-%m-%Y alle ore %H');

SELECT DATE_FORMAT('2020-09-16 15:22:30','giorno %d mese di %M anno %Y sono le ore %H:%i:%s');


SELECT ADDDATE('2020-09-16 15:22:30',10);-- aggiunge 10 giorni
SELECT subDATE('2020-09-16 15:22:30',10);-- toglie 10 giorni

SELECT '2020-09-16 15:22:30' + INTERVAL 1 DAY;

SELECT '2020-09-16 15:22:30' + INTERVAL 2 MONTH;

SELECT DATE_ADD(NOW(), INTERVAL 10 DAY);

SELECT DATE_SUB(CURDATE(), INTERVAL 3 YEAR);


SELECT IFNULL(mgr,0) FROM emp; -- se è nullo mette un valore scelto da noi
SELECT NULLIF('a','a'), IFNULL(NULLIF('a','a'),'sono uguali');

SELECT COALESCE(null,'aa@aa.com',011534534); -- il primo valore non nullo in una serie di valori

select if(1<2,'si','no');

SELECT ename, if(sal>9000,job,sal) AS sal_o_job,sal FROM emp;

-- visualizzare gli impiegati, ma per motivi di privacy voglio nascondere lo stipendio e la data di assunzione degli impiegati del dipartimentio 10.

SELECT deptno, ename, job, if(deptno=10,'',sal), if(deptno=10,'',HIRE_DATE)
FROM emp;

-- visualizzare i prodotti. Se contiene la parola bear e costa meno di 6 euro scrivere in una nuova colonna la frase 'prodotto economico per bambini'


SELECT *,if(prod_desc LIKE'%bear%' AND prod_price<6,'prodotto economico per bambini','') AS qualcosa FROM products;

-- visualizzare tutto dalla tabella orderitems, se la quantità è più piccola di 10 scrivere in una nuova colonna 'ordine piccolo'.
-- se il prodotto non esiste, scrivere in una nuova colonna 'prodotto eliminato'

SELECT *, if (QUANTITY<10,'ordine piccolo','') AS "tipo ordine", if(PROD_ID is NULL,'prodotto eliminato','') AS esiste_o_no 
FROM orderitems;


SELECT ENAME, SAL, JOB,
CASE JOB WHEN 'PROG' THEN 'PROGRAMMATORE'
			WHEN 'CLERK' THEN 'IMPIEGATO'
			WHEN 'ACCOUNT' THEN 'CONTABILE'
			ELSE JOB
END AS LAVORO_TRASFORMATO		
FROM emp;

SELECT ENAME, JOB, 
IF(JOB='PROG','PROGRAMMATORE',
										IF(JOB='CLERK','IMPIEGATO',
																			IF(JOB='ACCOUNT','CONTABILE',''))) AS LAVORO_TRASFORMATO
FROM emp;
			

-- VISUALIZZARE TUTTO DAGLI IMPIEGATI, E VISUALIZZARE IN UN ALTRA COLONNA:
-- 'STIPENDIO BASSO' NEL CASO DI SALARIO MINORE DI 4000
-- 'STIPENDIO MEDIO' NEL CASO DI SALARIO COMPRESO TRA 4000 E 11000
-- 'STIPENDIO ALTO' IN TUTTI GLI ALTRI CASI
-- ORDINATO PER SALARIO DAL PIù GRANDE AL PIù PICCOLO

-- VERSIONE SUICIDA CON IF
SELECT *,
IF(SAL<4000,'STIPENDIO BASSO',
										IF(SAL BETWEEN 4000 AND 11000,'STIPENDIO MEDIO','STIPENDIO ALTO')) AS GRANDEZZA
																										
FROM emp
ORDER BY SAL DESC;

-- VERSIONE SANA DI MENTE CON CASE
SELECT *,
CASE WHEN SAL<4000 THEN 'STIPENDIO BASSO'
	  WHEN SAL 	BETWEEN 4000 AND 11000 THEN 'STIPENDIO MEDIO'
	  ELSE 'STIPENDIO ALTO'
	end AS GRANDEZZA
FROM emp
ORDER BY SAL DESC;

-- VISUALIZZARE TUTTO DAL CLIENTE.
-- SE LO STATO è 'MI' 'MICHIGAN'
-- SE LO STATO è 'OH' 'OHIO'
-- SE LO STATO è 'IN' 'INDIANA'
-- SE LO STATO è 'AZ' 'ARIZONA'
-- SE LO STATO è 'IL' 'ILLINOIS'
-- SE NON C'è LA MAIL VISUALIZZARE EMAIL NULLA

SELECT * ,
case cust_state 
		when 'MI' then 'MICHIGAN'
		WHEN 'OH' THEN 'OHIO'
		WHEN 'IN' THEN 'INDIANA'
		WHEN 'AZ' THEN 'ARIZONA'
		WHEN 'IL' THEN 'ILLINOIS'
		ELSE 'Stato nullo'
END AS STATO,
if (cust_email IS NULL ,'email nulla',cust_email) AS 'PRESENZA E-MAIL'
FROM customers


-- Funzioni di gruppo --> prendono un insieme di dati e ti ridanno un valore solo

-- COUNT serve a contare quante riche ci sono IN una colonna o in tutta la tabella
-- count (*) cerca tutti i valori , anche quelli nulli in una una colonna , se specifichi la colonna conta senza contare i null

SELECT COUNT(*)
FROM customers
WHERE cust_email IS NOT NULL ;

SELECT COUNT (cust_email)
FROM customers;

SELECT MAX(sal), -- --> massimo
		MIN(sal), -- --> minimo
		AVG(sal) -- --> media
	FROM emp;

SELECT SUM(sal)
FROM emp;

-- quando si ha una funzione di gruppo mettere sempre GROUP BY altrimenti conta le righe di tutta la colonna

SELECT deptno , COUNT(*)
FROM emp 
GROUP BY deptno;

SELECT job ,COUNT(*)
FROM emp
GROUP BY job;

SELECT MAX(sal), 
		MIN(sal),
		AVG(sal) 
	FROM emp
	GROUP BY deptno 
	ORDER BY MIN(sal)

-- per filtrare nelle funzioni di gruppo bisogna usare HAVING non WHERE 
-- anche la funzione di gruppo è SEMPRE l'ultima , perchè prima selezioni e poi raggruppi

SELECT deptno ,AVG(sal)
FROM emp 
WHERE ename LIKE 'S%'
GROUP BY deptno
HAVING AVG (sal)>8000

--  quanti prodotti che costano più di 4 euro vengono venduti dai diversi venditori 

SELECT vend_id ,COUNT(prod_id) AS numero_prodotti
FROM products
WHERE prod_price>4 
GROUP BY vend_id

-- trovare quanti sono e che lavoro fanno gli impiegati la cui media di salario è 10000


SELECT JOB ,AVG(sal),COUNT(JOB)
FROM emp 
GROUP BY JOB
HAVING AVG (sal)>10000

-- trovare i numeri di ordine e quanti oggetti sono nell'ordine per quegli ordini che contengolo 3 o più prodotti

SELECT ORDER_NUM AS  numero_ordine ,COUNT(*) AS conteggio, SUM(quantity)
FROM orderitems 
GROUP BY ORDER_NUM
HAVING sum(ORDER_ITEM)>2 

-- trovare i venditori che hanno 2 o più prodotti che costano almeno 4 euro

SELECT COUNT(prod_name), vend_id AS venditore
FROM products
WHERE prod_price>=4
GROUP BY vend_id
HAVING COUNT(prod_name)>=2 

-- trovare il prodotto che è stato ordinato di più 

SELECT PROD_ID, count(PROD_ID), SUM(QUANTITY) AS piu_venduto 
FROM orderitems
GROUP BY ORDER_NUM 
ORDER BY piu_venduto DESC

-- qual'è l'ordine più costoso tra gli ordini che contengono 3 o più prodotti

SELECT ORDER_NUM,SUM(ITEM_PRICE*quantity) prezzo_ordine
FROM orderitems
GROUP BY order_num 
having count(*)>3

