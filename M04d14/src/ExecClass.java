import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("옵션?(삼각형 1, 사각형 2, 원 3)");
		int optNum = scan.nextInt();
		
		System.out.println("개수?");
		int num = scan.nextInt();
		
		Area[] result = new Area[num];
		if (optNum == 1) {			
			Triangle2[] a = new Triangle2[num];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("높이?");
				int height = scan.nextInt();
				System.out.println("밑변?");
				int width = scan.nextInt();
				a[i] = new Triangle2(width, height);
//				a1[i].printSize();
			result = a;
			}
						
		} else if (optNum == 2){
			
			Square2[] a = new Square2[num];
			for (int i = 0; i < a.length; i++) {
				System.out.println("높이?");
				int height = scan.nextInt();
				System.out.println("밑변?");
				int width = scan.nextInt();
				a[i] = new Square2(width, height);
//				a2[i].printSize();
			} result = a;
						
		} else if (optNum == 3){
			
			Round2[] a = new Round2[num];
			for (int i = 0; i < a.length; i++) {
				System.out.println("반지름?");
				int r = scan.nextInt();
				
				a[i] = new Round2(r);
				
//			a[0].printSize(a);
//			a[1].printSize(a);
			}result = a;
			
		}						
		for (int i = 0; i < result.length; i++) {
			System.out.println((i+1) + "등");
			result[i].printSize(result);
		}
		
		
		
		
		
	}
	

}
