import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	JLabel Lab1, Lab2, Lab3;
	JTextField Tf1, Tf2;
	JTextArea Ta;
	JPanel Pan1, Pan2, Pan3;
	
	public TextAreaEx() {
		setTitle("텍스트에어리어 예제"); setLayout(new BorderLayout());
		Lab1 = new JLabel("작성자: ");
		Lab2 = new JLabel("글제목: ");
		Lab3 = new JLabel("내용: ");
		Tf1 = new JTextField(7);
		Tf2 = new JTextField(20);
		Ta = new JTextArea(7, 30);
		Pan1 = new JPanel();
		Pan2 = new JPanel();
		Pan3 = new JPanel();
		Pan1.add(Lab1); Pan1.add(Tf1);
		Pan2.add(Lab2); Pan2.add(Tf2);
		Pan3.add(Lab3); Pan3.add(Ta);
		add("North", Pan1);
		add("Center", Pan2);
		add("South", Pan3);
		setSize(500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TextAreaEx ta = new TextAreaEx();

	}

}
