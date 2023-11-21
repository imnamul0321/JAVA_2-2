import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent5 extends JFrame {
	
	JLabel Lb;
	
	public MouseEvent5() {
		setTitle("마우스 이벤트(어뎁터)");
		setLayout(new FlowLayout());
		Lb = new JLabel("마우스를 동작해보세요");
		add(Lb);
		addMouseListener(new MyMouseAdapter());
		addMouseMotionListener(new MyMouseMotionAdapter());
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			Lb.setText("마우스가 클릭되었습니다");
		}
		
	}
	class MyMouseMotionAdapter extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			Lb.setText("마우스가 드래그됩니다==> "+e.getX()+ "," +e.getY());
		}
	}
	
	public static void main(String[] args) {
		
		MouseEvent5 me5 = new MouseEvent5();

	}

}
