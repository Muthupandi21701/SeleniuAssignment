package banking;

public class AxisBank  extends BankInfo{
	public void deposite () {
		System.out.println("deposite=2500");
	}
	public static void main(String[] args) {
		
		AxisBank money=new AxisBank();
		money.savings();
		money.deposite();
		money.fixed();
	}

}
