package sm.calendar;

import java.util.Scanner;

public class Prompt {
	
	/*
	 * @param week : 요일명
	 * @return 0~6 (0=Sunday, 6=Saturday)
	 */
	public int parseDay (String weekday) {
		if (weekday.equals("sun")) 	{	return 0;
		} else if (weekday.equals("mon")) { return 1;
		} else if (weekday.equals("tue")) { return 2;
		} else if (weekday.equals("wed")) { return 3;
		} else if (weekday.equals("thu")) { return 4;
		} else if (weekday.equals("fri")) { return 5;
		} else if (weekday.equals("sat")) { return 6;
		} else return 0;
	}
	
//	private final static String PROMPT = "cal > ";
	
	public void runPrompt() {
//		String PROMPT = "cal > ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar(); // Calendar클래스 연결
		int month = 1;
		int year = 2017;
//		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요. (exit:-1)");
			System.out.print("YEAR > ");
			year = sc.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("월을 입력해주세요.");
			System.out.print("MONTH > ");
			month = sc.nextInt();
			
			if (month > 12 || month < 1) {
				System.out.println(" 다시 입력해주세요 ");
				continue;
			}
			
//			System.out.println("첫번째 요일을 입력하세요");
//			System.out.print("Start Day > ");
//			String str_Weekday = sc.next();		// String형태로 입력받고
//			weekday = parseDay(str_Weekday);	// String에서 int형으로 형변환 (parseDay메소드 활용)
			
			cal.printCalendar(year, month);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
