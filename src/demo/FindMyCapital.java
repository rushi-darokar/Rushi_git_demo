
// ladder if....else

package demo;

public class FindMyCapital {
	
	public static void main(String[] args)
	{
		String stateName = "Maharashtra";
		
		if (stateName.equals("Maharashtra"))
		{
			System.out.println("Capital is Mumbai");
		}
		else if (stateName.equals("Telengana"))
		{
			System.out.println("Capital is Hyderabad");
		}
		else if (stateName.equals("Karnataka"))
		{
			System.out.println("Capital is Bengaluru");
		}
		else if (stateName.equals("Andhra Pradesh"))
		{
			System.out.println("Capital is Amrawati");
		}
		else if (stateName.equals("Tamilnadu"))
		{
			System.out.println("Capital is Chennai");
		}
		else
		{
			System.out.println("Please enter correct state name");
		}
			
		// Switch statement 
		
	   switch(stateName) 
	   {
	   
	   case "Maharashtra":
			System.out.println("Capital is Mumbai");
			break;
			
	   case "Telengana"	:
			System.out.println("Capital is Hyderabad");
			break;
			
	   case "Karnataka":
			System.out.println("Capital is Bengaluru");
			break;
			
	   case "Andhra Pradesh":
			System.out.println("Capital is Amrawati");
			break;
			
	   case "Tamilnadu"	:
			System.out.println("Capital is Chennai");
            break;
            
       default:
    	   System.out.println("Enter valid stateName");
		   
	   }
	   
	}

}


