package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}
	
	/*예상
	false
	false
	false
	true
	false
	true

	equals()메소드가 없는데 실행되는 이유:
	eauals는 기본으로 내제된 String 클래스에 포함되어 있기 때문이다.
	다른결과값을 주고 싶으면 오버라이딩 해서 재설정 해주면 된다.
	*/

}


