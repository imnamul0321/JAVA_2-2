import javax.swing.JFrame;

public class FrameEx2 extends JFrame {
	public FrameEx2() {
		setTitle("두 번째 윈도우");
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameEx2 f = new FrameEx2();
	}
}