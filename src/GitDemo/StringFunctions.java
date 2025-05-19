package GitDemo;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "indian";
		String str1= "india";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.startsWith("i"));
		System.out.println(str.endsWith("a"));
		System.out.println(str.contains("d"));
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println(str.replace("i", "I"));
	}

}
