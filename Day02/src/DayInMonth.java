import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		System.out.println("연도를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		int year = sc.nextInt();
		int month = ss.nextInt();
		
		switch (month) {
		case 4, 6, 9, 11:
			System.out.println("30일");
			break;
		case 1,3,5,7,8,10,12:
			System.out.println("31일");
			break;
		case 2:
			if (year % 4 == 0&& year % 100 !=0 || year%400==0) {
				System.out.println(year + "년은 윤년");
				System.out.println("29일");
			}else {
				System.out.println("28일");
			}
			break;
		default:
			break;
		}
		
}
