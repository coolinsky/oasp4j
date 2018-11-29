-- This is the SQL script for setting up the DDL for the h2 database
-- In a typical project you would only distinguish between main and test for flyway SQLs
-- However, in this sample application we provde support for multiple databases in parallel
-- You can simply choose the DB of your choice by setting spring.profiles.active=XXX in config/application.properties
-- Assuming that the preconfigured user exists with according credentials using the included SQLs

CREATE TABLE Supplier(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,
    name VARCHAR(255),
    description VARCHAR(255),
    rate INTEGER,
    CONSTRAINT PK_Supplier PRIMARY KEY(id),
    CONSTRAINT UC_Supplier_name UNIQUE(name)
);

INSERT INTO StaffMember (id, modificationCounter, role, login, firstname, lastname) VALUES (0, 0, 3, 'chief', 'Charly', 'Chief');
INSERT INTO StaffMember (id, modificationCounter, role, login, firstname, lastname) VALUES (1, 0, 0, 'cook', 'Carl', 'Cook');
INSERT INTO StaffMember (id, modificationCounter, role, login, firstname, lastname) VALUES (2, 0, 1, 'waiter', 'Willy', 'Waiter');
INSERT INTO StaffMember (id, modificationCounter, role, login, firstname, lastname) VALUES (3, 0, 2, 'barkeeper', 'Bianca', 'Barkeeper');
INSERT INTO StaffMember (id, modificationCounter, role, login, firstname, lastname) VALUES (4, 0, 4, 'manager', 'Will', 'Manager');

--INSERT INTO Supplier (id, modificationCounter, name, description, rate) VALUES (1, 0, 'Natural Fruit Exports', 'Fruit', 4);
--
--INSERT INTO Supplier (id, modificationCounter, name, description, rate) VALUES (2, 0, 'CPS Gourmet', 'Meat', 5);
--
--INSERT INTO Supplier (id, modificationCounter, name, description, rate) VALUES (3, 0, 'Albafrost', 'Vegetables', 3);

--INSERT INTO StaffMember (id, modificationCounter, role, login, firstname, lastname) VALUES (5, 0, 1, 'manager', 'Bob', 'Manager'); 
