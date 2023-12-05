import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Menu3 extends JFrame implements ActionListener{
	JTextField Tf;
	JMenuBar mbar;
	JMenu mattack, mmove;
	JMenuItem att_gun, att_bomb, att_laser, move_for, move_back;
		
	public Menu3() {
		setTitle("메뉴 공격 이동");
		
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		mattack = new JMenu("공격");
		
		att_gun = new JMenuItem("총");
		att_bomb = new JMenuItem("폭탄");		
		att_laser = new JMenuItem("레이저");
		
		att_gun.addActionListener(this);
		att_bomb.addActionListener(this);
		att_laser.addActionListener(this);
		
		mattack.add(att_gun);
		mattack.add(att_bomb);
		mattack.add(att_laser);
		
		mmove = new JMenu("이동");
		
		move_for = new JMenuItem("전진");
		move_back = new JMenuItem("후진");
		
		move_for.addActionListener(this);
		move_back.addActionListener(this);
		
		mmove.add(move_for);
		mmove.add(move_back);
		
		mbar.add(mattack);
		mbar.add(mmove);
		
		
		Tf = new JTextField(20);
		add("South", Tf);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Menu3 m3 = new Menu3();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==att_gun) {
			Tf.setText("펑");
		}
		if(e.getSource()==att_bomb) {
			Tf.setText("펑");
		}
		if(e.getSource()==att_laser) {
			Tf.setText("떨 띠");
		}
		if(e.getSource()==move_for) {
			Tf.setText("전진");
		}
		if(e.getSource()==move_back) {
			Tf.setText("후진");
		}
		
	}

}
