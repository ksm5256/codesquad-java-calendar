package sm.calendar;

import java.util.Scanner;

public class Calendar {
	public final int[] maxDays = {31, 28, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	public final int[] Leap_maxDays = {31, 29, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear (int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return Leap_maxDays[month-1];
		} else
		return maxDays[month-1];
	}
	
	public void printCalendar (int year, int month) {
		/* 
		 * printf = print formatted 약자
		 * \n 줄바꿈 \r home \t tab 
		 * */
		System.out.printf("    <<%6d %3d>>\n", year , month);
		System.out.println("Hello Calendar");
		System.out.println(" sun mon tue wed thu fri sat");
		System.out.println(" --- --- --- --- --- --- ---");
		
		int maxDay = maxDaysOfMonth(year, month);
		
		for (int i = 1; i<= maxDay; i++) {
			System.out.printf("%4d",i);
			if (i % 7 == 0) {
				System.out.println();
			}
		} System.out.println();
		
// Ctrl + / 전체주석		
//		System.out.println("  1   2   3   4   5   6   7");
//		System.out.println("  8   9  10  11  12  13  14");
//		System.out.println(" 15  16  17  18  19  20  21");
//		System.out.println(" 22  23  24  25  26  27  28");
//		System.out.println(" 29  30  31                ");
	}
	
	public static void main(String[] args) {
		
	}
}
