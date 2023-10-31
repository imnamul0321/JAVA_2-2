import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx extends JFrame{
	
	private JLabel lb1, lb2;
	public LabelEx() {
		setLayout(new FlowLayout()); //배치관리자
		lb1 = new JLabel("성명 :       ");
		lb2 = new JLabel("주민번호 :    ");
		add(lb1); add(lb2);
		setTitle("라벨예제");
		setSize(500, 300);
		setVisible(true);
}
	public static void main(String[] args) {
		LabelEx obj = new LabelEx();

	}

}
