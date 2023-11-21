import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEvent2 extends JFrame implements ActionListener{
	
	JButton Btn1, Btn2, Btn3, Btn4;
	JLabel Lb;
	
	public ButtonEvent2 () {
		
		setTitle("액션 이벤트2");
		setLayout(new FlowLayout());
		
		Btn1 = new JButton("남자");
		Btn2 = new JButton("여자");
		Btn3 = new JButton("개");
		Btn4 = new JButton("고양이");
		
		Lb = new JLabel("버튼을 선택하세요");
		
		add(Btn1); add(Btn2); add(Btn3); add(Btn4);
		add(Lb);
		
		Btn1.addActionListener(this);
		Btn2.addActionListener(this);
		Btn3.addActionListener(this);
		Btn4.addActionListener(this);
		
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Btn1) {	Lb.setText("남자를 선택하였습니다.");	}
			if(e.getSource()==Btn2) {	Lb.setText("여자를 선택하였습니다.");	}
			if(e.getSource()==Btn3) {	Lb.setText("개를 선택하였습니다.");	}
			if(e.getSource()==Btn4) {	Lb.setText("고양이를 선택하였습니다.");	}
			
	}
	
	
	public static void main(String[] args) {
		ButtonEvent2 be2 = new ButtonEvent2();

	}

}
