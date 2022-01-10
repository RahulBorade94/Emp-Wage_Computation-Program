package com.bridgelabz.employeewage;

public class EmployeeWageProgram {

    public static final int IS_PART_TIME = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;

    public static int addPartTimeEmpWage() {

        int empWage = 0;
        int empHrs = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
            empHrs = 4;
        else if (empCheck == IS_PART_TIME)
            empHrs = 8;
        else
            empHrs = 0;

        empWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Emp wage " + empWage);

        return empWage;
    }


        public static void main(String[] args) {
            addPartTimeEmpWage();

        }
}





