package MethodOverRiding;

public class Test 
{
	public static void main(String[] args) {
		
		//Parent_TRAI ptrai=new Parent_TRAI();
		//ptrai.Network();
		
		JIO_Child1 jio=new JIO_Child1();
		jio.Network();
		
		AIRTEL_Child2 air=new AIRTEL_Child2();
		air.Network();
		
		BSNL_Child3 bsnl=new BSNL_Child3();
		bsnl.Network();
	}
	

}
