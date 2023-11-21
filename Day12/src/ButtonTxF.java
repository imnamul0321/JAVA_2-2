import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonTxF extends JFrame implements ActionListener{
	JButton b1;
	JPanel p1, p2;
	JLabel lb;
	JTextField t1, t2;
	String s;
	
	public ButtonTxF () { 
		setTitle("문자열 연결하기");
		
		b1 = new JButton("연결");
		b1.addActionListener(this);
		
		p1 = new JPanel();
		p1.add(b1);
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		p2 = new JPanel();
		
		p2.add(t1); 
		p2.add(t2);
		lb = new JLabel("문자열이 연결됩니다.");
		
		add("North", p1);
		add("Center", p2);
		add("South", lb);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ButtonTxF btf = new ButtonTxF(); 

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) { 
			s = t1.getText() + " "+t2.getText();
			lb.setText(s);
		}
		
	}

}
