import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해 주세요! ");
		Scanner s = new Scanner(System.in);
		int userNumber1 = s.nextInt();
		
		int sum = userNumber1 + 10;
		int diff = userNumber1 - 5;
		int mul = userNumber1 * 2;
		double div = (double)userNumber1 / 2;
		int mod = userNumber1 % 3;
		
		
		int a = userNumber1 % 100;
		System.out.println("10" + (10 + a));
				
		System.out.println("당신이 입력한 숫자는 " + userNumber1);
		System.out.println("+10을 한 결과 "+ sum+10);
		System.out.println("-5를 한 결과 " + diff);
		System.out.println("*2를 한 결과 " + mul);
		System.out.println("/2를 한 결과 " + div);
		System.out.println("%3을 한 결과 " + mod);
	}

}
