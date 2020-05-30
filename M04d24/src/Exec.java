import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Player[] group1 = new Player[3];
		Player[] group2 = new Player[3];
		
		group1[0] = new Hong();
		group1[1] = new Hong();
		group1[2] = new Hong();
		group2[0] = new Hong();
		group2[1] = new Hong();
		group2[2] = new Hong();
		Scanner s = new Scanner(System.in);
		for (int j = 0; j < 100; j++) {
			System.out.println("턴 진행을 위해서 엔터를 눌러주세요");
			s.nextLine();
			
			for (int i = 0; i < group1.length; i++) {
				group1[i].underAttack();
				
			}
			
			for (int i = 0; i < group2.length; i++) {
				group2[i].underAttack();
			}
			
			boolean group1Alldie = false;
			for (int i = 0; i < group1.length; i++) {
				group1Alldie = group1Alldie && !group1[i].isLive;
	//			if (group1[i].isLive == false) {
	//				group1Alldie = false;
	//			} else if (group1[i].isLive == false && group1Alldie == true) {
	//				group1Alldie = true;
	//			}
			}
			if (group1Alldie) {
				System.out.println("그룹1이 전멸 했습니다.");
			}
			boolean group2Alldie = true;
			for (int i = 0; i < group2.length; i++) {
				group2Alldie = group2Alldie && !group1[i].isLive;
			}
			if (group1Alldie) {
				System.out.println("그룹2가 전멸 했습니다.");
			}
				
		}
		
		
	}

}
