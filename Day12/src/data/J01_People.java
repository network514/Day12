package data;

public class J01_People {
	String name;
	int age;
	
	public J01_People() {
		System.out.println("난 People 생성자");
		System.out.println("this" + this);
	}
	
	public void setPeople(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getPeople(){
		return "이름 : " + name + "나이 : " + age;
	}
}
