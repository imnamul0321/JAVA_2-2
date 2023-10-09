import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		final int size = 10;
		int [] seats = new int[size];
		while(true) {
			System.out.println("\n------------------------------");
			for(int i=0;i<size;i++) {
				System.out.print(i+1+" ");
			}
			System.out.println("\n------------------------------");
			for(int i=0;i<size;i++) {
				System.out.print(seats[i]+" ");
			}
			System.out.println("\n------------------------------");
			System.out.println("원하시는 좌석번호를 입력하세요(종료시 -1");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			//-1 종료되는 부분
			if(s==-1) {
				break;
			}
			if(seats[s-1]==0) {
				seats[s-1]= 1;
				System.out.println("예약되었습니다.");
			}else {
				System.out.println("이미 예약된 자리입니다.");
			}
			
		}
		
	}

}
