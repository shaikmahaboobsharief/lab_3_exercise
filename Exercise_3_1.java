package lab_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_3_1 {
	public static void main(String[] args) {
		integers();
	}
	public static void integers() {
		Scanner num=new Scanner(System.in);
		System.out.print("enter the number with space: ");
		String n=num.nextLine();
		StringTokenizer s=new StringTokenizer(n);
		int b;
		int sum=0;
		while(s.hasMoreTokens()) {
			String a=s.nextToken();
			b=Integer.parseInt(a);
			System.out.println(b);
			sum=sum+b;
		}
		System.out.println("sum of the integers: "+sum);
		num.close();
	}

}
