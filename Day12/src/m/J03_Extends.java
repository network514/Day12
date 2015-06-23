package m;

import data.*;

public class J03_Extends {
	public static void main(String[] args) {
		J03_SubCla sb = new J03_SubCla();
		sb.setData("둘리", 12);
		sb.setData("도우너", 13, 12.34, "놀기");
//		=> 메소드 오버로딩을 통해 서브클래스는 수퍼클래스의 메소드를 이용할 수 있다.
		
		System.out.println(sb.getData());
//		=> 수퍼클래스가 가지고 있는 메소드 형태를 그대로 재정의한 서브클래스의 메소드가 호출되었다.
//		=> 메소드가 오버라이드 됨.
	}
}
