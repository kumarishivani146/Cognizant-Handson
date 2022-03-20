abstract public class Employee
{
	protected int employeeId;
    protected String employeeName;
    protected double salary;
    
    //Getters and Setters
    
  	public int getEmployeeId() {
  		return employeeId;
  	}
  	public void setEmployeeId(int employeeId) {
  		this.employeeId = employeeId;
  	}
  	public String getEmployeeName() {
  		return employeeName;
  	}
  	public void setEmployeeName(String employeeName) {
  		this.employeeName = employeeName;
  	}
  	public double getSalary() {
  		return salary;
  	}
  	public void setSalary(double salary) {
  		this.salary = salary;
  	}
  	
  	
    //Write a public 2 argument constructor with arguments – employeeId,and employeeName
    public Employee(int e_id,String e_name){
        this.employeeId=e_id;
        this.employeeName=e_name;
    }
    abstract public void calculateSalary();
    
    
     
    //Write a method -  public void calculateSalary()
	//Make this method as abstract
	
}