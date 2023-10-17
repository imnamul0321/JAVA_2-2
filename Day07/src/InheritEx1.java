class StInfo{
	String name;
	String phone;
	int age;
}
class SubStInfo extends StInfo{
	String addr;
}
public class InheritEx1 {
	public static void main(String[] args) {
		SubStInfo a = new SubStInfo();
		a.name = "홍길동";
		a.phone = "010-1111-2222";
		a.age = 20;
		a.addr = "경기도 광주시 곤지안읍";
		System.out.println("이름 :"+a.name+", 전화번호: "+a.phone
				+", 나이 :"+a.age+", 주소 :"+a.addr);

	}

}
