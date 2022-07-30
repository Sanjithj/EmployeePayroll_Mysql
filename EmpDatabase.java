package com.bridgelabz;

public class EmpDatabase {
public static void main(String[] args) {
	System.out.println("Welcome to Employee DataBase");
	
	create database Employee_Payroll;
    show databases;
    use Employee_PayRoll;
    
    create table employee_payroll( id int NOT NULL AUTO_INCREMENT PRIMARY KEY,name varchar(30),salary INT,start_date DATE NOT NULL);

    insert into employee_payroll(name,salary,start_date) values("Sanjith",560000,"05-08-22");
    insert into employee_payroll(name,salary,start_date) values("Ragav",660000,"25-07-22");
    
    SELECT * FROM employee_payroll;
    
    SELECT salary FROM employee_payroll where name = "Sanjith";
    SELECT * FROM employee_payroll where start_date BETWEEN cast("2022-01-01" AS DATE) AND DATE(now());
    
    ALTER TABLE employee_payroll add column gender varchar(20);
    UPDATE employee_payroll set gender = "Male" where name='Ragav';
    
    SELECT SUM(salary) from employee_payroll where gender = "Male" group by gender;
    SELECT AVG(salary) from employee_payroll where gender = "Male" group by gender;
    SELECT MIN(salary) from employee_payroll where gender = "Male" group by gender;
    SELECT MAX(salary) from employee_payroll where gender = "Male" group by gender;
    SELECT COUNT(salary) from employee_payroll where gender = "Male" group by gender;
    
    SELECT SUM(salary) from employee_payroll where gender = "Female" group by gender;
    SELECT AVG(salary) from employee_payroll where gender = "Female" group by gender;
    SELECT MIN(salary) from employee_payroll where gender = "Female" group by gender;
    SELECT MAX(salary) from employee_payroll where gender = "Female" group by gender;
    SELECT COUNT(salary) from employee_payroll where gender = "Female" group by gender;
    
    ALTER TABLE employee_payroll add column department varchar(25);
    
    ALTER TABLE employee_payroll add column Basic_Pay int, add column Deductions int,add column Taxable_Pay int,add column Income_Tax int,add column Net_Pay int;

    ALTER TABLE employee_payroll add column phone int;
    ALTER TABLE employee_payroll add column address  varchar(21);

    insert into employee_payroll(name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values("Terissa",65000,"2022-08-11",'Female',87555522,"Bangalore",'Sales',65000,300,500,100,600);
    insert into employee_payroll(name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values("Terissa",65000,"2022-08-11",'Female',954461156,"Bangalore",'Marketing',65000,300,500,100,600);

    SELECT * FROM employee_payroll where name = "Terissa";
}
}
