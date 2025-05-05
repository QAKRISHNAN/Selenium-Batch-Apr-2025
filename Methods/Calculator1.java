package Methods;

public class Calculator1 
{
	// Accessspecifier ReturnType MethodName(Paremeters_List)

	// Method-1
	// Public:Non-Static:WithOutReturnType:WithOutParemeters

	public void Add() {
		// Body;
		int a = 200, b = 100, c;
		c = a + b;
		System.out.println("Addition: " + c);
	}

	// Method-2
	// Public:static:WithOutReturnType:WithOutParemeters
	private static void Sub() {
		// Body;
		int a = 20, b = 10, c;
		c = a - b;
		System.out.println("Substraction: " + c);
		
	}
	// Method-3
	// Public:static:WithOutReturnType:WithOutParemeters
	protected static void Mul() {
		// Body;
		int a = 20, b = 10, c;
		c = a * b;
		System.out.println("Multification: " + c);
		
	}
	
	// Method-4
	// Public:Non-static:WithOutReturnType:WithOutParemeters
	void Div() {
		// Body;
		int a = 20, b = 10, c;
		c = a / b;
		System.out.println("Division: " + c);
		
	}

	public static void main(String[] args) {
		Calculator1 cal = new Calculator1();
		
		cal.Add();
		
		//Calculator1.Sub();
		cal.Sub();
		
		Calculator1.Mul();
		cal.Div();
		
		
		

	}

}
