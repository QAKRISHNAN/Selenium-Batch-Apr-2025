package Arrays;

import java.util.Scanner;

public class FloatArray_DoubleDimension {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		// Static Method   3*3=9 
		
		/*
		1.1[0 0]	2.2[0 1]	3.3[0 2]	
		4.4[1 0]	5.5[1 1]	6.6[1 2]
		7.7[2 0]	8.8[2 1]	9.9[2 2]
		*/
		/*
		 float a[][]= {{1.1f,2.2f,3.3f},{4.4f,5.5f,6.6f},{7.7f,8.8f,9.9f}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		*/
		
		//Dynamic Method
		/*
		float a[][]=new float[2][2];
		
		System.out.println("Enter any Float Array Elements: ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Given Float Array: ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		*/
		
		System.out.println("Enter Row Size: ");
		byte rsize=scan.nextByte();
		System.out.println("Enter Column Size: ");
		byte csize=scan.nextByte();
		
		float a[][]=new float[rsize][csize];
		
		System.out.println("Enter any Float Array Elements: ");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				a[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Given Float Array: ");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
