package com.bridgelabz.employeewage;

public class EmployeeWageProgram {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_WORKING_DAY = 2;

    public static int calculateEmpWageMonth() {

        int empWage = 0;
        int empHrs = 0;
        int totalEmpWage = 0;
        for (int day = 1; day < NUM_WORKING_DAY; day++) {


            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {

                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }

            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("EmployeeWage:" + empWage);
        }
        totalEmpWage += empWage;
        System.out.println("Total EmpWage:"+ totalEmpWage);
        return totalEmpWage;

}

    public static void main(String[] args) {
        calculateEmpWageMonth();

    }
}







