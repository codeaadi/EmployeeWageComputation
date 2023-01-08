package com.bridgelabz.day3.employeewagecalculator;

public class UC_3_PartTimeFullTime {
    public static int checkPartimeandFulltimeWages() {
        int IsFullTime = 1;
        int IsPartTime= 2 ;
        int EmployeeRatePerHr= 20;
        int empHrs= 0;
        int empWage= 0;

        double employeeCheck = Math.floor(Math.random() * 10) %3;
        if ( employeeCheck == IsFullTime ) {
            return empHrs= 8;
        }
        else if ( employeeCheck == IsPartTime){
             return empHrs=4;
        }
        empWage = empHrs * EmployeeRatePerHr;
        return empWage;
    }

    public static void main(String[] args) {
        int partFull = checkPartimeandFulltimeWages();
        System.out.println("EmplyeeIs :"+ partFull);
    }
}
