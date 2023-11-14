import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBoxEx extends JFrame{
	JLabel Lab1, Lab2;
	JComboBox Cb1, Cb2;
	String [] Meal = {"햄버거", "치킨", "감튀", "피자", "스파게티", "돈까스"};
	String [] Drink = {"콜라", "사이다", "커피", "생수", "쥬스"};
	public ComboBoxEx() {
		setTitle("콤보박스 예제");
		setLayout(new FlowLayout());
		Lab1 = new JLabel("식사 : ");
		Lab2 = new JLabel("음료 : ");
		Cb1 = new JComboBox(Meal);
		Cb2 = new JComboBox(Drink);
		add(Lab1); add(Cb1); add(Lab2); add(Cb2);
		setSize(300, 200);
		setVisible(true);
	}
		public static void main(String[] args) {
			ComboBoxEx obj = new ComboBoxEx();

	}

}