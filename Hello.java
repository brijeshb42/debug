package com.pack;

public class Hello {
	
	private static final int FIRST_MAX = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {FIRST_MAX, 2, 3, 4};
		//String s = null;
		printAllMarks(marks, 0);
		//printStr(s);
		//printEnv();
	}
	
	/*private static void printEnv() {
		// TODO Auto-generated method stub
		String os = System.getenv("OS");
		if(os!=null){
			System.out.println(os);
		}
	}*/

	/*private static void printStr(String s) {
		// TODO Auto-generated method stub
		if(s == null){
			throw new NullPointerException("String is null");
		}
	}*/

	private static void printAllMarks(int[] marks, int count){
		for(int mark: marks){
			System.out.println(mark);
		}
	}

}
