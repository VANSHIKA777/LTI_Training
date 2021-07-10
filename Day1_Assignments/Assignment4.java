class Account{

	private long accountNo;
	private double accountBalance;
	private String accountPassword;

	private static String bankName;

	
	public Account() {
		super();
	}

	public Account(long accountNo, double accountBalance, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
	
	void displayAccount() {
		System.out.println("Bank Name : "+Account.getBankName());
		System.out.println("Account no.: "+accountNo);
		System.out.println("Account Balance is "+accountBalance);
		System.out.println("Password is "+accountPassword);
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account.setBankName("HDFC");
		
		Account ac1 = new Account();
		ac1.setAccountNo(1);
		ac1.setAccountBalance(1000);
		ac1.setAccountPassword("A@1");
		System.out.println("Bank Name : "+Account.getBankName());
		System.out.println("Account no.: "+ac1.getAccountNo());
		System.out.println("Account Balance is "+ac1.getAccountBalance());
		System.out.println("Password is "+ac1.getAccountPassword());
		
		
		Account ac2 = new Account(2,2000,"A@2");
		ac2.displayAccount();
		
		
	}

}
