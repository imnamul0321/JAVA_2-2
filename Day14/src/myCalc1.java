import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myCalc1 extends JFrame implements ActionListener{
	JButton
	b01, b02, b03, b04, b05, b06, b07, b08, b09,
//   1   2     3    4     5   6    7   8    9  
	b10, b11, b12, b13, b14, b15, b16, b17;
//  0     .    +    -    *    /    C    =   
	JPanel p1;
	JLabel Lb;
	int num_st = 1; //num_st는 계산기 초기화면 모드(1)
	double d1, d2, d3;//계산에 사용할 숫자를 저장할 변수
	int op = 0; //op는 사칙연산을 구분하기 위한 변수
	public myCalc1() {
		setTitle("계산기"); setLayout(new BorderLayout());
		Lb = new JLabel("0", JLabel.RIGHT);
		Lb.setPreferredSize(new Dimension(30, 30)); 
		p1 = new JPanel();
		//버튼 생성
		//배치 참조
		// 2 3 4 5
		// 6 7 8 9
		// 0 1 . C
		// + - * /
		//    =
		b02 = new JButton("2");b03 = new JButton("3");b04 = new JButton("4");b05 = new JButton("5");
		b06 = new JButton("6");b07 = new JButton("7");b08 = new JButton("8");b09 = new JButton("9");
		b10 = new JButton("0");b01 = new JButton("1");b11 = new JButton(".");b16 = new JButton("C");
		b12 = new JButton("+");b13 = new JButton("-");b14 = new JButton("*");b15 = new JButton("/");	
		b17 = new JButton("=");
		//버튼 이벤트 연결
		b01.addActionListener(this);b02.addActionListener(this);b03.addActionListener(this);
		b04.addActionListener(this);b05.addActionListener(this);b06.addActionListener(this);
		b07.addActionListener(this);b08.addActionListener(this);b09.addActionListener(this);//버튼 누르면 e.getSource 부분에서 캐치해감
		b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
		b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);
		b16.addActionListener(this);b17.addActionListener(this);
		//그리드 레이아웃
		p1.setLayout(new GridLayout(4, 4));
		//패널 add
		p1.add(b02);p1.add(b03);p1.add(b04);p1.add(b05);p1.add(b06);p1.add(b07);p1.add(b08);p1.add(b09);p1.add(b10);p1.add(b01);
		p1.add(b11);p1.add(b16);p1.add(b12);p1.add(b13); p1.add(b14); p1.add(b15); 
		add("North",Lb); add("Center",p1); add("South",b17);
		setSize(200, 210); setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = Lb.getText();
			if(e.getSource()==b10) {if(num_st>0) { // 숫자키 '0'
				//아무런 입력이 없는 상태에서 '0' 입력이면 초기상태 유지
				num_st=1;
				Lb.setText("0");
			}else {
				Lb.setText(s+"0");
			}
		}		
		//1 ~ 9 , 0 , .
		if(e.getSource()==b01) {
			if(num_st>0) {//0이면 1 출력 아니면 +1
				num_st = 0; Lb.setText("1");
			}else {
				Lb.setText(s+"1");
			}
		}
		if(e.getSource()==b02) {
			if(num_st>0) { //0이면 2 출력 아니면 +2	
				num_st = 0; Lb.setText("2");
			}else { 			
				Lb.setText(s+"2");
			}
		}
		if(e.getSource()==b03) {
			if(num_st>0) { //0이면 3 출력 아니면 +3
				num_st = 0; Lb.setText("3");
			}else {
				Lb.setText(s+"3");
			}
		}
		if(e.getSource()==b04) {
			if(num_st>0) {  //0이면 4 출력 아니면 +4
				num_st = 0; Lb.setText("4");
			}else {
				Lb.setText(s+"4");
			}
		}
		if(e.getSource()==b05) {
			if(num_st>0) { //0이면 5 출력 아니면 +5
				num_st = 0; Lb.setText("5");
			}else {
				Lb.setText(s+"5");
			}
		}
		if(e.getSource()==b06) {
			if(num_st>0) { //0이면 6 출력 아니면 +6
				num_st = 0; Lb.setText("6");
			}else {
				Lb.setText(s+"6");
			}
		}
		if(e.getSource()==b07) {
			if(num_st>0) { //0이면 7 출력 아니면 +7
				num_st = 0; Lb.setText("7");
			}else {
				Lb.setText(s+"7");
			}
		}
		if(e.getSource()==b08) {
			if(num_st>0) { //0이면 8 출력 아니면 +8
				num_st = 0; Lb.setText("8");
			}else {
				Lb.setText(s+"8");
			}
		}
		if(e.getSource()==b09) {
			if(num_st>0) { //0이면 9 출력 아니면 +9
				num_st = 0; Lb.setText("9");
			}else {
				Lb.setText(s+"9");
			}
		}
		if(e.getSource()==b11) {
			if(num_st>0) { //0이면 0. 출력 아니면 .
				num_st = 0; Lb.setText("0.");
			}else {
				Lb.setText(s+".");
			}
		}
		
	//	b12, b13, b14, b15, b16, b17;
	//   +    -    *    /    C    =   
		if(e.getSource()==b16) {
			Lb.setText("0"); num_st = 1; op = 0;
		}
		if(e.getSource()==b12) {
			num_st = 1; op = 1; d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b13) {
			num_st = 1; op = 2; d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b14) {
			num_st = 1; op = 3; d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b15) {
			num_st = 1; op = 4; d1 = Double.parseDouble(Lb.getText());  
		}
		//d1에 전달
		//d1에 저장된 숫자와 상호작용 값을 위에 씀
		//d17 => = button
		if(e.getSource()==b17) { 
			num_st = 1; d2 = Double.parseDouble(Lb.getText());
			if(op == 1) {
				d3 = d1 + d2;
			}else if(op == 2) {
				d3 = d1 - d2;
			}else if(op == 3) {
				d3 = d1 * d2;
			}else if(op == 4) {
				d3 = d1 / d2;
			}
			Lb.setText(""+d3);
		}
		}
	public static void main(String[] args) {
		myCalc1 mc1 = new myCalc1();
	}

}