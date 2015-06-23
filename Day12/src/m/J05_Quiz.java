package m;

import data.*;

public class J05_Quiz {
	public static void main(String[] args) {
//		Realty 클래스를 확장하여 다음의 두 정보를 처리할 수 있는 각각의 
//		클래스를 정의한 후 데이터를 저장, 출력하세요.
		
//		호텔정보
//		- 이름 : 신라호텔
//		- 매매가 200원
//		- vip 룸 수 : 10개
//		- 예약 필수 여부 : 필수
		
		J05_Hotel hotel = new J05_Hotel("신라호텔", 200, 10, true);
		System.out.println(hotel.getHotelInfom());
		
//		아파트정보
//		- 이름 : 자이아파트
//		- 매매가 : 100원
//		- 층 수 : 20층
//		- 주차 공간 여부 : 있음

		J05_Apartment apartment = new J05_Apartment("자이아파트", 100, 20, true);
		System.out.println(apartment.getApartInfom());
	}
}
