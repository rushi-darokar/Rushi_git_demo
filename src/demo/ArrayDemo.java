package demo;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		int rn = 15;   //Declaration with initialization
		int adharcard;  //Variable Declaration
		int rollNo[] = new int[100];   //This is a array declaration
		rollNo[0] = 101;
		rollNo[1] = 102;
		rollNo[2] = 103;
		rollNo[3] = 104; 		//This is manual array initialization
//		System.out.println(rollNo[2]);
//		System.out.println(rollNo[10]);
		
		int studrollNo[] = {101,102,103,104,105};   //Declaration with initialization
		System.out.println(studrollNo[2]);
//		System.out.println(studrollNo[10]);
		
		for(int i=0;i<studrollNo.length;i++)
		{
			System.out.println(studrollNo[i]);
		}
		
		String studName = "Jobito";
		System.out.println(studName.charAt(15));
		
		
	}

}
