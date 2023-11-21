import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent4 extends JFrame implements MouseMotionListener, MouseListener{
	JLabel Lb;
	public MouseEvent4() {
		setTitle("마우스 이벤트4");
		setLayout(new FlowLayout());
		Lb = new JLabel("마우스를 동작해보세요");
		add(Lb);
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(300, 200);
		setVisible(true);
		}
	@Override
	public void mousePressed(MouseEvent e) {
		Lb.setText("마우스가 눌러졌습니다");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		Lb.setText("마우스가 떨어졌습니다");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Lb.setText("마우스가 클릭되었습니다");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		Lb.setText("마우스가 들어왔습니다");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		Lb.setText("마우스가 나갔습니다");
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
		MouseEvent4 me4 = new MouseEvent4();
	}
}
