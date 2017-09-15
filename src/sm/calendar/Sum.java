package sm.calendar;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int first, second;
		Scanner sc = new Scanner(System.in);
		System.out.println("값 두개를 입력해주세요.");
/*		String num1 = sc.next();
		String num2 = sc.next();
		first = Integer.parseInt(num1);
		second = Integer.parseInt(num2); // int는 primitive형 , Integer는 정수형이다. int ≠ Integer */
		first = sc.nextInt(); 
		second = sc.nextInt();
		int c = first + second;
		System.out.println("두 수의 합은" + c + "입니다.");
	}
}
