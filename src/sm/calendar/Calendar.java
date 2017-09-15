package sm.calendar;

import java.util.Scanner;

public class Calendar {
	public final int[] maxDays = {31, 28, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return maxDays[month -1];
	}
	
	public void printSampleCalendar () {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Calendar");
		System.out.println(" 일    월    화    수    목    금    토");
		System.out.println("ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("input value of month you want to show");
		int month = sc.nextInt();
		System.out.printf("%d월은 %d일 까지 있습니다.\n" , month , cal.maxDaysOfMonth(month));
		
		cal.printSampleCalendar();
		
		sc.close();
	}
}
