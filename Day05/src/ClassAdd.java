
public class ClassAdd {
	int result;
	int add_num(int n1, int n2){
		result = n1 + n2;
		return(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1, add2;
		ClassAdd Add1, Add2;
		Add1 = new ClassAdd();
		Add2 = new ClassAdd();
		add1 = Add1.add_num(12, 7);
		add2 = Add2.add_num(128, 534);
		System.out.println("12 더하기 7은 " +add1+ "입니다.");
		System.out.println("128 더하기 534은 " +add2+ "입니다.");
	}
}
