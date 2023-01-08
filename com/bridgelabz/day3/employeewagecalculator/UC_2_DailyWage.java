package com.bridgelabz.day3.employeewagecalculator;

public class UC_2_DailyWage {
  public static int checkDailyWages() {
        int IsFullTime=1;
        int EmployeeRatePerHr=20;
        int FulldayHr=8;
        int wage;
        double employeeCheck = Math.floor(Math.random() * 10) %2;
        if ( employeeCheck == IsFullTime ) {
            return wage =  FulldayHr * EmployeeRatePerHr;
        }
        else {
            return  0;
        }
    }

		public static void main(String[] args) {
      int dailyWage=checkDailyWages();
      System.out.println("Employees Daily Wage Is: "+ checkDailyWages());
        }
}
