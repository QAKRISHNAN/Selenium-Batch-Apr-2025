package AbstractMethods;

 abstract public  class Parent_RBI 
{
	 abstract public void Loan_Interst();
	
	public void Savings()
	{
		System.out.println("RBI Savings Intrest Rate 5.0%");
		System.out.println();
	}
	
	public void Develop()
	{
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Parent_RBI rbi=new Parent_RBI();
		rbi.Savings();
	}

}
