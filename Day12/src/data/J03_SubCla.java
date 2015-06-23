package data;

public class J03_SubCla extends J03_SuperCla{
	double height;
	String hobby;
	
	public void setData(String name, int age, double height, String hobby){
		setData(name, age);
		this.height = height;
		this.hobby = hobby;
	}
//	=> 서브클래스는 수퍼클래스가 가진 메소드에 대하여 매개변수의 형태에 따라 
//	메소드 오버로딩을 이용할 수 있다.
	
	public String getData(){
		return super.getData() + ", 키 : " + height + ", 취미 : " + hobby;
//		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 취미 : " + hobby;
	}
//	=> 수퍼클래스가 가지고 있는 기능을 수정하고자 하는 경우, 수퍼클래스의 메소드를 그대로 명시하고,
//	기능을 재정의 할 수 있는데, 이를 메소드 오버라이드(override)라고 한다.
//	=> 메소드를 오버라이드 한 경우, 레퍼런스를 통해 호출되는 메소드는 기본적으로 오버라이드 된 메소드이다.
}
