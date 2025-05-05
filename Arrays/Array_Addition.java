package Arrays;

import java.util.Scanner;

public class Array_Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Row & Column Size
		System.out.print("Enter Array Row & Column Size: \t");
		byte rsize = scan.nextByte();
		byte csize = scan.nextByte();

		int a[][] = new int[rsize][csize];
		int b[][] = new int[rsize][csize];
		int c[][] = new int[rsize][csize];

		// First Array Elements
		System.out.print("Enter First Array Elements: ");

		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				a[i][j] = scan.nextInt();
		}
		}
		// First Array Elements
		System.out.println("Enter Second Array Elements: ");

		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Addition of given Two Arrays: ");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}

		
	}

}
