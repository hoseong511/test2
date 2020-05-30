import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Player[] group1 = new Player[15];
		Player[] group2 = new Player[1];
		
		group1[0] = new Hansol();
		group1[1] = new Lim();
		group1[2] = new Hwang();
		group1[3] = new JuSinYi();
		group1[4] = new Kim();
		group1[5] = new KangByeongHyeon();
		group1[6] = new KimDongHwi();
		group1[7] = new KimHyeongJun();
		group1[8] = new KimMinseok();
		group1[9] = new Lim();
		group1[10] = new MyName();
		group1[11] = new OhSungHoon();
		group1[12] = new Parkjeonggeun();
		group1[13] = new SangHun();
		group1[14] = new Sangmin();
		
		
		group2[0] = new Songhoseong();
		
		
		GameManager gameManager = new GameManager(group1, group2);
		gameManager.play();
	}
}
