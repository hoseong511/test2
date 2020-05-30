import java.util.Arrays;
import java.util.Scanner;

public class M3d31_arr {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		int sum2 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("배열의 크기를 정해주세요! ");      //배열의 크기 정하는 숫자입력
		int selecNum = s.nextInt();                     // 입력창
		int[] arr2 = new int[selecNum];
	
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("원하는 숫자를 입력해주세요! ");
			int inputNum = s.nextInt();
			arr2[i] = inputNum;           // arr2[i] = s.nextInt(); 바로 사용가능
			sum2 = sum2 + arr2[i];
		}
		System.out.println(Arrays.toString(arr2) + " " + sum2);
		for (int value: arr2) {
			System.out.println(value);
		}
		
	}

}
