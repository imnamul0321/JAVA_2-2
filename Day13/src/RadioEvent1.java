import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioEvent1 extends JFrame implements ItemListener{

	JPanel P1;
	JLabel Lb;
	JTextArea Ta;
	JRadioButton Rb1, Rb2, Rb3;
	ButtonGroup grp;
	
	public RadioEvent1() {
		
		setTitle("라디오버튼 이벤트1");
		
		Lb = new JLabel("후식을 선택하세요");
		Ta = new JTextArea();
		Rb1 = new JRadioButton("과일");
		Rb2 = new JRadioButton("커피");
		Rb3 = new JRadioButton("녹차");
		
		Rb1.addItemListener(this);
		Rb2.addItemListener(this);
		Rb3.addItemListener(this);
		
		grp = new ButtonGroup();
		grp.add(Rb1);
		grp.add(Rb2);
		grp.add(Rb3);
		
		P1 = new JPanel();
		P1.add(Rb1);
		P1.add(Rb2);
		P1.add(Rb3);
		
		add("North", Lb);
		add("Center", Ta);
		add("South", P1);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		RadioEvent1 re1 = new RadioEvent1();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Ta.setText("");
		if(Rb1.isSelected()) {
			Ta.append("과일 선택");
		}
		if(Rb2.isSelected()) {
			Ta.append("커피 선택");
		}
		if(Rb3.isSelected()) {
			Ta.append("녹차 선택");
		}
		
	}
}
