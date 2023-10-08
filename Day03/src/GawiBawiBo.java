import java.util.*;

public class GawiBawiBo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random random = new Random();
		
		int input = 0;
		while(true) {
			System.out.print("입력 (가위 0, 바위 1, 보 2, 종료시 -1) :");
			input = s.nextInt();
			if (input <0) {
				break;
			}
			int saram = input; //사람이 낸 가위 바위 보 값
			int com = random.nextInt()%3;
			//랜덤으로 받는 수가 음수이면 양수로 변환
			if(com < 0) {
				com = com * -1;
			}
			//가위 0 바위 1 보 2 의외수 처리 => 다시시작
			if (saram > 2) {
				System.out.println("다시");
				continue;
			}
			
			//사람이 낸 결과값
			if (saram==0) {
				System.out.println("당신은 가위를 냈습니다.");
			}else if (saram==1){
				System.out.println("당신은 바위를 냈습니다.");
			}else if (saram==2){
				System.out.println("당신은 보를 냈습니다.");
			}
			//컴퓨터가 낸 결과값
			if (com==0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			}else if (com==1){
				System.out.println("컴퓨터는 바위를 냈습니다.");
			}else if (com==2){
				System.out.println("컴퓨터는 보를 냈습니다.");
			}
			System.out.println("--------------------");
			System.out.println("게임결과 :");
			if (saram==com) {
				System.out.println("비겼습니다.");
			}else if (saram==(com+1)%3){
				System.out.println("당신이 이겼습니다.");
			}else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			
			System.out.println("--------------------");
			System.out.println();
	
	}
		System.out.println("게임종료");
		}
	}
