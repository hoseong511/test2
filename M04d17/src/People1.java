
public class People1 {
	String name;
	int age;
	int count = 0;
	
	
	People1(){
		
	}
	People1(String name, int age){
		this.name = name;
		this.age =age;
		
	}
			
	@Override
	public String toString() {
		return this.name + "의 나이 : " + this.age;
	}
	
		
	

}
