
public class M3d24_javaDataType {
	public static void main(String[] args) {
		int a;
		double b = 3.14;
		double b1 = 3.89;
		char c = 'A';
		boolean d = true;
		String e = "Hello asdfasf";
		a = 3;
				
//		int num = a + b;             // 변환형의 차이?
		int num1 = (int)(a + b);
		int num2 = a + (int)b;
		int num2_1 = (int)(b+b1);
		int num2_2 = (int)b + (int)b1;   //num2_1하고 num2_2의 차이
		double num3 = a + b;
		
		System.out.println( num1 +" " + num2 + " "+ num2_1 + " "+ num2_2 + " "+num3);
		
		
		System.out.println(a++);  // 먼저 찍히고 나중에 증가하는 것
		System.out.println(a);    
		
		System.out.println(++a);  // 먼저 증가하고 찍힘
		System.out.println(a);
		
		
		byte yy = (byte)128;
		System.out.println(yy);  //byte(-128 ~ 127)의 표현 범위를 벗어남
		
		short z1 = (short)32768;
		System.out.println(z1); //short(-32768~32767)의 표현 범위를 벗어남
	}

}

