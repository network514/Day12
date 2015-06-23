package data;

public class J05_Apartment extends J05_Realty{
	
	int floor;
	Boolean parking;

	public J05_Apartment(String name, int price, int floor, Boolean parking) {
		super(name, price);
		
		this.floor = floor;
		this.parking = parking;
	}
	
	public void setApartInfom(int floor, Boolean parking) {
		this.floor = floor;
		this.parking = parking;
	}
	
	public String getApartInfom(){
		return super.getData() + price + "원, 층 수 : " + floor + "층, 주차 공간 여부 " + parking;
	}

}
