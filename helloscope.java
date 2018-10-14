package org.opentutorials.javatutorilas.eclipse;
/*
public class helloscope {
		static int i;
		static void a() {
		int i=0;
		}
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
	}
}
*/
class calculator1{
	int left,right;
	public calculator1() {}
	public void setoperand(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
}
class subeach extends calculator1{
	public subeach(int left,int right) {
		this.left=left;
		this.right=right;
	}

	public void sub() {
			System.out.println(this.left-this.right);
	}
}
public class helloscope {
	
	public static void main(String[] args) {
		calculator1 calc = new calculator1();
		subeach calc1 = new subeach(30,20);
		//calc1.setoperand(10,20);
		calc1.sum();
		calc1.sub();
	}

}