import java.util.Scanner;

class Pat{
	public String race; //애완동물의 종류
	public String name; //애완동물 이름
	public int age; //나이
	public int power; //파워
	public int energy; //에너지
	int count = 0;
	public Pat() {  //부모 클래스 
		System.out.println("시작");
	}
	public void eat() { //기본값 부모의 기능 정리
		energy += 15;	//먹기 에너지 +15 카운트 +1
		count++;
		aging();
	}
	public void sleep() { // 잠자기 에너지 +5 카운트 +1
		energy += 5;
		count++;
		aging();
	}
	public void exercise() { //운동 에너지 -10 파워 +10 나이 안먹음 
		energy -= 10;
		power += 10;
	}
	public void aging() { //카운트 3번마다 나이+1먹고 카운트 0으로 초기화
		 if(count>3) {
			 age++;
			 count = 0;
		 }
	}
	public void attack() { //공격 에너지 -15 파워 +20
		energy -= 15;
		power += 20;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}
class Dog extends Pat{ //부모로부터 상속받은 Dog 클래스
	public int count;
	public Dog(String name) {
		this.name = name;
		race = "강아지";
		age = 0;
		power = 200;
		energy = 300;
		count = 0;
		System.out.println("강아지("+name+")가 만들어졌습니다.");
	}
	public void eat() {   // 기능이 오버라이딩되어 부모를 대체함
		energy += 15;
		count++;
		aging();
	}
	public void sleep() {
		energy += 5;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 20;
		power += 20;
	}
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}
class Cat extends Pat{ // 기능을 그대로 가짐 인수만 바뀐다
	public int count;
	public Cat(String name) {
		this.name = name;
		race = "고양이";
		age = 0;
		power = 100;
		energy = 200;
		count = 0;
		System.out.println("고양이("+name+")가 만들어졌습니다.");
	}
}
class Rabbit extends Pat{ // 부모와 비교해 기능을 바꾸고 인수도 바뀐다
	public int count;
	public Rabbit(String name) {
		this.name = name;
		race = "토끼";
		age = 0;
		power = 200;
		energy = 300;
		count = 0;
		System.out.println("토끼("+name+")가 만들어졌습니다.");
	}
	public void eat() {
		energy += 5;
		count++;
		aging();
	}
	public void sleep() {
		energy += 3;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 3;
		power += 7;
	}
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	public void attack() {
		energy -= 10;
		power += 10;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}

public class PatGrow {
	public static void main(String[] args) { // 목적 수행을 위한 콘솔 창
		Scanner sc = new Scanner(System.in);
		Pat p = null;
		System.out.println("애완동물을 선택.");
		System.out.print("1. 강아지, 2. 고양이, 3. 토끼");
		int x = sc.nextInt();
		System.out.println("애완동물의 이름 입력:"); //이름을 입력하고
		String name = sc.next();
		if(x==1) {
			p = new Dog(name);
		}else if(x==2) {
			p = new Cat(name);
		}else if(x==3) {
			p = new Rabbit(name);
		}
		boolean flag = true;
		while(flag) {
			System.out.println("메뉴");
			System.out.println("1. 밥먹기 2. 잠자기 3. 운동하기 4. 공격 5. 끝"); // 번호를 눌러서 기능 선택
			x = sc.nextInt();
			switch (x) { //기능 선택
			case 1:
				p.eat();
				p.print();
				break;
			case 2:
				p.sleep();
				p.print();
				break;
			case 3:
				p.exercise();
				p.print();
				if(p.energy<=0) {
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 4:
				p.attack();
				p.print();
				if(p.energy <=0) {
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 5:
				flag = false; // while문을 끝냄
			}
		}
	}
}