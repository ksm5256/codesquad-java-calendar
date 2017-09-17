package sm.calendar;

public class Calendar {
	public final int[] maxDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public final int[] Leap_maxDays = {0, 31, 29, 30, 31, 31, 30, 31, 31, 30, 31, 30, 31};
	
	/*
	 * @ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 -2017 365d
	 * @ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 -2018 365d
	 * @ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 -2019 365d
	 * @ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 -2020 366d
	 * @ 1. 그 해의 연도가 4의 배수가 아니면, 평년으로 2월은 28일까지만 있다. -> 4의 배수면 2월은 29일까지
     * @ 2. 만약 연도가 4의 배수이면서 100의 배수가 아니면, 윤일(2월 29일)을 도입한다.
     * @ 3. 만약 연도가 100의 배수이면서 400의 배수가 아닐 때, 이 해는 평년으로 생각한다.
     * @ 4. 만약 연도가 400의 배수이면, 윤일(2월 29일)을 도입한다.
	 */
	
	/* 윤년을 계산해주는 메소드 */
	public boolean isLeapYear (int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	/* maxDays, Leap_maxDays 배열값 이용. isLeapYear메소드에서 윤년과 평년인 달을 리턴해주는 메소드 */
	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return Leap_maxDays[month];
		} else
		return maxDays[month];
	}
	
	/* 달력 출력하는 메소드 */
	public void printCalendar (int year, int month) {
		/* 
		 * @ printf = print formatted 약자
		 * @ \n 줄바꿈 \r home \t tab 
		 * */
		System.out.printf("    <<%6d %3d>>\n", year , month);
		System.out.println("Hello Calendar");
		System.out.println(" sun mon tue wed thu fri sat");
		System.out.println(" --- --- --- --- --- --- ---");
		
		
		//get weekday automatically
		/* 2017년 6월 1일이 무슨 요일인지 자동으로 잡아주는 로직을 만들어 줌. */
		int weekday = getWeekDay(year, month, 1);
		/* (year, month, 1)을 입력받는 WeekDay라는 함수를 만들었음. */
		/* getWeekDay 메소드 만들어짐 */
		
		// print blank space
		for (int i=0; i<weekday; i++) {
			System.out.print("    ");
		}
		
		int maxDay = maxDaysOfMonth(year, month);
		
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0; // count가 7보다 작으면 count==0
		/*
		 +		int delim;
		 +		if (count < 7) {
		 +			delim = count;
		 +		} else {
		 +			delim = 0;
		 +		}
		 */
		
		//print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%4d",i);
		} System.out.println();
		
		//print from second line to last line
		count++;
		for (int i = count; i<= maxDay; i++) {
			System.out.printf("%4d",i);
			if (i % 7 == delim) {
				System.out.println();
			}
		} 
		
		System.out.println();
		System.out.println();
		
// Ctrl + / 전체주석		
//		System.out.println("  1   2   3   4   5   6   7"); // first line
//		System.out.println("  8   9  10  11  12  13  14"); // second line
//		System.out.println(" 15  16  17  18  19  20  21");
//		System.out.println(" 22  23  24  25  26  27  28");
//		System.out.println(" 29  30  31                ");
	}
	
	/* 요일(Weekday)을 자동으로 잡아주고 알려주는 메소드 */
	private int getWeekDay(int year, int month, int day) {
		int sampleYear = 1900;	//1900
		final int STANDARD_WEEKDAY = 0; //1990/JAN/1st = Monday(0), Tuesday(1), Wednesday(2)
		
		int count = 0; // 총 일수(total days count)
		
		for(int i = sampleYear; i<year; i++) {
			int delta = isLeapYear(i) ? 366 : 365; // true=366 , else=365
			count += delta; // count + delta = delta;
		}
		
		//System.out.println(count);
		for(int i = 1; i < month; i++) {
			int delta = maxDaysOfMonth(year, i);
			count += delta;
		}
		count += day;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}

	public static void main(String[] args) {
		
	}
}
