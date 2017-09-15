package sm.calendar;

import java.util.Scanner;

public class CalendarExam2 {
	
	public final int[] maxDays = {31, 28, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return maxDays[month -1];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 반복 횟수 입력받기
		Calendar cal = new Calendar();
		
		System.out.println("how many times do you want repeat the program?");
		int repeat = sc.nextInt();
		
		for(int i=0; i<repeat; i++) {
			System.out.println("input value of month"); // 월 입력 받기
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일 까지 있습니다.\n" , month , cal.maxDaysOfMonth(month));
		}
		System.out.println("- end -");
		sc.close();
		}
}