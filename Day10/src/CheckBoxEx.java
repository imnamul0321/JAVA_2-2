
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class CheckBoxEx extends JFrame {
	
	JCheckBox Cb1, Cb2, Cb3, Cb4;

	
	public CheckBoxEx() {
		super("체크박스 예제");
		setLayout(new FlowLayout());
		Cb1= new JCheckBox("포도");
		Cb2= new JCheckBox("사과");
		Cb3= new JCheckBox("수박");
		Cb4= new JCheckBox("자두");
		
		add(Cb1);
		add(Cb2);
		add(Cb3);
		add(Cb4);
		
		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		CheckBoxEx cb = new CheckBoxEx(); 

	}

}
