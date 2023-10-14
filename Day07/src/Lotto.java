import java.util.Scanner;

class GenNum{ //일반 번호, 보너스 번호 생성하는 역할
		private boolean duplicate = false;
		private int[] numbers;
		public void printNumber() {
			if(numbers==null||numbers[0]==0) {
				System.out.println("(System)Empty Value");
				return;
			}
			for (int i=0;i<numbers.length;i++) {
				if(i==6) { //보너스 번호
					System.out.println("(보너스번호)>>>"+numbers[i]);
				}else { //일반 번호
					System.out.println(">>>"+numbers[i]);
				}
			}
		}
public int[] start_generation() { //로또번호 모두생성
	numbers = new int[7];
	int [] imsi = getNomalNumber();
	for(int i=0;i<numbers.length;i++) {
		if(i==6) {
			numbers[i] = getBounusNumber(numbers);
		}else {
			numbers[i] = imsi[i];
		}
	}
	return numbers;
}            //보너스번호 생성
//중복 번호가 발견되면 duplicate 플래그를 true로 설정하고
//고유한 번호를 얻을 때까지 계속 번호를 생성
private int getBounusNumber(int[] nomal_number) {
	int bonus = 0;
	int imsi = 0;
	while(true) {
		while(true) { //random() 랜덤 받기
			imsi = (int)(Math.random()*45+1);
			for(int j=0;j<nomal_number.length;j++) {
				if (nomal_number[j]==imsi) {
					duplicate=true;
				}
			}
			if (duplicate) {
				duplicate = false;
				continue;
			}else {
				break;
			}
		}
		bonus = imsi;
		System.out.println("(로또 번호 생성기) 보너스 번호 생성 완료");
		return bonus;
	}
} 				//일반번호 6개 생성
				//중복을 확인
	private int[] getNomalNumber() {
		int [] normal_number = new int[6];
		int imsi = 0;
		for(int i=0; i<normal_number.length;i++) {
			imsi = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(normal_number[j] == imsi) {
					duplicate = true;
				}
			}
			if(!duplicate) {
				normal_number[i] = imsi;
			}else {
				duplicate = false;
				i--;
			}
		}
		System.out.println("(로또 번호 생성기)로또 번호 생성 완료");
		return normal_number;
	}
}
//메뉴 선택 및 GenNum 클래스의 메서드를 호출
//start 메서드는 사용자 상호 작용
//사용 가능한 메뉴 옵션은 번호 생성, 생성된 번호 보기 및 프로그램 종료
public class Lotto {
	private int command = 0;
	Scanner scan = new Scanner(System.in);
	private GenNum program = null;
	public final int GENERATION_NUMBER = 1;
	public final int PRINT_NUMBER = 2;
	public final int EXIT = 3;
	public Lotto() {
		Scanner scan = new Scanner(System.in);
		program = new GenNum();
		start();
	}
	public void start() {
		System.out.println("로또 프로그램이 시작됩니다.");
		System.out.println();
		do {
			System.out.println("==========로또번호생성기 메뉴==========");
			System.out.println("1.추첨 2.보기 3.끝내기");
			System.out.println("--------------------------------");
			System.out.println(">> ");
			this.command = scan.nextInt();
			switch (this.command) {
			case GENERATION_NUMBER:
				program.start_generation();
				break;
			case PRINT_NUMBER:
				program.printNumber();
				break;
			case EXIT:
				System.out.println("(로또 번호 생성기)행운이 있기를!");
				return;
			}
		}while(true);
	}
}