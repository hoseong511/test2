import java.util.Random;
import java.util.Scanner;

public class GameManager {
	Player[] group1;
	Player[] group2;
	
	GameManager(Player[] group1, Player[] group2) {
		this.group1 = group1;
		this.group2 = group2;
	}
	
	public void attackType1() {
		Random random = new Random(); // 랜덤 클래스 적용
		for (int i = 0; i < this.group1.length; i++) {
			if (this.group1[i].isLive) {
				int targetIndex = random.nextInt(this.group2.length);
				System.out.println(this.group1[i].name +"(" + i + ") "+ "이(가) " + this.group2[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
				this.group2[targetIndex].underAttack(this.group1[i]);
			}
		}
	}

	public void attackType2() {
		Random random = new Random();
		for (int i = 0; i < this.group2.length; i++) {
			if (this.group2[i].isLive) {
				int targetIndex = random.nextInt(this.group1.length);
				System.out.println(this.group2[i].name +"(" + i + ") "+  "이(가) " + this.group1[targetIndex] + "(" + targetIndex + ")" + "를(을) 공격했습니다.");
				this.group1[targetIndex].underAttack(this.group2[i]);
			}
		}
	}
	
	public boolean checkAllDieType1() {
		boolean checkAllDie = true;
		for (int i = 0; i < group1.length; i++) {
			checkAllDie = checkAllDie && !group1[i].isLive;
			System.out.println(group1[i]);
		}
		return checkAllDie;
	}

	public boolean checkAllDieType2() { // 0. t&t = t 1. t&t = t 2. t&t = t 
		boolean checkAllDie = true;		// 0. t&f = f 1. f&f = f 2. f&f =f 
		for (int i = 0; i < group2.length; i++) {
			checkAllDie = checkAllDie && !group2[i].isLive;
			System.out.println(group2[i]);
		}
		return checkAllDie;
	}
	
	public void play() {
		Scanner scanner = new Scanner(System.in); // 입력 받고자 하는 것
		for (int i = 0; i < 99999; i++) {  // 반복문
			System.out.println("턴 진행을 위해서 엔터를 입력해주세요."); // scan값 
			scanner.nextLine();

			System.out.println("그룹 1 상태");
			this.attackType1();
			if (checkAllDieType2()) {
				System.out.println("그룹 1이 승리했습니다.");
				break;
			}
			System.out.println("그룹 2 상태");
			this.attackType2();
			if (checkAllDieType1()) {
				System.out.println("그룹 2가 승리했습니다.");
				break;
			}
		}
	}
}
