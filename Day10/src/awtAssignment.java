import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class awtAssignment extends JFrame {
	private JButton btn;
	private JPanel pan1, pan2;
	private JLabel label1, label2;
	public awtAssignment() {
		setTitle("AWT 기본예제");
		setLayout(new BorderLayout());
		
		pan1 = new JPanel();
		pan2 = new JPanel();
		TextField txt1 = new TextField(10);
		TextField txt2 = new TextField(10);
		Button btn = new Button("login");
		
		label1 = new JLabel("ID");
		label2 = new JLabel("비밀번호");
		
		add("North",pan1); 
		add("South",pan2); 
		pan1.add(label1);
		pan2.add(label2);
		pan1.add(txt1);
		pan2.add(txt2);
		pan2.add(btn);
		setSize(250, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		awtAssignment aa = new awtAssignment();
	}

}