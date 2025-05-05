package Interface;

interface Parent //Interface Class-- Parent
{
	public void Develop();
}

public class Child implements Parent//Normal Class-- Child 
{

	public void Develop()
	{
		System.out.println("How to Develop Bike");
	}
	
	public static void main(String[] args) 
	{
		
		Child ch=new Child();
		ch.Develop();
	}
	
}
