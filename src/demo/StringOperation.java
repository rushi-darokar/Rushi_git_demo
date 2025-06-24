package demo;

public class StringOperation {
	
	public static void main(String[] args)
	{
		String mycountry = "india";
		String favcountry = "india";
		String countryname = "UK";
		
		System.out.println(mycountry.startsWith("i"));
		System.out.println(mycountry.startsWith("I"));
		
		System.out.println(mycountry.endsWith("a"));
		
		System.out.println(mycountry.contains("di"));
		
		System.out.println(mycountry.toUpperCase());
		System.out.println(mycountry.toLowerCase());
		
		System.out.println(mycountry.equals(favcountry));
		System.out.println(mycountry.equals(countryname));
		
		System.out.println(mycountry.length());
		System.out.println(countryname.replace('U', 'A'));
	}

}
