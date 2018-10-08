package org.opentutorials.javatutorilas.eclipse;

public class hellojava {

	public static void main(String[] args) {
		int a;
		a=1;
		System.out.println(a+1); // a라는 변수를 int형으로 설정하고 1을 대입 후 1을 더함
		
		a=2;
		System.out.println(a+1); //a 변수에 2를 대입하고 1을 더함
		
		double b;
		
		b=1.1;
		System.out.println(b+1.1);  //b라는 변수를 실수형 타입으로 생성
		
		String first = "coding";
		System.out.println(first+" "+"everybody");
		
		String one,two;
		
		one = "coding";
		two="good";
		System.out.println(one+" "+two);
	
		double val = 1234.123;
		val++;
		System.out.println(val);
		
	}
}
