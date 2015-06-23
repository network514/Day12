package data;

public class J10_baseballPlayer extends J09_People{
	String position;
	
	/*public J10_baseballPlayer(String name, int age, int income, String position) {
		super.setData(name, age, income);
		this.position = position;
	}*/

	public void setData(String name, int age, int income, String position) {
		super.setData(name, age, income);
		this.position = position;
	}
	
	public String getData(){
		return super.getData() + "포지션 : " + position;
	}
	

}
