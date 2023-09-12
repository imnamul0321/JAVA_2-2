import java.util.Scanner;

public class MultiIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int muge;
		Scanner s = new Scanner(System.in);
		System.out.println("체중을 입력하세요.");
		muge = s.nextInt();
		
		if (muge > 100) {
			System.out.println("고도 비만입니다.");
		}else if (muge > 80) {
			System.out.println("비만입니다.");
		}else if (muge > 60) {
			System.out.println("표준입니다.");
		}else {
			System.out.println("미달입니다.");
		}
		System.out.println("당신의 체중은 "+muge+"킬로그램입니다.");
			
		s.close();
		
	}

}
