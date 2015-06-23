package data;

public class J01_Student extends J01_People{
	int kor, eng, math;
	
	public J01_Student() {
		
		super(); // 자동으로 호출되는 수퍼클래스의 생성자
				 // 호출하지 않아도 자동으로 호출된다.
//		=> 상속을 받는 서브클래스의 생성자 안에 눈에 보이지 않는 형태로 숨겨져있다.
//		=> 다른 명령들보다 우선적으로 호출된다.
		
		System.out.println("난 Student 생성자");
		System.out.println("this" + this);
		
//		super(); // 에러
//		=> 상속관계에 있는 서브클래스 생성자는 무조건 수퍼클래스의 생성자를 
//		먼저 호출해야 하기 때문에 수퍼클래스를 호출하는 super() 키워드를
//		다른 명령들보다 밑에 입력하면 에러가 발생한다.
	}
}
