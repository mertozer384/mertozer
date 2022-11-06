SELECT HIRE_DATE FROM EMPLOYEES;


SELECT HIRE_DATE ,EXTRACT(YEAR  FROM HIRE_DATE) AS HIRED_YEAR FROM  EMPLOYEES;


-- SELECT HE MONTH FROM THE HIRE_DATE

SELECT HIRE_DATE, EXTRACT(MONTH FROM HIRE_DATE) AS HIRED_MONTH
FROM  EMPLOYEES;


--FIND OUT ALL EMPLOYEES HIRED IN YEAR 2008
SELECT  FIRST_NAME,HIRE_DATE,EXTRACT(YEAR FROM HIRE_DATE) FROM EMPLOYEES
WHERE EXTRACT(YEAR  FROM HIRE_DATE) =2008;



SELECT  FIRST_NAME,HIRE_DATE,EXTRACT(YEAR FROM HIRE_DATE) FROM EMPLOYEES
WHERE EXTRACT(YEAR  FROM HIRE_DATE) BETWEEN 2001 AND 2003;

