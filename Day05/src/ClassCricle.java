
public class ClassCricle {

	public static void main(String[] args) {
		
		double cir, area;
		Circle c1, c2;
		c1 = new Circle();
		c2 = new Circle();
		cir = c1.Circum(3);
		area = c1.Area(3);
		System.out.println("반지름이 3인 원의 둘레는"+cir+"면적은"+area+"입니다.");
		cir = c2.Circum(7);
		area = c2.Area(7);
		System.out.println("반지름이 7인 원의 둘레는"+cir+"면적은"+area+"입니다.");
		
	}

}
