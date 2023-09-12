import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jum;
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		jum = s.nextInt();
		
		if(jum >=90) {
			System.out.println("점수 "+jum+"의 학점은 A입니다.");
		}else if(jum >=80) {
			System.out.println("점수 "+jum+"의 학점은 B입니다.");
		}else if(jum >=70) {
			System.out.println("점수 "+jum+"의 학점은 C입니다.");
		}else if(jum >=60) {
			System.out.println("점수 "+jum+"의 학점은 D입니다.");
		}else  {
			System.out.println("점수 "+jum+"의 학점은 F입니다.");
		}
		
		s.close();
	}

}
