public class AccessExTest {

	private int n1;

	public static void main(String[] args) {
		AccessEx1 a = new AccessEx1();
		a.n1 = 10;
		a.Setn2(20);
		System.out.println("멤버 변수의 값은 "+a.n1+", "+a.Getn2());
	}

}
