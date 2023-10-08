import java.util.Scanner;

public class Sum1ToNum {

	public static void main(String[] args) {

		int sum = 0, n;
		System.out.println("숫자입력 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (n=1; n <= num; n++) {
			sum += n;
		}
			
		System.out.println("1부터 "+num+ "까지의 합계는 "+sum+" 입니다.");
	}

}
