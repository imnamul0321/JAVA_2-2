import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorEx extends JFrame{
	private JButton btn1, btn2;
	public ColorEx() {
		setTitle("색상예제");
		setLayout(new FlowLayout());
		btn1 = new JButton("전송");
		btn2 = new JButton("취소");
		
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.ORANGE);
		btn1.setForeground(Color.blue);
		btn2.setForeground(Color.blue);
		add(btn1); add(btn2);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		ColorEx c = new ColorEx();

	}

}
