import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx2 extends JFrame{
	private JButton bt1, bt2, bt3, bt4;
	
	public ButtonEx2() {
		setTitle("버튼예제");
		setLayout(new FlowLayout());
		bt1 = new JButton("버튼1");
		bt2 = new JButton("버튼2");
		bt3 = new JButton("버튼3");
		bt4 = new JButton("버튼4");
		add(bt1);add(bt2);add(bt3);add(bt4);
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ButtonEx2 obj = new ButtonEx2(); 

	}

}
