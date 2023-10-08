import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random generator = new Random();
		System.out.println("난수의 개수: " );
		Scanner s = new Scanner(System.in);
		
		int count = s.nextInt();
		int sum = 0;
		
		for (int i =0; i< count; i++) {
			int number = generator.nextInt(100);
			System.out.println("난수 :"+number);
			
			sum += number;
		}
	
		
		System.out.println("난수"+count+"개의 합은 : "+sum);
		s.close();
	}

}
