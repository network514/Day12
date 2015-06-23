package data;

public class J10_soccerPlayer extends J09_People{
	double height;
	int score;

	/*public J10_soccerPlayer(String name, int age, int income, double height, int score) {
		super.setData(name, age, income);
		this.height = height;
		this.score = score;
	}*/
	
	public void setData(String name, int age, int income, double height, int score) {
		super.setData(name, age, income);
		this.height = height;
		this.score = score;
	}

	public String getData(){
		return super.getData() + "키 : " + height + ", " + "골득점 : " + score;
	}
}
