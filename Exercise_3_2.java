package lab_3;

import java.util.Scanner;

public class Exercise_3_2 {
	public static void main(String[] args) {
		getImage();
	}
	public static void getImage() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string to print mirror:");
		String str=s.next();
		int a=str.length();
		System.out.print(str+"|");
		a=a-1;
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(a));
			a=a-1;
		}
		s.close();
	}
}
