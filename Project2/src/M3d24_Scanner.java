import java.util.Scanner;

public class M3d24_Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("화면에 메시지를 입력해 주세요!");
		//사용자 입력코드
		String aa;
		aa = s.nextLine();
		
		int userInputNumber = s.nextInt();
		
		System.out.println("메시지?");
	
		
		System.out.println("당신이 입력한 숫자는 " + userInputNumber + " 그리고 "  + aa);
		
		
	}

}

