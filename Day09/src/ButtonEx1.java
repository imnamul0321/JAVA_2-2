import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx1 extends JFrame{
	private JButton btn1, btn2, btn3, btn4;
	public ButtonEx1() {
		setTitle("버튼예제");
		setLayout(new FlowLayout());
		btn1 = new JButton("전송");
		btn2 = new JButton("취소");
				add(btn1);
		add(btn2);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonEx1 obj = new ButtonEx1();
	}

}