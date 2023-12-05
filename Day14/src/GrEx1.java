import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrEx1 extends JFrame{

	public GrEx1 () {
		setTitle("문자열 출력하기");
		
		MyPanel pan = new MyPanel();
		add("Center", pan);
		setSize(400, 330);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			
			super.paint(g);
			//출력할 문자열 x,y
			g.drawString("g.drawString()을 이용한 문자열 출력", 50, 100);
			//x, y 시작 좌표 x, y의 끝좌표
			g.drawLine(50, 120, 270, 60);
			g.drawLine(50, 30, 250, 160);
			//x, y 좌표 w 넓이, h 높이
			g.drawRect(50, 120, 300, 120);
			g.drawRect(80, 40, 140, 220);
		}
	}
	
	public static void main(String[] args) {
		GrEx1 ge1 = new GrEx1();

	}

}
