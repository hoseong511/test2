import java.util.Random;

public class M3d27_if {
	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(100);
		
		System.out.println(a);
		if (a % 2 == 0) {
			System.out.println(a + "는(은) 짝수이다");
		} else {
			System.out.println(a + "는(은) 홀수이다");
		}
		System.out.println(a+ 3);
		
		
		

	}
}
