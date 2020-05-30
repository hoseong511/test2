
public class M3d27_forQ {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {

			sum = sum + (i+1);
			System.out.println(i);
		}
		System.out.println("1~100까지의 합은 " + sum);

		int odd = 0;
		int even = 0;
		for (int i = 0; i < 100; i++) {
			if ((i+1) % 2 == 0) {
				even = even + (i+1);
				continue;			
			}
			odd = odd + i+1;

		}
		System.out.println("짝수들의 합은 " + even + "홀수들의 합은 "+ odd);
	}

}
