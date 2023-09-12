import java.util.Scanner;

public class SimpleSwitch {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("1~3 사이의 숫자를 입력하세요: ");
		num = s.nextInt();
		switch (num) {
		case 1:
			System.out.println("숫자 1을 입력하였습니다. ");
			break;
		case 2:
			System.out.println("숫자 2을 입력하였습니다. ");
			break;
		case 3:
			System.out.println("숫자 3을 입력하였습니다. ");
			break;
			
		default:
			System.out.println("숫자 1을 입력하였습니다. ");
			break;
		}
		
		s.close();
	}

}
