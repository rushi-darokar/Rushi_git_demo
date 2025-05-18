package GitDemo;

public class StringOperation {

	public static void main(String[] args) {
		
	     String CityName = "pune";
		 String FevCity  ="pune";
		 String LoveCity= "pune";
		 
		 String PopularCity="mumbai";
		 String CapitalName="mumbai";
		 
		 String CountryName="India";
		 String fevCountry ="India";
		 String loveCountry="India";
		 
		 String MyAddress=new String ("pune");
		 String City = new String("pune");
		 
		 System.out.println(CityName== CountryName);
		 System.out.println(PopularCity==loveCountry);
		 System.out.println(CityName==LoveCity);
		 System.out.println(loveCountry==MyAddress);
		 System.out.println(City==CityName);
		 System.out.println(FevCity==fevCountry);
		 System.out.println(CapitalName==City); 
		 
		 System.out.println(CityName.equals(MyAddress));
		 System.out.println(CountryName.equals(PopularCity));
		 System.out.println(CityName.equals(LoveCity));
		 System.out.println(FevCity.equals(fevCountry));
	} 
}

