package data;

import data_ex.J04_SuperCla;

public class J04_SubCla extends J04_SuperCla {
	public void subMth(){
//		System.out.println(dMsg); // 에러
//		=> 디폴트 변수이지만, 다른 패키지에 위치하기 때문에 접근 불가능하다.
		System.out.println(pMsg);
//		=> 다른 패키지이지만, protected로 선언되었으므로 접근 가능하다.
	}
}
