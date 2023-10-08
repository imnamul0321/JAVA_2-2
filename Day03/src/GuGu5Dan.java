
public class GuGu5Dan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("구구단 5단 입니다");
		for(num = 1; num < 10; num++) {
			System.out.print("5 x "+num+" = "+ 5*num);
			if (num %3 == 0) {
				System.out.println("\n");
				
			}else {
				System.out.print("\t"); //tab
			}
		}
		System.out.println("\n\n");
	}

}
