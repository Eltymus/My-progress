`lezione16/09``lezione16/09`-- Comandi SQL

-- SELECT serve solo a visualizzare dati da colonne

SELECT * FROM emp; -- seleziona le colonne

SELECT a,b 
FROM multi ;

SELECT 'cip';

-- ricerca 

-- e. è un acronimo che possiamo scegliere noi non cambia nulla nella database

SELECT e.job,e.sal
FROM emp e
ORDER BY e.job, e.sal DESC ;

-- distinct serve a far uscire singolarmente solo i tipi di valori presenti nella tabella

SELECT DISTINCT job FROM emp ORDER BY job; 

-- limit  serve a scegliere che numero di elementi vedere partendo dal numero che si vuole

SELECT * FROM emp LIMIT 3,11 ;


-- questo serve a far vedere il salario puù grande , perchè li ordina in modo discendente in base al salario e poi vede
-- solo il primo

SELECT * 
FROM emp 
ORDER BY sal DESC LIMIT 0,1;


SELECT e_name , job , sal FROM 
							(SELECT * FROM emp
							WHERE sal > 10000) AS x ;
		
		
	
	SELECT * FROM (
SELECT * , sal*12 AS salario_annuo 
FROM emp	) Y
WHERE salario_annuo >90000
ORDER BY job , sal ;
		
		
SELECT CONCAT  ( e.e_name,' ', e.job) AS nominativo
FROM emp e ;

SELECT CONCAT (prodotto , p.prod_name ) AS nome 

SELECT * FROM emp
WHERE sal> 6000
AND job = 'prog'
AND ename LIKE 'N%'
AND mgr = 101;