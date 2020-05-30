//1. 인적 사항을 담을 객체데이터
//2. 이름을 반환 할 메소드
public class People {
	String name;
	int age;
	int height;
	
	@Override // 어노테이션?? 
	public String toString() { //toString은 슈퍼클래스(Object)에 있는 메소드
		System.out.println("이름: " + this.name + ", 나이 : " + this.age);
		
		return this.name;   	// -> 오버라이드(재정의)를 함 -> @Override 표시
	}							// -> 사용안해도 무방
public int test() {
	int a = 10;
	
	return a;
}


}


