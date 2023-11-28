import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Arith4 extends JFrame implements ActionListener{
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4;
	JPanel p1, p2;
	String s;
	
	public Arith4 () {
		setTitle("사직연산 프로그램");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(20);
		
		p1 = new JPanel();
		p1.add(t1);
		p1.add(t2);
		
		b1 = new JButton("더하기");
		b2 = new JButton("빼기");
		b3 = new JButton("곱하기");
		b4 = new JButton("나누기");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		add("North", p1);
		add("Center", p2);
		add("South", t3);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Arith4 a4 = new Arith4();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double d1, d2, d3;
		d1 = Double.parseDouble(t1.getText());
		d2 = Double.parseDouble(t2.getText());
		if(e.getSource()==b1) { // +
			d3 = d1 + d2;
			t3.setText(d1+"+"+d2+"="+d3);
		}
		if(e.getSource()==b2) { // -
			d3 = d1 - d2;
			t3.setText(d1+"-"+d2+"="+d3);
		}
		if(e.getSource()==b3) { // *
			d3 = d1 * d2;
			t3.setText(d1+"*"+d2+"="+d3);
		}
		if(e.getSource()==b4) { // /
			d3 = d1 / d2;
			t3.setText(d1+"/"+d2+"="+d3);
		}
		
	}

}
