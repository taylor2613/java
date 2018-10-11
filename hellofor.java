package org.opentutorials.javatutorilas.eclipse;

public class hellofor {
	public static String numbering(int init,int end) {
		int i=init;
		String output="";
		while(i<end) {
			output += i;
			i++;
		}
		//return 
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=0;i<10;i++) {
			if(i==5)
				break;
			System.out.println("hello");
		}
		*/
		/*
		String[] classGroup = new String[4];
		classGroup[0]="a";
		System.out.println(classGroup.length);
		*/
		/*
		String classGroup[] = {"a","b","c"};
		for(int i=0;i<classGroup.length;i++) {
			System.out.println(classGroup[i] + "학생과 면담");
		}
		*/
		String result = numbering(1,5);
		System.out.println(result);
	}

}
