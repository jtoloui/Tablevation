CREATE DATABASE Tablevation;
USE Tablevation;

CREATE TABLE Restaurant(
Restaurant_Email VARCHAR(50) PRIMARY KEY,
Retaurant_Password VARCHAR(50) NOT NULL,
Name VARCHAR(50) NOT NULL,
Address_Line1 VARCHAR(50) NOT NULL,
Area VARCHAR(15) NOT NULL,
City VARCHAR(35) DEFAULT 'Portsmouth',
County VARCHAR(35) DEFAULT 'Hampshire',
PostCode VARCHAR(8) NOT NULL,
Rating INT NULL,
Booked_Seats INT DEFAULT 0,
Contact_Number VARCHAR(15) NOT NULL,
Mon_OT TIME NOT NULL,
Mon_CT TIME NOT NULL,
Tues_OT TIME NOT NULL,
Tues_CT TIME NOT NULL,
Wed_OT TIME NOT NULL,
Wed_CT TIME NOT NULL,
Thur_OT TIME NOT NULL,
Thur_CT TIME NOT NULL,
Fri_OT TIME NOT NULL,
Fri_CT TIME NOT NULL,
Sat_OT TIME NOT NULL,
Sat_CT TIME NOT NULL,
Sun_OT TIME NOT NULL,
Sun_CT TIME NOT NULL,
Food_Type VARCHAR(15) NOT NULL,
Total_No_Seats INT NOT NULL
);

CREATE TABLE Customer(
Customer_Email VARCHAR(50) PRIMARY KEY,
Customer_Password VARCHAR(50) NOT NULL,
Forename VARCHAR(50) NOT NULL,
Surname VARCHAR(50) NOT NULL,
Contact_Number VARCHAR(15) NOT NULL
);

CREATE TABLE Reservation(
ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
Restaurant_Name VARCHAR(50) NOT NULL,
Restaurant_Email VARCHAR(50) NOT NULL,
Customer_Email VARCHAR(50) NOT NULL,
Booked_Time TIME NOT NULL,
Booked_Date DATE NOT NULL,
No_Guests INT NOT NULL,
Details VARCHAR(100) NULL,
CONSTRAINT FOREIGN KEY (Customer_Email) REFERENCES Customer(Cusomter_ Email)
CONSTRAINT FOREIGN KEY (Restaurant_Email) REFERENCES Restaurant(Restaurant_Email)
);

/*
Queries:
INSERT INTO Customer VALUES (?,?,?,?,?); ALL FIELDS
INSERT INTO Restaurant VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); ALL EXCEPT BOOKED_SEATS
INSERT INTO Reservation VALUES (?,?,?,?,?,?,?); ALL EXCEPT ID
UPDATE Customer SET (?,?,?);   forename, surname and Number
UPDATE Reservation SET (?,?,?,?); Time, Date, No of people, details
UPDATE Restaruant SET (?); Booked Seats
UPDATE Restaruant SET (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);
Contact_Number,Mon_OT,Mon_CT,Tues_OT,Tues_CT,Wed_OT,Wed_CT,Thur_OT,Thur_CT,Fri_OT,Fri_CT,Sat_OT,Sat_CT,Sun_OT,Sun_CT,Food_Type,Total_No_Seats

SELECT Name,Contact_Number,Rating,Mon_OT,Mon_CT,Tues_OT,Tues_CT,Wed_OT,Wed_CT,Thur_OT,Thur_CT,Fri_OT,Fri_CT,Sat_OT,Sat_CT,Sun_OT,Sun_CT,Food_Type FROM Restaurant 
WHERE Area=?;

SELECT Name,Contact_Number,Rating,Mon_OT,Mon_CT,Tues_OT,Tues_CT,Wed_OT,Wed_CT,Thur_OT,Thur_CT,Fri_OT,Fri_CT,Sat_OT,Sat_CT,Sun_OT,Sun_CT FROM Restaurant 
WHERE Food_Type=?;

SELECT Restaurant_Name,Restaurant_Email,Customer_Email,Booked_Time,Booked_Date,No_Guests,Details FROM Reservation
WHERE Customer_Email=?;

SELECT Restaurant_Name,Restaurant_Email,Customer_Email,Booked_Time,Booked_Date,No_Guests,Details FROM Reservation
WHERE Restaurant_Email=?;
*/
