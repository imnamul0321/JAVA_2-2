import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyEvent2 extends JFrame implements KeyListener{
	
	JButton Btn;
	int CurXSize = 120;
	int CurYSize = 30;
	public KeyEvent2 () {
		setTitle("키보드 이벤트2");
		setLayout(null);
		
		Btn = new JButton("버튼입니다.");
		//Btn.setEnabled(false); //버튼이 활성화안됨
		Btn.setFocusable(false); //true 포커스 컴퍼넌트 여러개일때 우선권 false 잡지마
		Btn.setLocation(50, 30);
		Btn.setSize(120,30);
		
		add(Btn);
		addKeyListener(this);
		//requestFocus();//키 이벤트를 받을 컴포넌트 강제로 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,200);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP: {
			Btn.setLocation(Btn.getX(),Btn.getY() - 10);
			break;
		}
		case KeyEvent.VK_DOWN: {
			Btn.setLocation(Btn.getX(),Btn.getY() + 10);
			break;
		}
		case KeyEvent.VK_LEFT: {
			Btn.setLocation(Btn.getX() - 10,Btn.getY());
			break;
		}
		case KeyEvent.VK_RIGHT: {
			Btn.setLocation(Btn.getX() + 10,Btn.getY());
			break;
		}
		case KeyEvent.VK_F1: {
			Btn.setBackground(Color.pink);
			break;
		}
		case KeyEvent.VK_F2: {
			Btn.setBackground(Color.yellow);
			break;
		}
		case KeyEvent.VK_F3: {
			Btn.setBackground(Color.magenta);
			break;
		}
		case KeyEvent.VK_F4: {
			Btn.setBackground(Color.CYAN);
			break;
		}
		case KeyEvent.VK_F10: {
			Btn.setSize(CurXSize+=5,CurYSize+=5);
			CurYSize+=5;CurXSize+=5;
			break;
		}
		case KeyEvent.VK_F11: {
			Btn.setSize(CurXSize-=5,CurYSize-=5);
			CurYSize-=5;CurXSize-=5;
			break;
		}
		default:
			break;			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {

		
	}
	@Override
	public void keyTyped(KeyEvent e) {
 
		
	}

	public static void main(String[] args) {
		KeyEvent2 ke2 = new KeyEvent2();

	}
	
}
