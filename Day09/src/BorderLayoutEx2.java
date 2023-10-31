import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEx2 extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JPanel pan1, pan2, pan3;
	
	public BorderLayoutEx2() {
		setTitle("보더 레이아웃 예제 2");
		setLayout(new BorderLayout());
		
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();
		
		pan1.setBackground(Color.gray);
		pan2.setBackground(Color.GREEN);
		pan3.setBackground(Color.cyan);
		
		btn1 = new JButton("이순신");
		btn2 = new JButton("강감찬");
		btn3 = new JButton("홍길동");
		btn4 = new JButton("임꺽정");
		btn5 = new JButton("채현석");
		
		pan1.add(btn1); pan1.add(btn2);
		pan2.add(btn3); pan3.add(btn4); pan3.add(btn5);
		
		add("North",pan1); 
		add("Center",pan2); 
		add("South",pan3);
		
		setSize(300, 150);
		setVisible(true);
				
	}
	
	public static void main(String[] args) {
		BorderLayoutEx2 obj = new BorderLayoutEx2();

	}

}
