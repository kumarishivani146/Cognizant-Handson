//Make this class inherit the Employee class

public class PermanentEmployee extends Employee 
{
    private double basicPay;
    
    // Getters and Setters
	
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
    
    public PermanentEmployee(int e_id,String e_name,double b_pay){
        super(e_id,e_name);
	    //this.employeeId=e_id;
	    //this.employeeName=e_name;
	    this.basicPay=b_pay;
	}
    
	
	//2. Implement the  - public void calculateSalary() - method   
    
    public void calculateSalary(){
        double PFamount=0;
        PFamount=(basicPay*0.12);
        setSalary(basicPay-PFamount);
    }
    
}