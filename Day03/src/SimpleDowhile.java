import java.util.Scanner;

public class SimpleDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, nu;
		Scanner s = new Scanner(System.in);
		
		System.out.println("반복할 횟수를 입력하세요: ");
		nu = s.nextInt();
		num = 0 ;
		do {
			System.out.println("do-while 문을 이용하여 반복 실행됩니다.");
			num++;
		} while (num < nu);
	}

}
