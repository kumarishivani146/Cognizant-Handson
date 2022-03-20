public class SavingsAccount extends Account{

    private double minimumBalance;

    //Uncomment the getters and setters after writing the attributes
    public SavingsAccount(int a_no, Customer c, double b,double min_bal){
        super(a_no,c,b);
        this.minimumBalance=min_bal;
    }
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    public boolean withdraw(double amount){
        System.out.println(this.balance);
        if(this.balance-amount>this.minimumBalance)
        {
            balance-=amount;
            return true;
        }
        return false;
    }

    
}

    