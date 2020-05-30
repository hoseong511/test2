import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Player[] group1 = new Player[3];
		Player[] group2 = new Player[3];
		
		group1[0] = new Hong();
		group1[1] = new Hong();
		group1[2] = new Hong();
		group2[0] = new Hong();
		group2[1] = new Hong();
		group2[2] = new Hong();
		
//		Scanner scanner = new Scanner(System.in);
//		for (int loop = 0; loop < 9999; loop++) {
//			System.out.println("턴 진행을 위해서 엔터를 입력해주세요.");
//			scanner.nextLine();
//			
//			System.out.println("그룹 1");
//			for (int i = 0; i < group1.length; i++) {
//				group1[i].underAttack();
//			}
//			boolean group1AllDie = true;
//			for (int i = 0; i < group1.length; i++) {
//				group1AllDie = group1AllDie && !group1[i].isLive;
////				if (group1[i].isLive == false) {
////					group1AllDie = false;
////				} else if (group1[i].isLive == false && group1AllDie == true) {
////					group1AllDie = true;
////				}
//				System.out.println(group1[i]);
//			}
//			if (group1AllDie) {
//				System.out.println("그룹1이 전멸했습니다.");
//				break;
//			}
//
//			System.out.println("그룹 2");
//			for (int i = 0; i < group2.length; i++) {
//				group2[i].underAttack();
//			}
//			boolean group2AllDie = true;
//			for (int i = 0; i < group2.length; i++) {
//				group2AllDie = group2AllDie && !group2[i].isLive;
//				System.out.println(group2[i]);
//			}
//			if (group2AllDie) {
//				System.out.println("그룹2이 전멸했습니다.");
//				break;
//			}
//		}
		
		
	}
}
