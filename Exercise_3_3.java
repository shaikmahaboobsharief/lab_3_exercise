package lab_3;

import java.util.Scanner;

public class Exercise_3_3 {
	public static void main(String[] args) {
		alterString();
	}
	public static void alterString() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		char a;
		for(int i=0;i<str.length();i++) {
			a=str.charAt(i);
			if(a!='a'&&a!='e'&&a!='i'&&a!='o'&&a!='u'){
				if(a=='z') {
					a='b';	
				}
				else {
					a=(char)(a+1);
					System.out.print(a);
				}
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
		s.close();
	}

}
