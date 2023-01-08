package com.bridgelabz.day3.employeewagecalculator;

public class UC_5_MonthlyWage {
    public static int employeeMonthlyWage() {
    int fullTime = 2;
    int partTime = 1;
    int employeeWagePerHour = 20;
    int workingDaysPerMonth = 20;
    int employeeHrs = 0;
    int employeeWage = 0;
    int monthlyWage = 0;
    for (int day = 0; day < workingDaysPerMonth; day++) {
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeeCheck) {
            case 1:
                employeeHrs = 16;
                break;
            case 2:
                employeeHrs = 8;
                break;
            default:
                employeeHrs = 0;

        }
        employeeWage = employeeHrs * employeeWagePerHour;
        monthlyWage += employeeWage;
        System.out.println("Employee wage:" + employeeWage);
    }
    return monthlyWage;
}

    public static void main(String[] args) {
        int wagePerMonth = employeeMonthlyWage();
        System.out.println("Employees Per Monthwage is: "+wagePerMonth);
    }
}
