package Inheritance;

public class SL_Child extends SL_Parent
{
	public void Child()
	{
		System.out.println("I am your Child");
	}
	
	public static void main(String[] args) {
		
		SL_Child slc=new SL_Child();
		slc.Father();
		slc.Child();
	}

}
