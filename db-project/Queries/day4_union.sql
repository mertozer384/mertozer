/**

-- LIST 1  : APPLE , EGG , MILK , PINEAPPLE, BREAD
-- LIST 2  : MILK , BREAD , OIL , WALNUT

-- UNION ALL -->> APPLE , EGG , MILK , PINEAPPLE, BREAD , MILK , BREAD , OIL , WALNUT
-- UNION     -->> APPLE , BREAD , EGG, MILK, PINEAPPLE , OIL , WALNUT


-- LIST 1  MINUS LIST 2
 -- LIST 2 HERE IS NO-NO LIST

  -- MINUS   --> APPLE , EGG , PINEAPPLE

-- LIST2 MINUS LIST 1
  -- LIST 1 HERE IS NO-NO LIST

  -- MINUS -->>   OIL , WALNUT


 --- INTERSECT
    -- LIST 1 INTERSECT LIST 2
        --->> ONLY COMMON PART OF BOTH LIST  -->> MILK , BREAD




  In order for SET Operators to work ,
Two tables or result of two query being used MUST HAVE
- same exact column count
- same exact column data type
- Ideally  same exact column name (if not first table column name will be used)

Unlike JOIN which require primary key and foreign key relationship,
SET Operator must have above pre-requisite or it will not work at all !
JOIN and SET Operators are two completely different concepts.

CREATE TABLE FIRST_TABLE AS (
    SELECT FIRST_NAME , SALARY FROM EMPLOYEES
    WHERE SALARY BETWEEN 10500 AND 13000

) ORDER BY 2 ;


CREATE TABLE SECOND_TABLE AS (
    SELECT FIRST_NAME , SALARY FROM EMPLOYEES
    WHERE SALARY BETWEEN 12000 AND 24000

) ORDER BY 2 ;

COMMIT ;

  */

  /**
In order for SET Operators to work ,
Two tables or result of two query being used MUST HAVE
- same exact column count
- same exact column data type
- Ideally  same exact column name (if not first table column name will be used)

Unlike JOIN which require primary key and foreign key relationship,
SET Operator must have above pre-requisite or it will not work at all !
JOIN and SET Operators are two completely different concepts.

   */

-- UNION ALL
-- COMBINE THE RESULT OF 2 QUERIES
-- AND RETURN COMBINED RESULT AS IS -- NO SORTING NO REMOVING DUPLICATE

  SELECT * FROM FIRST_TABLE
  UNION ALL
  SELECT * FROM SECOND_TABLE ;

-- UNION
-- COMBINE THE RESULT OF 2 QUERIES
-- AND RETURN COMBINED RESULT AS IS
-- AND REMOVE DUPLICATE , SORT BY FIRST COLUMN

    SELECT * FROM FIRST_TABLE
    UNION
    SELECT * FROM SECOND_TABLE ;

-- MINUS
-- TABLE1 MINUS TABLE2
-- WILL REMOVE THOSE ROW FROM TABLE1
-- IF IT EXISTS IN TABLE 2
SELECT * FROM FIRST_TABLE
MINUS
SELECT * FROM SECOND_TABLE ;

-- TABLE2 MINUS TABLE1
-- WILL REMOVE THOSE ROW FROM TABLE2
-- IF IT EXISTS IN TABLE 1

SELECT * FROM SECOND_TABLE
MINUS
SELECT * FROM FIRST_TABLE ;

--- INTERSECT
/**
  TABLE 1 INTERSECT TABLE 2
    IT WILL RETURN ONLY THE COMMON ROWS
    IN BOTH TABLES
 */
SELECT * FROM SECOND_TABLE
INTERSECT
SELECT * FROM FIRST_TABLE ;


--- LIST 1 : MILK , EGG , BREAD, BANANA, YOGURT , STRAWBERRY

--- LIST 2 : BREAD , EGG , TOMATO, POTATO , ORANGE

-- UNION ALL : MILK , EGG , BREAD, BANANA, YOGURT , STRAWBERRY ,
                -- BREAD , EGG , TOMATO, POTATO , ORANGE

-- UNION   : MILK , EGG , BREAD, BANANA, YOGURT , STRAWBERRY
                -- TOMATO, POTATO , ORANGE

-- MINUS  : GET EVERYTHING IN LIST 1
        --- DO NOT GET ANY ITEM IF IT SHOWS UP IN LIST 2
        --- LIST 2 IS YOUR NO NO LIST
    -- LIST 1 - LIST 2
    -- MILK , BANANA, YOGURT , STRAWBERRY

    -- LIST 2 - LIST 1
      --    TOMATO, POTATO , ORANGE

-- INTERSECT : LETS JUST GET IF THE ITEMS SHOWED UP IN BOTH LIST
        -- LIST 1 INTERSECT LIST 2
        --- BREAD AND EGG

