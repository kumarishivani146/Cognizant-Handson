public class Main{
    
    public static void main(String args[]){
        Customer c1=new Customer(1,"jn","vbj");
        SavingsAccount s1=new SavingsAccount(1,c1,300.00,200.00);
        System.out.println(s1.withdraw(110.00));
    }
}