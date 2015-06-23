package data;

public class J06_Apart extends J05_Realty{
	int floor;
	boolean parking;
	
	public J06_Apart(String name, int price, int floor, boolean parking){
		super(name, price);
		this.floor=floor;
		this.parking=parking;
	}
	
	public String getData(){
		return super.getData() + ", 층 수 :" + floor + ", 주차공간 : " + getParking();
	}
	
	String getParking(){
		return parking ? "있음" : "없음";
	}
}
