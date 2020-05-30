import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Player[] group1 = new Player[4];
		Player[] group2 = new Player[1];
		
		group1[0] = new GoGilDong();
		group1[1] = new HO3();
		group1[2] = new HO2();
		group1[3] = new Hong();
		group2[0] = new HO();
		
		
		GameManager gameManager = new GameManager(group1, group2);
		gameManager.play();
	}
}
