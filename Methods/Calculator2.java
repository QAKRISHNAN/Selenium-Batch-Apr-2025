package Methods;

public class Calculator2 extends Calculator1
{
	public static void main(String[] args) 
	{
		Calculator1 cal1=new Calculator1();
		cal1.Add();
		cal1.Sub(); //is not visible
		Calculator1.Mul();
		cal1.Div();
		Calculator2 cal2=new Calculator2();
		cal2.Add();
		cal2.Mul();
		cal2.Div();
	}
}
