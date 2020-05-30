import java.util.Scanner;

public class M3d27_Quiz1 {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("0부터 100까지 성적을 입력하세요");
		a = s.nextInt();		
		
		if (a >= 90) {
			System.out.println("당신의 학점은 A 입니다");
					
		} else if (a >= 80) {
			System.out.println("당신의 학점은 B 입니다");	
			
		} else if (a >=70) {
			System.out.println("당신의 학점은 C 입니다");
						
		} else if (a >= 60) {
			System.out.println("당신의 학점은 D 입니다");
			
		} else {
			System.out.println("당신의 학점은 E 입니다");
		}
			
	}

}
