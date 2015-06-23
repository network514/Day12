package data;

public class J05_Hotel extends J05_Realty{
	
	int vipRoom;
	Boolean resvation;

	public J05_Hotel(String name, int price, int vipRoom, Boolean reservation) {
		super(name, price);
		
		this.vipRoom = vipRoom;
		this.resvation = resvation;
	}

	public String getHotelInfom(){
		return super.getData() + price + "원, vip 룸 수 : " + vipRoom + "층, 예약 필수 여부 " + resvation;
	}
	
}
