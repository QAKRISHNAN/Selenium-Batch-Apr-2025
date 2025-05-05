package DataType_Variables;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

System.out.println("Enter any Two Values:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
			
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(20+10);
		System.out.println(20-10);
		System.out.println(20*10);
		System.out.println(20/10);
	}

}
