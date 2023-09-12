public class CalProxima {

	public static void main(String[] args) {
		//final은 뭘 정의하는 거죠? 상수
	final double light_speed = 30e4;
	double distance = 40e12;
	double secs;
	
	secs = distance/light_speed;
	double light_year = secs/(60.0*60.0*24.0*365.0);
	
	System.out.println(+light_year+"광년입니다");
	}

}
