package lab_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise_3_9 {
	public static void main(String[] args) {
		date();
	}
	public static void date() {
		Scanner dt=new Scanner(System.in);
		System.out.println("Enter the date in YYYY-MM-dd");
		String d=dt.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YY");
		Date d1=null;
		try {
			d1=sdf.parse(d); 
		} 
		catch (ParseException e) {
		  System.out.println("invalid format");
		  e.printStackTrace(); 
		}
		 
		Date now=new Date();
		String d2=sdf.format(now);
		Date e=null;
		try {
			e=sdf.parse(d2);
		} catch (ParseException e1) {
			System.out.println("system date was not proper");
			e1.printStackTrace();
		}
		System.out.println(d2);
		dt.close();
	}

}
