package sm.calendar;

import java.util.Scanner;

public class CalendarExam4 {
	
	public final int[] maxDays = {31, 28, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return maxDays[month -1];
	}
	
	public static void main(String[] args) {
		String PROMPT = "cal > ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month;
		while (true) {
			System.out.println("달을 입력해주세요.");
			System.out.print(PROMPT);
			month = sc.nextInt();
				if (month == -1)
					break;
			System.out.printf("%d월은 %d일 까지 있습니다.\n" , month , cal.maxDaysOfMonth(month));
		}
		System.out.println("-end-");
		sc.close();
	}
}
