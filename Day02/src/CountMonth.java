import java.util.Scanner;

public class CountMonth {

	public static void main(String[] args) {

		int month;
		Scanner s = new Scanner(System.in);
		System.out.println("월 입력");
		month = s.nextInt();
		
		switch (month) {
		case 4, 6, 9, 11:
			System.out.println("30일");
			break;
		case 1,3,5,7,8,10,12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			break;
		}
		
		
		s.close();
	}

}
