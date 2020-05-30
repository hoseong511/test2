import java.util.Scanner;
import java.util.Arrays;

public class M3d31_Quiz2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];            //4*4의 형식
		                                        //{(00,01,02,03),(10,11,12,13),(20,21,22,23),(30,31,32,33)}              
		Scanner s = new Scanner(System.in);     //입력받는 매소드 

		for (int i = 0; i < arr.length; i++) {       
			
			if (i < arr.length-1 ) {
				System.out.println((i+1) + "행 숫자 3개를 입력해주세요");
			}
			else {
				System.out.println("숫자 나열입니다");
			}
			// 행을 더해주는 변수 rawSum
			int rawSum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				if (j == arr[i].length - 1) {    //j가 3 즉 a[_][3] 일때 rawSum 값을 넣어줌
					arr[i][j] = rawSum;

				} else if (i == arr.length - 1) {//i가 3 즉 a[3][_] 일 때 a[_][3] 값을 넣어줌
					arr[i][j] = arr[j][i];
					rawSum = rawSum + arr[i][j];
				} else {                          //위에 조건이 아닌 경우 계속 입력 받음
					arr[i][j] = s.nextInt();
					rawSum = rawSum + arr[i][j];
				}
			} //
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {        // 4*4형식으로 출력
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
