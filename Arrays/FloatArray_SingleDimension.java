package Arrays;

import java.util.Scanner;

public class FloatArray_SingleDimension {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Static Method	
		/*
				float htno[]= {101.1f,102.2f,103.3f,104.4f,105.5f};
				
				for(int i=0;i<5;i++) //0<5 5<5
				{
				System.out.println(htno[i]); //SR MC or MR SC
				//System.out.print(htno[i]+"  ");
				}
				*/
				//Memory Allocation
				//datatype arrayvariablename=new datatype[Size];
				
		
					float htno[]=new float[5]; //1*5=5
				
				System.out.println("Enter Arary Elements: ");
				for(int i=0;i<1;i++) //0<5 5<5
				{
					for(int j=0;j<5;j++) //0<5 5<5
					{
				htno[j]=scan.nextFloat();
				}
				}
				
				System.out.println("Given Array:");
				
				for(int i=0;i<1;i++) //0<5 5<5
				{
					for(int j=0;j<5;j++) //0<5 5<5
					{
						//System.out.print(htno[j]+"  ");
						System.out.println(htno[j]);
				}
				}
				
			

	}

}
