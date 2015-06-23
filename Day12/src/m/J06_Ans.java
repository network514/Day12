package m;

import data.J06_Hotel;
import data.J06_Apart;

public class J06_Ans {
	public static void main(String[] args) {

		J06_Hotel hh = new J06_Hotel("신라호텔", 1520, 3, true);
		J06_Apart aa = new J06_Apart("자이아파트", 111, 2, false);
		
		System.out.println(hh.getData());
		System.out.println(aa.getData());
		
	}
}
