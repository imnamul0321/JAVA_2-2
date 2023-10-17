class ClssA{
	public ClssA() {
		System.out.println("ClssA의 생성자");
	}
	public ClssA(int a) {
		System.out.println("a의 3제곱은: "+a*a*a);
	}
}
class ClssB extends ClssA {
	public ClssB() {
		System.out.println("ClssB의 생성자");
	}
	public ClssB(int a) {
		super(10);
		System.out.println("ClssB의 생성자: 인수="+a);
	}
}
public class InhContrtEx2 {

	public static void main(String[] args) {
		ClssB c = new ClssB(5);
	}

}
