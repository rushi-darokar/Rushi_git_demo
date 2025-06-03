package GitDemo;

public class childClass extends inheritanceParent  {

	
	inheritanceParent  pp = new inheritanceParent();
	
	public static void main(String[] args) 
	{
        childClass cc = new childClass();           // Create an instance
        cc.get();     
        cc.set();
    }
	
}