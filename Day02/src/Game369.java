import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력하세요 :");
		num = s.nextInt();
		
		if(num>100) {
			System.out.println("369게임은 100 이하의 숫자로 운영됩니다.");
		}else if ((num%3 ==0)||(num%10==3)||(num/10==3)) {
			System.out.println("박수 짝!");
		}else {
			System.out.println(num);
		}
		s.close();
	}

}
