import java.awt.BorderLayout;
//import java.awt.FlowLayout;


import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonEx2 extends JFrame {
	JRadioButton Rb1, Rb2, Rb3, Rb4;
	JCheckBox Cb1, Cb2;
	JPanel Pan1, Pan2, Pan3;
	JTextField Tf1, Tf2;
	JLabel Lab1, Lab2, Lab3, Lab4;
	
	public RadioButtonEx2() {
		setTitle("복잡한 예제");
		setLayout(new BorderLayout());
		
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(20);
		Cb1 = new JCheckBox("남");
		Cb2 = new JCheckBox("여", true);
		
		Lab1 = new JLabel("이름: ");
		Lab2 = new JLabel("주소: ");
		Lab3 = new JLabel("성별: ");
		Lab4 = new JLabel("취미: ");
		
		Pan1 = new JPanel();
		Pan2 = new JPanel();
		Pan3 = new JPanel();
		
		Rb1 = new JRadioButton("게임");
		Rb2 = new JRadioButton("등산");
		Rb3 = new JRadioButton("여행");
		Rb4 = new JRadioButton("공부");
						
		Pan1.add(Lab1);
		Pan1.add(Tf1);
		Pan1.add(Lab2);
		Pan1.add(Tf2);
		Pan2.add(Lab3);
		Pan2.add(Cb1);
		Pan2.add(Cb2);
		Pan3.add(Lab4);
		Pan3.add(Rb1);
		Pan3.add(Rb2);
		Pan3.add(Rb3);
		Pan3.add(Rb4);
		
		add("North", Pan1);
		add("Center", Pan2);
		add("South", Pan3);
		
		setSize(500,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		RadioButtonEx2 rb2 = new RadioButtonEx2();
	}

}
