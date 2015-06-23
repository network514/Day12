package data;

public class J06_Hotel extends J05_Realty{
	int vip;
	boolean rsv;
	
	public J06_Hotel(String name, int price, int vip, boolean rsv){
		super(name, price);
		this.vip = vip;
		this.rsv = rsv;
	}
	
	public String getData(){
		return super.getData() + ", vip룸 수 : " + vip + ", 예약여부 : " + getRsv();
	}
	
	public String getRsv(){
		return rsv ? "가능" : "불가능";
	}
}
