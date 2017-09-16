package sm.calendar;

import java.util.Scanner;

public class CalendarExam3 {
	
	public final int[] maxDays = {31, 28, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return maxDays[month -1];
	}
	
	public static void main(String[] args) {
		String PROMPT = "cal > ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복 횟수를 입력해주세요.");
		int repeat = sc.nextInt();
		
		for (int i=0; i<repeat; i++) {
			System.out.println("달을 입력해주세요.");
			System.out.print(PROMPT);
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일 까지 있습니다.\n" , month , cal.maxDaysOfMonth(month));
		}
		System.out.println(" - End - ");
		sc.close();
	}
}
