import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEvent1 extends JFrame implements ActionListener{
	JLabel Lb;
	JButton Btn;
	
	public ButtonEvent1 () {
		setTitle("액션 이벤트1");
		setLayout(new FlowLayout());
		Btn = new JButton("버튼");
		Lb = new JLabel("버튼을 클릭해 보세요");
		add(Btn); add(Lb);
		Btn.addActionListener(this);
		setSize(170, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Lb.setText("버튼이 클릭되었습니다");
		
	}
	
	public static void main(String[] args) {
		ButtonEvent1 be1 = new ButtonEvent1();

	}

}
