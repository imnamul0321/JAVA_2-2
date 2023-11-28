import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyButton extends JButton{
	static int count = 0;
	int index;
	public MyButton(String s) {
		super(s);
		index = count ++;
	}
}


public class Puzzle extends JFrame implements ActionListener{
	
	MyButton[] buttons; MyButton reset;
	
	public Puzzle() {
		super("Puzzle"); //setTitle("Puzzle");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 2, 2));
		buttons = new MyButton[9];
		for(int i=0; i<8; i++) {
			buttons[i] = new MyButton(" "+(i+1));
		}
		buttons[8]= new MyButton(" ");
		for(int i=0; i<9; i++) {
			panel.add(buttons[i]);
		}
		for(int i=0; i<9; i++) {
			buttons[i].addActionListener(this);
		}
		add(panel, BorderLayout.CENTER);
		reset = new MyButton("reset");
		reset.setBackground(Color.red);
		reset.setForeground(Color.yellow);
		add(reset, BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Puzzle p = new Puzzle();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}
	

}
