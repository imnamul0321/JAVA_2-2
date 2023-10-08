import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int month;
		Scanner s = new Scanner(System.in);
		do {
			
			month = s.nextInt();
			
			System.out.println(month);
			
		}	while ( month < 1 || month > 12);
		
	}

}
