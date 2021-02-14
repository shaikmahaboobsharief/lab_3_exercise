package lab_3;



public class Exercise_3_5 {
	public static void main(String[] args) {
		display("considered a positivestring\ni am ok with\n this it\n");
		System.out.println("considered a positivestring\ni am ok with\n this it\n");
	}
	public static void display(String p) {
		String str[]=p.split(" ");
		int s=p.split("[\n|\r]").length;
		System.out.println("Number of lines in a text are: "+s);
		System.out.println("Number of character in a paragraph are: "+p.length());
		System.out.println("The number of words in text: "+str.length);
		
	}

}
