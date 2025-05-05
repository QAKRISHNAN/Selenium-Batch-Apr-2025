package Inheritance;

public class HL_Test 
{

	public static void main(String[] args) {
		
		HL_Child1 hlc1=new HL_Child1();
		
		hlc1.MohanBabu();
		hlc1.MohanBabuWife();
		hlc1.Vishnu();
		System.out.println();
		
		HL_Child2 hlc2=new HL_Child2();
		hlc2.MohanBabu();
		hlc2.MohanBabuWife();
		hlc2.Manoj();
		System.out.println();
		
		HL_Child3 hlc3=new HL_Child3();
		hlc3.MohanBabu();
		hlc3.MohanBabuWife();
		hlc3.Lakshmi();
	}
	
}
