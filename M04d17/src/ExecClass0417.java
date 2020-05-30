
public class ExecClass0417 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.middleScore = 100;
		s1.finalScore = 80;
		
		System.out.println(s1);
		
		Teacher s2 = new Teacher();  // Teacher를 선언 -
		s2.name = "홍길순";            // name을 먼저 Teacher에서 찾음 -> 없으면  People에서 찾음
		s2.age = 8;
		s2.studyClass = "1학년 2반";
		System.out.println(s2); // Teacher에서 찾음
								// s2.toString() -> 원래 toString에 이런 기능이 포함되어이씀 
//		1. 변수(데이터) s2는 Teacher 타입으로 정의해서 사용
//		2. s2를 Object로 형변환 가능
		Object o1;
		o1 = (Object)s2;
		System.out.println(o1); //o1.toString()
		
		int a = 13;
		double b;
		b = (double)a; //-> 형변환! 같은 형태 (단, double에서 int로 변환하지 못하는 것과 같이 Object로 형변환하면 ??)
		int c =(int)b;
		
		
	}	

}
