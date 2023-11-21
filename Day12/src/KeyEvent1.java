import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEvent1 extends JFrame implements KeyListener{
	JLabel Lb;
	
	public KeyEvent1 () {
		setTitle("키보드 이벤트");
		setLayout(new FlowLayout());
		
		Lb = new JLabel("키보드를 이용하여 키를 입력해보세요");
		add(Lb);
		
		addKeyListener(this);
		setSize(300,130);
		setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		Lb.setText("키가 눌러졌습니다 : "+ e.getKeyText(e.getKeyCode()));
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		Lb.setText("키가 떼어졌습니다 : "+ e.getKeyText(e.getKeyCode()));
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		Lb.setText("문자키가 입력되었습니다 : "+ e.getKeyText(e.getKeyCode()));
		
	}
	public static void main(String[] args) {
		KeyEvent1 ke1 = new KeyEvent1();

	}

}
