
public class USBMem {
	int cap;
	String color;
	public USBMem(int c, String cir) {
		cap = c;
		color = cir;

	}
	void USBAttrShow() {
		System.out.println("용량이 "+cap+"G 색생이 "+color+" 인 USB:");
	}
	void MemWrite() {
		USBAttrShow();
		System.out.println("데이터를 메모리에 씁니다.");
	}
	void MemRead() {
		USBAttrShow();
		System.out.println("데이터를 메모리에서 읽어옵니다.");
	}
}
