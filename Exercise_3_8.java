package lab_3;

import java.util.Scanner;

public class Exercise_3_8 {
	public static void main(String[] args) {
		positiveString();	
	}
	public static void positiveString() {
		Scanner str=new Scanner(System.in);
		System.out.print("Enter the String to check:");
		String s=str.next();
		int a=s.length();
		System.out.println(a);
		for(int i=0;i<a-1;i++) {
			if(s.charAt(i)<s.charAt(i+1)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}		
		}
		str.close();
	}

}
