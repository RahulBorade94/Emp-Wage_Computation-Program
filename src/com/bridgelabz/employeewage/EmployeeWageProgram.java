package com.bridgelabz.employeewage;

public class EmployeeWageProgram {

    public static int empPresentOrAbsent() {
        System.out.println("Welcome to Employee Wage Calculation Problem");

        int IS_PRESENT = 1;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        return IS_PRESENT;
    }


    public static void main(String[] args) {

     empPresentOrAbsent();
    }
}