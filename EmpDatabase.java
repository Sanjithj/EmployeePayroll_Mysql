package com.bridgelabz;

public class EmpDatabase {
public static void main(String[] args) {
	System.out.println("Welcome to Employee DataBase");
	
	create database Employee_Payroll;
    show databases;
    use Employee_PayRoll;
    
    create table employee_payroll( id int NOT NULL AUTO_INCREMENT PRIMARY KEY,name varchar(30),salary INT,start_date DATE NOT NULL);
}
}
