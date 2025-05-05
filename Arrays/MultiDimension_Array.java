package Arrays;

import java.util.Scanner;

public class MultiDimension_Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//First Array Row & Column Size
		System.out.println("Enter First Array Row & Column Size: ");
		byte frsize=scan.nextByte();
		byte fcsize=scan.nextByte();
					
		int a[][]=new int[frsize][fcsize];
		
				//First Array Elements
		System.out.println("Enter First Array Elements: ");
		
		for(int i=0;i<frsize;i++)
		{
			for(int j=0;j<fcsize;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		//Second Array Row & Column Size
		System.out.println("Enter Second Array Row & Column Size: ");
		byte srsize=scan.nextByte();
		byte scsize=scan.nextByte();
		int b[][]=new int[srsize][scsize];
		
		//Second Array Elements
		System.out.println("Enter Second Array Elements: ");
		
		for(int i=0;i<srsize;i++)
		{
			for(int j=0;j<scsize;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		//First Array Print 
		System.out.println("Given First Array: ");
		
		for(int i=0;i<frsize;i++)
		{
			for(int j=0;j<fcsize;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
				//Second Array Print 
		System.out.println("Given Second Array: ");
		
		for(int i=0;i<srsize;i++)
		{
			for(int j=0;j<scsize;j++)
			{
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
