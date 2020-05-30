import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Student1[] student = new Student1[3];
		Snack[] snack = new Snack[3];
		
		student[0] = new Student1("a",1,10,10,10);
		student[1] = new Student1("b",1,10,10,10);
		student[2] = new Student1("c",1,10,10,10);
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < student.length; i++) {
			snack[i] = new Snack(student[i].name);
		}
		for (int i = 0; i < 100; i++) {
			scan.nextLine();
			System.out.println("학생이름?");
		String name = scan.nextLine();
		if (name.equals("0")) {
			break;
		}
		int index = 0;
		for (int k = 0; k < student.length; k++) {
			if (name.equals(student[k].name)) {
				index = index + k;
				break;
			}
		}
		System.out.println("판매액?");
		int price = scan.nextInt();		
//		snack[index] = new Snack(snack[index].name,price);
		snack[index].sellOut = snack[index].sellOut + price;
		System.out.println(snack[index]);
		System.out.println("종료 시 0을 눌러주세요");
		}
		for (int i = 0; i < snack.length; i++) {
			System.out.println(snack[i].name+" "+snack[i].sellOut);
		}		
	}

}
