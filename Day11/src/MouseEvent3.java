import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent3 extends JFrame implements MouseMotionListener{
	JLabel Lb;
	
	public MouseEvent3() {
		setTitle("마우스 이벤트3");
		setLayout(new FlowLayout());
		Lb = new JLabel("마우스를 동작해보세요");
		add(Lb);
		addMouseMotionListener(this);
		setSize(300, 200);
		setVisible(true);
	}
		
	@Override
	public void mouseDragged(MouseEvent e) {
		Lb.setText("마우스가 드래그됩니다 ==> " +e.getX() + " ," +e.getY());
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		Lb.setText("마우스가 움직입니다 ==> " +e.getX() + " ," +e.getY());
		
	}
	
	public static void main(String[] args) {
		MouseEvent3 me3 = new MouseEvent3();
	}

}
