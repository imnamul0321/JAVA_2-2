
import java.util.Scanner;

public class SimpleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num;
		Scanner s = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요: ");
		i = s.nextInt();
		for(num=0; num<i; num++) {
			System.out.println("for 문을 이용하여 반복 실행됩니다.");
		}
			
	}

}
