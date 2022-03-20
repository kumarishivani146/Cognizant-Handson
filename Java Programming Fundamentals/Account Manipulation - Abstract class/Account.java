abstract public class Account {
    
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;
    //Uncomment the getters and setters after writing the attributes
    public Account(int a_no, Customer c, double b){
        this.accountNumber=a_no;
        this.customerObj=c;
        this.balance=b;
    }
    
    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    public abstract boolean withdraw(double amount);
    
}   