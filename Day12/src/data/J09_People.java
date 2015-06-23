package data;

public class J09_People {
	String name;
	int age;
	int income;
	
	public void setData(String name, int age, int income){
		this.name = name;
		this.age = age;
		this.income = income;
	}
	
	public String getData(){
		return "이름 : " + name + ", " + "나이 : " + age + "연봉 : " + income;
	}
}
