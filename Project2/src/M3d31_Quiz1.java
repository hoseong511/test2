import java.util.Arrays;
import java.util.Random;

public class M3d31_Quiz1 {
	public static void main(String[] args) {
		int[] arr = new int[30];
		Random r = new Random();
		
		for (int i =0; i < arr.length; i++) {
			arr[i] = r.nextInt(101);
		}
		System.out.println("정렬 전 " + Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("정렬! 오름차순 " + Arrays.toString(arr));
	}

}
