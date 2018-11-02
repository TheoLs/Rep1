
import java.util.Scanner;

public class DayOfWeekbackup {
	
	/*
	 * Day of the Week Calculator
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialisations
		
	Scanner scan = new Scanner(System.in);
	int month;
	int day;
	int year;
	
		// get month/day/year from user
	
		System.out.println("Please input the date in a MM/DD/YYYY format"); // Telling the user, what format to input the date
		String[] input = scan.nextLine().split("/");						// Created a empty String group called input, so I could use .split 
		month = Integer.parseInt(input[0]);									// month is put in the input group as the first(0) element
		day = Integer.parseInt(input[1]);									// day is the second(1) element
		year = Integer.parseInt(input[2]);									// year is the third(2) element
		scan.close();
	
	
	
		// Gauss's method for determining the day of the week, only for Gregorian Calendar
		double m; 	//month
		int y;		//year
		int dow;	//day of the week, Sun = 0, ...., Sat = 6
	 
		m = (month - 2 + 12) % 12; // calc month offset, Mar = 1, ...., Feb = 12 
		// month = 10 then = 8
		if(month <= 2) {
		 year --; //year = year-1; also known as year-=1; Shorthand
	 }
		y= 5*(year %4) + 4* (year % 100) + 6 * (year % 400); // year = 1999 then 399
		dow = (day + (int)(2.6*m - 0.2) + y) %7; //floor operator of this casting
		
	//A newbies way of writing more than necessary. I'm quite proud of it actually
	if (dow == 0) {
		System.out.println("It was a Sunday"); }
		else if (dow == 1) {
			System.out.println("It was a Monday");}
			else if (dow == 2) {
				System.out.println("It was a Tuesday");}
				else if (dow == 3) {
					System.out.println("It was a Wednesday!");}
					else if(dow ==4) {
						System.out.println("It was a Thursday");}
						else if(dow == 5) {
							System.out.println("It was a Friday");}
							else if (dow == 6) {
								System.out.println("It was a Saturday");}
		}		
	}


