import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("사각형의 가로를 입력하세요:");
		w = input.nextInt();
		System.out.println("사각형의 세로를 입력하세요:");
		h = input.nextInt();
		area = w*h;
		perimeter = 2.0 * (w+h);
		
		System.out.println("사각형의 넓이:"+area);
		
		System.out.println("사각형의 둘레:"+perimeter);
		
		input.close();
		
	}

}
