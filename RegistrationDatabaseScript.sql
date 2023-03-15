USE  Employee_Registration;
-- Fields for employee to register their information in. Three tables for Registration, Login, and Employee.
CREATE TABLE Registration(
registration_id INT NOT NULL AUTO_INCREMENT,
first_name varchar(255), 
last_name  varchar(255), 
email varchar(255),
cellNumber int(255), 
CIC_location varchar(255),
user_name varchar(255),
password varchar(255),
PRIMARY KEY (registration_id)
);

INSERT INTO Registration (registration_id, first_name, last_name, email, cellNumber, CIC_location, user_name, password) VALUES ("7890", "Bob", "Smith", "Bobsmith@yahoo.com", "67890234", "Monroe, Louisiana", "RokuBoboo", "Rt56890002");
SELECT * FROM Registration;

Create TABLE Login (EmailID varchar(255) NOT NULL , user_name varchar(255), password varchar(255), PRIMARY KEY (EmailID));
INSERT INTO Login (EmailID, user_name, password) VALUES ("qwerty1990@gmail.com", "Polyqwerty90", "QXE678jKTop?!");

CREATE TABLE Employee (EmployeeID INT NOT NULL AUTO_INCREMENT, first_name varchar(255), 
last_name varchar(255), street_name varchar(255), state varchar(255), city varchar(255), zip_code varchar(255), cellNumber varchar(255), date_of_birth varchar(255), PRIMARY KEY (EmployeeID));
INSERT INTO Employee (EmployeeID, first_name, last_name, street_name, state, city, zip_code, cellNumber, date_of_birth) VALUES ("2406", "John","Smiths","2050 Yors Avenue","Louisiana","Shreveport","71109","4878907777","12-13-2023");