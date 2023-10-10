public class Circle {
	static double PI = 3.14;
	double r, circum, area;
	void CircleCalc(double n) {
		r = n;
		circum = 2*3.14*r;
		area = r*r*3.14;
		ShowResult(this); //객체 자신을 인수로 사용하고자 할 때
	}
	void ShowResult(Circle c) {
		System.out.println("반지름이 "+c.r +"인 원의 둘레는"+c.circum
				+" 면적은:"+area);
	}
}
