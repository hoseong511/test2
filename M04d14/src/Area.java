//	1. 도형 -> 한 가지 방식만 적용
//	2. 코드를 한 곳에 몰아 넣을 수 있음
//	3. 즉 Area라는 클래스 이름 하나로 배열을 활용가능
//	** 오늘의 정리
//	1. 객체데이터 -> ex.성적관리 등 여러 데이터를 담을 공간이 필요할 때
//	2. 상속 (다형성) -> 1. 사각형을 상속받은 원 2.Area를 상속받은 원, 사각형, 삼각형, ..
public class Area {
	int width;
	int height;
	int r;
	double size;
	String type;
	
	public Area() {
		
		this.type = "도형";
	}
	
	public void calcSize() {
		this.size = 0;
	}
	
	public void printSize(Area[] a1) {
		this.rank(a1);
		System.out.println(this.type);
		System.out.println("사이즈 : " + this.size);
	}
	public void rank(Area[] a1) {
		for (int i = a1.length-1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				if(a1[j].size< a1[j+1].size) {
					double tmp = a1[j+1].size;
					a1[j+1].size = a1[j].size; 
					a1[j].size = tmp;
				}
			}
		}
//		System.out.println(a1[0].size);
//		System.out.println(a1[1].size);
//		
	}
}


