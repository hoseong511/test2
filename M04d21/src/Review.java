import java.util.Scanner;

//1. 객체 데이터
//2. 생성자
//3. 오버라이드
//사람클래스(부모)
public class Review {
	int age;
	String name;
	Review(){
		this.name = "사람";
	}
	Review(String name){
		this.name = name;
	}
	Review(String name, int age){
		this.name = name;
		this.age = age;
		this.calcal();
		
	}
	public String toString() {
		return this.name + " (" + this.age + ")";
	}
	public void calcal() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		Review_son s;
		s = new Review_son("11",input);
		System.out.println(s.age);
		
	}
	
}
