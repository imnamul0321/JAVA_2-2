import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioEvent2 extends JFrame implements ItemListener{

	JLabel Lb;
	JPanel P1, P2;
	JTextField Tf1, Tf2;
	JRadioButton Rb1, Rb2, Rb3, Rb4;
	ButtonGroup grp;
	
	public RadioEvent2() {
		setTitle("라디오버튼 이벤트2");
		
		Lb = new JLabel();
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(10);
		Rb1 = new JRadioButton("더하기");
		Rb2 = new JRadioButton("빼기");
		Rb3 = new JRadioButton("곱하기");
		Rb4 = new JRadioButton("나누기");
		
		Rb1.addItemListener(this);
		Rb2.addItemListener(this);
		Rb3.addItemListener(this);
		Rb4.addItemListener(this);
		
		grp = new ButtonGroup();
		grp.add(Rb1);
		grp.add(Rb2);
		grp.add(Rb3);
		grp.add(Rb4);
		
		P1 = new JPanel();
		P1.add(Tf1);
		P1.add(Tf2);
		
		P2 = new JPanel();
		P2.add(Rb1);
		P2.add(Rb2);
		P2.add(Rb3);
		P2.add(Rb4);
		
		add("North", P1);
		add("Center", P2);
		add("South", Lb);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		RadioEvent2 re2 = new RadioEvent2();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		double d1, d2, d3;
		d1 = Double.parseDouble(Tf1.getText());
		d2 = Double.parseDouble(Tf2.getText());
		if(Rb1.isSelected()) { // +
			d3 = d1 + d2;
			Lb.setText(d1+"+"+d2+"="+d3);
		}
		if(Rb2.isSelected()) { // -
			d3 = d1 - d2;
			Lb.setText(d1+"-"+d2+"="+d3);
		}
		if(Rb3.isSelected()) { // *
			d3 = d1 * d2;
			Lb.setText(d1+"*"+d2+"="+d3);
		}
		if(Rb4.isSelected()) { // /
			d3 = d1 / d2;
			Lb.setText(d1+"/"+d2+"="+d3);
		}
		
	}

}
