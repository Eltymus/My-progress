-- Trovare i prodotti venuti da BRS01 , e anche i prodotti che costano meno di 4 euro che hanno la paroal 'Rabbit'

SELECT * FROM products
WHERE vend_id = 'brs_01'
OR prod_price<4 AND prod_desc LIKE '%rabbit%' ;

-- clienti che abitano IN arizona oppure clienti che abitano a columbus e non hanno una email

SELECT * FROM customers
WHERE cust_email IS NULL 
AND cust_state='columbus' AND cust_state ='AZ' ;

-- Sctrict mode è ciò che rende SQL non case sensitive volendo esistono i comandi UPPER e LOWER per visualizzare in maiuscolo

SELECT cust_name,substring(cust_name,9,4)
FROM customers
WHERE cust_id = '10000001' ;

SELECT cust_name , LENGTH (cust_name), LENGTH (SUBSTRING(cust_name,9,4)
FROM customers;

-- TRIM serve a togliere gli spazi , ltrim solo da sinistra rtrim solo da destra

SELECT ' CIAO' ,LTRIM ('    CIAO' ) ,RTRIM ('CIAO      '), TRIM ('      CIAO                    ');

-- select serve a sceglire un round serve a arrotondare per difetto un numero ,cealing serve ad arrotondarlo per eccesso
-- power serve a elevevare a potenza il primo numero al secondo, c'è anche il module che funziona come in python dando il resto della divisione 

SELECT ( 45,781 ), ROUND (45,781) ,CEILING ( 17,34 ) ,POWER (2,4) ,SQRT (25), 4%3; 

-- SYSDATE8system date) ,now e curdate servono a selezionare la data di sistema, fanno tutti e 3 la stessa cosa 

SYSDATE(), NOW (), CURDATE 

-- day serve solo a prendere il giorno dalla data di sistema
-- month solo il mese
-- year solo l'anno

DAY(NOW()) , MONTH(NOW()) , YEAR(NOW());

DATE_FORMAT('2020-09-16 15:22:30','%d%m%Y alle ore %H' );



