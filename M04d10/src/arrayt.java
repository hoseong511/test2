import java.util.Arrays;
import java.util.Scanner;

public class arrayt {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if (n == -1) {
				break;			
			}
			arr[i] = n;
			
//			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
