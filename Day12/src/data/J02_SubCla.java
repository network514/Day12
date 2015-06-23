package data;

public class J02_SubCla extends J02_SuperCla{

	public J02_SubCla(String name, int age){
		super(name, age);
//		=> 상속 관계에 있는 수퍼클래스의 생성자가 값을 반드시 입력받아야만 하는
//		상황이므로, 서브클래스의 생성자가 수퍼클래스의 생성자를 호출하여 값을 
//		전달해야 한다.
	}
}
