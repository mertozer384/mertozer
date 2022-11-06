
/*
From Employees table

    1.1 Display Employee_ID , FIRST_NAME ,  LAST_NAME
        for Employee_ID , 100 , 110 , 120

    1.1 Display Employee_ID , FIRST_NAME ,  LAST_NAME
        for Employee_ID 100 to 115  excluding 110

    1.2 Display Employee with No Manager_ID
    1.3 Display Employee with No DEPARTMENT_ID

    1.4 Display All Employees from Department 40 to 70

    1.5 Display All Employees with with JOB_ID ST_CLERK AND SALARY more than 3000
        ORDER the result by FIRST_NAME

    1.6 Display Employee FIRST_NAME , SALARY , COMMISSION_VALUE  (SALARY*COMMISSION_PCT)
    if the Employee has COMMISSION_PCT value
    Order the result in COMMISSION_VALUE hight to low (can not use alias, you can use index 3)

    1.7 Display UNIQUE MANAGER_ID

    1.8 Display UNIQUE DEPARTMENT_ID

    1.9 Display UNIQUE JOB_ID

    1.10 Display All Employee Full Name that report to Manager_ID 100

FROM Departments Table

    1.11 Display All Department that HAS MANAGER_ID  AND AT LOCATION_ID 1700

    1.12 Display DEPARMENT_NAME of DEPARTMENT_ID 10, 20 , 130

    1.12 Display DEPARMENT_NAME of DEPARTMENT_ID NOT BETWEEN 30 - 100

    1.13 Display Unique LOCATION_ID

FROM Locations Table

    1.14 Display All Locations that has STATE_PROVINCE value
        ORDER the result by COUNTRY_ID

    1.15 Display All Locations that does not have POSTAL_CODE

    1.16 Display All Unique COUNTRY_ID

    1.17 Display All Locations if STREET_ADDRESS contains Street or St

    1.18 Display the CITY for Location 1700 , 2100 , 2200

    1.19 Display the LOCATION_ID, STATE_PROVINCE for Location IN JP , US, CA
        ORDER BY LOCATION_ID

FROM Countries Table

    1.20 Display Unique REGION_ID

    1.21 Display COUNTRY_NAME from Region 1 and 3

FROM Jobs Table
    1.22 Display All JObs that has MIN_SALARY more than 10000 and MAX_SALARY less than 30000

    1.23 Display Max Salary for JOB_TITLE President

    1.24 Display Programmer JOB_TITLE MAX_SALARY



Employee Table

    2.1  Display All Employees FIRST_NAME , JOB_ID , SALARY
        if the JOB_ID ends with ACCOUNT

    2.2  Display All Employees FIRST_NAME , JOB_ID , SALARY
        if the JOB_ID ends with REP BUT not equal SA_REP
        ORDER the result by SALARY DESC

    2.3 Display All Employees FIRST_NAME if second Character is a
        ORDER the result by LENGTH of FIRST_NAME

Department Table

    2.4 Display All Departments with DEPARTMENT_NAME Contains IT
         if the MANAGER_ID is not 103

    2.5 Display All Departments with DEPARTMENT_NAME has more than 1 word (Contains space)


Jobs Table

    2.6 Display All JOB_TITLE that contains Manager

    2.7 Display All JOB_TITLE that starts with A , sort in descending order



Employees Table

    3.1  Display Employees FIRST_NAME , LAST_NAME , FULL_NAME, LENTH OF FULL_NAME
         if the LENTH OF FULL_NAME is more than 12 , SORT FIRST_NAME ASC

    3.2 Display the Employee Count for employees make more than 10000

    3.2 Display the Employee Count for employees that has Manager_ID 108

    3.3 Display the Employee Count for EACH Manager_ID

    3.4 Display the Employee Count for EACH FIRST_NAME (yeah and observe what you got)
            Filter the grouped result to only display if the count is more than 1

    3.5 Display the Sum of All Salary for  employees with JOB_ID Contains Clerk

    3.6 Display the Max Salary for  employees with JOB_ID contains SA

    3.7 Display the AVERAGE Salary for employees with JOB_ID ends with REP

    3.8 Display the Average Salary for Each Department_ID
         if the Average Salary is from 5000- 10000


Departments Table

   3.9 Display the Count of Departments in LOCATION_ID 1700

   3.10 Display the Count of Departments in EACH LOCATION_ID

   3.11 Display the Count of Departments that has manager

   3.12 Display the Count of Departments that contains IT in DEPARTMENT_NAME

Locations Table

   3.13 Display the count of Location that does not have STATE_PROVINCE

   3.14 Display the count of Location in US, CA, IN

   3.15 Display the count of Location in EACH COUNTRY (COUNTRY_ID)

   3.16 Display the count of Location for those location Contains st, Street in STREET_ADDRESS

   3.15 Display the count of Location in EACH COUNTRY (COUNTRY_ID)
         if the count is less than 3

Countries Table

   3.16 Display the count of Countries

   3.17 Display the count of Countries in Region 3

   3.18 Display the count of Countries that has COUNTRY_NAME ended with a

   3.19 Display the count if Countries for each REGION (REGION_ID)

   3.19 Display the count if Countries for each REGION (REGION_ID)
        if the count is more than 5


 Jobs Table

    3.2O Find out MAX(MIN_SALARY) in all JOBS

    3.21 Find out MAX (MAX_SALARY) for JOBS excluding President

    3.22 Display AVG(MAX_SALARY) (this is column name) for JOBS that has Manager in TITLE

* /
