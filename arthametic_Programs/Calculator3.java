package arthametic_Programs;

import Methods.Calculator1;

public class Calculator3 
{
public static void main(String[] args) 
{
	Calculator1 cal3=new Calculator1();
	cal3.Add();				//public
	cal3.Sub();				//private
	Calculator1.Mul();		//protected
	cal3.Div();				//default 
}
}
