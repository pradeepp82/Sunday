package designPatterns;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		CreditCard target = new BankCustomer();
		target.giveBankDetails();
		System.out.println(target.getCreditCard());
	}

}
