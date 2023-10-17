class Weapon {
	public void Fire() {
		System.out.println("탕탕");
	}
}
class Bomb extends Weapon{
	public void Fire() {
		System.out.println("슈웅~펑");
	}
}
class Laser extends Weapon{
	public void Fire() {
		System.out.println("찌이~잉");
	}
}
public class OverrideEx1 {

	public static void main(String[] args) {
		Bomb b = new Bomb();
		Laser l = new Laser();
		b.Fire();
		l.Fire();
	}

}