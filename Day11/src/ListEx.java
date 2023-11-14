import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListEx extends JFrame{

	JLabel Lab; JList Lt; String [] Fruits = {"수박","사과","포도","딸기"};
	
	public ListEx() {
		setTitle("리스트 예제");
		setLayout(new FlowLayout());
		Lab = new JLabel("과일선택: ");
		Lt = new JList(Fruits);
		add(Lab);
		add(Lt);
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ListEx obj = new ListEx();
	}

}
