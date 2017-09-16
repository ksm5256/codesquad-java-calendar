package sm.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal > ";
	
	public void runPrompt() {
		String PROMPT = "cal > ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar(); // Calendar클래스 연결
		int month = 1;
		while (true) {
			System.out.println("월을 입력해주세요.");
			System.out.print(PROMPT);
			month = sc.nextInt();
			
			if (month == -1) {
				System.out.println(" - Program end - ");
				break;
			}
			if (month > 13) {
				System.out.println(" 다시 입력해주세요 ");
				continue;
			}
			cal.printCalendar(2017, month);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
