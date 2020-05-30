
public class Test {
	int num = 0;
	int[] arr = new int[5];
	public void show() {
		System.out.println("num: " + this.num);
		System.out.println("list: "+ this.arr[0]);
	}
	
	public void inc(int n) {
		this.num = this.num + n;
	}
	
	public void inc_list(int n) {
		this.arr[0]=n;
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.inc(2);
		t2.inc(3);
		
		t1.inc_list(1);
		t2.inc_list(5);
		t1.show();
		t2.show();
	}
			
}
