import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CheckEvent1 extends JFrame implements ItemListener{
	
	JLabel Lb;
	JPanel P1;
	JTextArea Ta;
	JCheckBox Cb1, Cb2, Cb3;
	
	public CheckEvent1() {
		
		setTitle("체크박스 이벤트1");
		
		Lb = new JLabel("항목을 선택하세요");
		Ta = new JTextArea();
		
		Cb1 = new JCheckBox("포도");
		Cb2 = new JCheckBox("사과");
		Cb3 = new JCheckBox("딸기");
		
		Cb1.addItemListener(this);
		Cb2.addItemListener(this);
		Cb3.addItemListener(this);
		
		P1 = new JPanel();
		P1.add(Cb1);
		P1.add(Cb2);
		P1.add(Cb3);
		
		add("North",Lb);
		add("Center", Ta);
		add("South",P1);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {	
		CheckEvent1 ce1 = new CheckEvent1();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Ta.setText("");
		if(Cb1.isSelected()) {
			Ta.append("<<포도>>");
		}
		if(Cb2.isSelected()) {
			Ta.append("<<사과>>");
		}
		if(Cb3.isSelected()) {
			Ta.append("<<딸기>>");
		}
		
	}

}
