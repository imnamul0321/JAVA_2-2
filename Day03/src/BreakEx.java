import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum, nu;
		sum =0;
		num =1;
		Scanner s =new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		nu = s.nextInt();
		
		while(true) {
			sum += num;
			num++; 
			if(num > nu) {
				break;
			}
		}
		System.out.println("1부터 "+nu+"까지의 합은 "+sum+"입니다.");
	}

}
