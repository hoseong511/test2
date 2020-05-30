//오늘의 수업은 interface하고 API(Application Programming Interface)

import java.util.Random;

public class Exec {
	public static void main(String[] args) {
		NewClass newClass = new NewClass();
		
		newClass.test();
		newClass.getName(1); // 오! javadoc한번 확인 해보기!
//		javaDoc을 확인해보기 -> Jre에 담겨져 있는 내용들을 불러옴
		System.out.println("hello");
		
		
		Random r = new Random();
		r.nextInt();
		
//		이제 String을 살펴봄 -> 
//		객체 사용하는 것과 동일함! 
//		즉, 빈도수가 높기 때문에 기본 데이터 처럼 사용하게끔 
//		자바에 내장됨!!
		String a = "abc";
		int b = 10;
		
//		원래는 이런 형태임!!! 그래서 String 색이 파란색인 이유!(JRE에 담겨짐)
		String b1 = new String("abc");
		b1.equals("bbbb");   // 메모리? 메모리에 저장되는 String의 a!!
		
//		메모리에 저장 될 때 사용되는 주소 -> 이 주소로 컴퓨터가 메모리에서 해당 주소의 자료를 불러옴
		
//		b1 == a; // 주소를 비교하는데 이용됨!
		
//		메모리 공간은 각각의 byte단위로 나눠진다고 볼때
//		1byte = 8bit니깐 2^8이지 
//		기본적으로 한 문자열(ex.a)에 할당되는 메모리량이 너무큼!! 즉, 화물용 엘리베이터에 사람 혼자 들어가 있는 꼴
//		같은 문자열이 반복적으로 사용될 경우를 대비해서 문자 하나에 주소를 부여하고
//		해당 문자열을 다시 이용할 경우 메모리에서 문자열이 저장된 위치(주소)로 가서 불러옴
		String c = "hello";
		String d = "hello2";
		String e = new String("hello");
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());
		
		c = c +"1"; // 주소값이 달라지는 것을 확인
		System.out.println(c);
		System.out.println(c.hashCode());
		
		c = c +"1"; // 주소값이 달라지는 것을 확인 -> 메모리를 많이 잡아 먹게됨.!!
		System.out.println(c);
		System.out.println(c.hashCode());
		
		StringBuffer c1 = new StringBuffer("hello"); // StringBuffer를 사용하면 메모리를 아낄 수 있다.
		System.out.println(c1.reverse());
		c = c1.toString();
		
		System.out.println(c);
		System.out.println("  ");
		System.out.println(c1);
		System.out.println(c1.hashCode());
		System.out.println("");
		c1 = c1.append("1");
		System.out.println(c1);
		System.out.println(c1.hashCode());
		
		
	}

}
