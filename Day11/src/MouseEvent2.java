import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2 extends JFrame implements MouseListener {
	JButton Btn;
	JLabel	Lb;
			
	public MouseEvent2() {
		setTitle("마우스 이벤트2");
		setLayout(new FlowLayout());
		
		Btn = new JButton("버튼을 동작하는 마우스 이벤트");
		Lb = new JLabel("마우스를 동작해보세요");
		
		add(Btn); add(Lb);
		Btn.addMouseListener(this);
		setSize(300,200);
		setVisible(true);
	}
	@Override
	public void mousePressed(MouseEvent e) {
	//Lb 마우스 눌렸습니다, Lb 글자색 red
		Lb.setText("마우스가 눌러졌습니다");
		Lb.setForeground(Color.red);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//Lb 마우스 클릭되었습니다, Lb 글자색 pink		
		Lb.setText("마우스가 클릭되었습니다");
		Lb.setForeground(Color.pink);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//Lb 마우스 들어왔습니다, 버튼 배경색 blue
		Lb.setText("마우스가 들어왔습니다");
		Btn.setBackground(Color.blue);
	}
	@Override
	public void mouseExited(MouseEvent e) {
	//Lb 마우스 나갔습니다, 버튼 배경색 yellow
		Lb.setText("마우스가 나갔습니다");
		Btn.setBackground(Color.yellow);		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	
		
	}
	
	public static void main(String[] args) {

		MouseEvent2 me2 = new MouseEvent2();
	}

}
