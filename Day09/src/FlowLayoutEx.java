import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	public FlowLayoutEx() {
		setTitle("플로우 레이아웃 예제");
		//FlowLayout(int align, int hGap, int vGap)
		//기본 5인데 30으로 늘려준거임
		setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		
		btn1 = new JButton("가");
		btn2 = new JButton("나");
		btn3 = new JButton("다");
		btn4 = new JButton("라");
		btn5 = new JButton("마");
		
		add(btn1); add(btn2); add(btn3); add(btn4); add(btn5);
		
		setSize(200, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		FlowLayoutEx obj = new FlowLayoutEx();

	}

}
