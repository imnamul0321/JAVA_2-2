import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2_1 extends JFrame implements MouseListener {
	JButton Btn1, Btn2;
	JLabel	Lb;
			
	public MouseEvent2_1() {
		setTitle("마우스 이벤트2_1");
		setLayout(new FlowLayout());
		Lb = new JLabel("버튼를 동작해보세요");
		Btn1 = new JButton("버튼1");
		Btn2 = new JButton("버튼2");
				
		add(Lb); add(Btn1); add(Btn2); 
		Btn1.addMouseListener(this);
		Btn2.addMouseListener(this);
		setSize(300,200);
		setVisible(true);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Lb.setForeground(Color.red);
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==Btn1) {Lb.setText("버튼 1 클릭됨");}
		if(e.getSource()==Btn2) {Lb.setText("버튼 2 클릭됨");}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	
	public static void main(String[] args) {

		MouseEvent2_1 me2 = new MouseEvent2_1();
	}

}