package lab_3;

import java.util.Scanner;

public class Exercise_3_4 {
	public static void main(String[] args) {
		modifyNumber();
	}
	public static void modifyNumber() {
		Scanner num= new Scanner(System.in);
		System.out.print("enter the number:");
		int n=num.nextInt();
		String s=Integer.toString(n);
		int a=s.length();
		int b,c;
		for(int i=0;i<a-1;i++) {
				if(s.charAt(i)<s.charAt(i+1)) {
					b=((s.charAt(i+1))-(s.charAt(i)));
					System.out.print(b);
				}
				else if(s.charAt(i)>s.charAt(i+1)) {
					c=((s.charAt(i))-(s.charAt(i+1)));
					System.out.print(c);
				}
		}
		if(a%2!=0)
			System.out.println(s.charAt(a-1));
		num.close();
	}
}
