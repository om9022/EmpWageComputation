package com.empwagecomputation;

public class App 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int PART_TIME = 4;
	public static final int FULL_DAY = 8;	
	public static final int WAGE_PER_HOUR = 20;	
	public static final int TOTAL_WORK_DAYS = 20;	
	public static final int TOTAL_WORK_HOURS = 100;	
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Emp Wage Computation" );
        
        int TotalWage = 0;
        int dailywage = 0;
        int WorkHours = 0;
        int WorkDays = 0;
        
        while (WorkHours < TOTAL_WORK_HOURS && WorkDays < TOTAL_WORK_DAYS )
        {
      
        double empCheck = Math.floor(Math.random() * 10 )% 3;
        switch ((int)empCheck) {
        case IS_FULL_TIME : {
		dailywage = FULL_DAY * WAGE_PER_HOUR;    
       	System.out.println("Employee is Presentfor full time ");
       	System.out.println("Daily Wage is :"+ dailywage);
       	WorkHours = WorkHours + FULL_DAY;
       	break;
					
				}
		case IS_PART_TIME: {
			 dailywage = PART_TIME * WAGE_PER_HOUR;    
			 System.out.println("Employee is Present for Part Time ");
			 System.out.println("Daily Wage is :"+ dailywage);
			 WorkHours = WorkHours + PART_TIME;
	
				break;
				}
		default:
			dailywage = 0;
			System.out.println("Employee is Absent");
		}
    	WorkDays++; 
        TotalWage = TotalWage + dailywage;
        }
        System.out.println("Total Salary : " + TotalWage);
    }
}
