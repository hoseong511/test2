import java.util.Random;
import java.util.Scanner;

public class M3d27_Quiz3 {
	public static void main(String[] args) {

		System.out.println("가위(0) 바위(1) 보(2)?");
		Scanner s = new Scanner(System.in);
		int sissor = 0;
		int	rock = 1; 
		int	paper = 2;
		
		int youRSP = s.nextInt();		
		
		if (youRSP >= 3) {                                                 // 오류 다시
			System.out.println("잘못 눌렀습니다 다시 가위(0) 바위(1) 보(2) ?");
			youRSP = s.nextInt();
			
		}
		Random r = new Random();
		int computerRSP = r.nextInt(3);
		
		System.out.println(computerRSP);

		if ((youRSP == sissor && computerRSP == paper) 
				|| (youRSP == rock && computerRSP == sissor) 
				|| (youRSP == paper && computerRSP == rock)) {
			System.out.println("You Win");
		} else if (youRSP == computerRSP) {
			System.out.println("DraW");
			
		} else {
			System.out.println("You Lose");
		}
		
		if ((youRSP + 1 ) % 3 == computerRSP){
			System.out.println("컴퓨터 win");
		}else if (youRSP == (computerRSP+1) % 3) {
			System.out.println("사용자  win");
		}else {
			System.out.println("draw");
		}
		
	}

}
