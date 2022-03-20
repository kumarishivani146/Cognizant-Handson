public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public void setAccountId(int id){
        this.accountId=id;
    }
    public void setAccountType(String type){
        this.accountType=type;
    }
    public void setBalance(int b){
        this.balance=b;
    }
    public int getAccountId(){
        return this.accountId;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public int getBalance(){
        return this.balance;
    }
    public boolean withdraw(int p){
        if(p<=this.balance)
        {
            this.balance-=p;
            return true;
        }
        return false;
    }
}