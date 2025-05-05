package AbstractMethods;

public class Test {

	public static void main(String[] args)
	{
		
		//Parent_RBI rbi=new Parent_RBI();
		//rbi.Savings();
		
		Child1_SBI sbi=new Child1_SBI();
		sbi.Loan_Interst();
		sbi.Savings();
		
		Child2_HDFC hdfc=new Child2_HDFC();
		hdfc.Loan_Interst();
		hdfc.Savings();
		
	}

}
