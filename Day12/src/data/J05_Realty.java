package data;

public class J05_Realty{
//	부동산 정보 클래스
	String name;
	int price;
	
	public J05_Realty(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void setData(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getData(){
		return "이름 : " + name + "," + "가격 : " + price;
				}
}
