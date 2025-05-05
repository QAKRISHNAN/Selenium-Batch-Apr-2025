package Looping_Statements;

public class NestedLoops_Patterns {

	public static void main(String[] args) {

		/*
		1	2	3	4	5

		1	2	3	4	5

		1	2	3	4	5

		1	2	3	4	5

		1	2	3	4	5
		*/
		/*
		for(int i=1;i<=5;i++) //Rows
		{
			for(int j=1;j<=5;j++) //Columns
				
			{
				System.out.print(j+"   "); //25
				
			}
			
			System.out.println(); //5times
		}
		*/
		
		/*
		  Outer:
		  i=1;i<=5;1<=5;T 
		  Inner:
		  j=1;j<=5;1<=5;T 
 		  j++:j=2;2<=5;T 
 		  j++;j=3;3<=5;T
 		  j++;j=4;4<=5;T
 		  j++;j=5;5<=5;T
 		  j++;j=6;6<=5;F Exit 
 		  Outer:
 		  i++;i=2;2<=5;T
 		  Inner:
 		  j=1;j<=5;1<=5;T 
 		  j++:j=2;2<=5;T 
 		  j++;j=3;3<=5;T
 		  j++;j=4;4<=5;T
 		  j++;j=5;5<=5;T
 		  j++;j=6;6<=5;F Exit 
 		  Outer:
 		  i++;i=3;3<=5;T
 		  ----------------
 		  --------------
 		  i=6;6<=5;F Exit 
 		  
 		  Outer:5Times 6th F 
 		  Inner:23Times 26th F 
 		  
 		1	2	3	4	5	
 		1	2	3	4	5
 		1	2	3	4	5	
		1	2	3	4	5
		1	2	3	4	5
		 */
		/*
		1	1	1	1	1
		2	2	2	2	2
		3	3	3	3	3
		4	4	4	4	4
		5	5	5	5	5
		*/
		
		/*
		for(int i=1;i<=5;i++) //Rows
		{
			for(int j=1;j<=5;j++) //Columns
				
			{
				System.out.print(i+"   "); //25
				
			}
			
			System.out.println(); //5times
		}
		*/
		/*
		*	*	*	*
		*	*	*	*
		*	*	*	*
		*	*	*	*
		*	*	*	*
		*/
		/*
		for(int i=1;i<=5;i++) //Rows
		{
			for(int j=1;j<=4;j++) //Columns
				
			{
				System.out.print("  * "); //25
				
			}
			
			System.out.println(); //5times
		}
		*/
		
		/*
		5	5	5	5	5
		4	4	4	4	4
		3	3	3	3	3
		2	2	2	2	2
		1	1	1	1	1
		*/
		/*
		for(int i=5;i>=1;i--) //Rows
			//5>=1 4>=1 3>=1 2>=1 1>=1 0>=1F 
		{
			for(int j=1;j<=5;j++) //Columns
				//for(int j=5;j>=1;j--)
				//5>=1 4>=1 3>=1 2>=1 1>=1 0>=1F 
				
			{
				System.out.print(i+"   "); //25
				
			}
			
			System.out.println(); //5times
		}
		*/
		/*
		5	4	3	2	1
		5	4	3	2	1
		5	4	3	2	1
		5	4	3	2	1
		5	4	3	2	1
		*/
		/*
		for(int i=5;i>=1;i--) //Rows
			//6>=1 5>=1 4>=1 3>=1 2>=1 1>=1 0>=1F 
		{
			for(int j=5;j>=1;j--)
				//5>=1 4>=1 3>=1 2>=1 1>=1 0>=1F 
				
			{
				System.out.print(j+"   "); //25
				
			}
			
			System.out.println(); //5times
		}
		*/
		
		/*
		1
		1	2	3	4	5
		2
		1	2	3	4	5
		3
		1	2	3	4	5
		4
		1	2	3	4	5
		5
		1	2	3	4	5
		*/
	/*
		for(int i=1;i<=5;i++) //Rows
		{
			System.out.println(i+"   "); 
			
			for(int j=1;j<=10;j++)
						
			{				
				System.out.print(j+"   "); //1   
						
			}
			
			System.out.println(); //5times
		}
		*/
		
		//Print 5 Table 
		/*
		5	* 	1	=	5
		5	* 	2	=	10
		5	* 	3	=	15
		5	* 	4	=	20
		5	* 	5	=	25
		5	* 	6	=	30
		5	* 	7	=	35
		5	* 	8	=	40
		5	* 	9	=	45
		5	* 	10	=	50
		*/
		
		/*
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 * "+ i +" = "+(5*i));
			//System.out.println("6 * "+ i +" = "+(6*i));
			//System.out.println("19 * "+ i +" = "+(19*i));
		}
		*/
		
		//Print 1 to 10 Tables 
		
		for(int j=1;j<=10;j++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(j+" * "+ i +" = "+(j*i));
				
			}
			System.out.println();
		}
	}

}
