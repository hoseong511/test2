//Object를 상속받는 클래스들 -> 모든 클래스들의 조상!
//실행클래스
public class Review_1 {
	public static void main(String[] args) {
		Review r4;
//		Review r1 = new Review();
//		Review r2 = new Review("gkgk", 10);
		Review r3 = new Review("gkgk");
//		Review_son s1 = new Review_son_son("호호", 10);
//		Review_son s2 = new Review_son_son("a", 1);
		System.out.println();
//		선생님 클래스
		Review_son_son[] student = new Review_son_son[3];
//		r2.calcal();
		student[0] = new Review_son_son("gkgk", 10);
		student[1] = new Review_son_son("gkgk1", 10);
		student[2] = new Review_son_son("gkgk2", 10);
//		r4 = new Review_son("1",1);
//		System.out.println(r4.name);
		Review_son2 teacher = new Review_son2("dhkd", 10,"ghgh",student);
		
		
//		Object o1 = (Object)r1;
		
//		System.out.println(o1);
//		System.out.println(r1.toString());
//		System.out.println(r2);
		
	}

}
