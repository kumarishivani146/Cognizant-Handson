import java.util.Scanner;
public class AccountDetails{
    public Account getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        Account t1=new Account();
        try{
            int bal=0;
            System.out.println("Enter account id:");
            t1.setAccountId(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter account type:");
            t1.setAccountType(sc.nextLine());
            while(bal<=0){
                System.out.println("Enter balance:");
                bal=sc.nextInt();
                if(bal<=0)
                System.out.println("Balance should be positive");
            }
            t1.setBalance(bal);
            return t1;
        }catch(Exception e){
            return t1;
        }
    }
    public int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        int f=0;
        try
        {
            while(f<=0){
                System.out.println("Enter amount to be withdrawn:");
                f=sc.nextInt();
                if(f<=0)
                System.out.println("Amount should be positive");
            }
            return f;
        }
        catch(Exception e){
        return f;
        }
    }
    public static void main(String args[]){
        AccountDetails a=new AccountDetails();
        Account a1=a.getAccountDetails();
        int f=a.getWithdrawAmount();
        if(a1.withdraw(f)){
            System.out.println("Balance amount after withdraw: "+a1.getBalance());
        }
        else
        System.out.println("Sorry!!! No enough balance");
    }
}