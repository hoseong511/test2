
public class test3 {
	public static void main(String[] args) {
		// 이차원 배열 선언 및 초기화
		int[][] data = { { 10, 20, 30 }, { 40, 50, 60 }, { 40, 50, 60 } };

		for (int i = 0; i < data.length * data[0].length; i++) {
			int row = i / data[0].length; // 행
			int column = i % data[0].length; // 열
			System.out.print(data[row][column] + "\t");

			if (column == data[0].length - 1) {
				System.out.println();
			}
		}

	}
}
