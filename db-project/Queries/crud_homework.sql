CREATE TABLE ADDRESS(
    address_id Integer PRIMARY KEY,
    address VARCHAR(50) NOT NULL,
    phone Integer NOT NULL
);

CREATE TABLE CUSTOMER(

     customer_id Integer PRIMARY KEY,
     first_name VARCHAR(50) NOT NULL,
     last_name VARCHAR(50)NOT NULL,
     address_id Integer REFERENCES ADDRESS(address_id)

);

