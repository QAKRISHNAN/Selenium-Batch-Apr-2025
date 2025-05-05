package Jumping_Statements;

public class Break_Continue {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) //1<=5 2<=5 3<=5 4<=5 5<=5
		{
			//if(i==4) //1==4 2==4 3==4 4==4 5==4 
			//if(i<=4) //1<=4
			if(i>=4)
			{
				break;
				//continue;
			}
			
			System.out.println(i); //1 2 3 
			
		}
		
		
		
		
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		//break;
		//continue;
		System.out.println(4);
		System.out.println(5);
		//break cannot be used outside of a loop or a switch
		//continue cannot be used outside of a loop
		*/
	}

}
