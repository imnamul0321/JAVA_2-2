public class Sum1To10 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int n=1; n <= 10; n++) {
			sum += n;
		}
			
		System.out.println("1부터 10까지의 합계는 "+sum+" 입니다.");
	}

}
