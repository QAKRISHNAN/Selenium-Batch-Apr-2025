package Interface;

interface Parent1
{
	public void Father1();
}
interface Parent2
{
	public void Father2();
}
interface Parent3
{
	public void Father3();
}
	public class MPI_Child  implements Parent1,Parent2,Parent3
	{
	public void Father1()
	{
		System.out.println("Father-1");
	}
	public void Father2()
	{
		System.out.println("Father-2");
	}
	public void Father3()
	{
		System.out.println("Father-3");
	}
	
	public void Child()
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) 
	{
		
		MPI_Child mpic=new MPI_Child();
		mpic.Father1();
		mpic.Father2();
		mpic.Father3();
		mpic.Child();
		
		
	}
}
