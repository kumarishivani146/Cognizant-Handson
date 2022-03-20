import java.util.*;
public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
       
           Scanner sc = new Scanner(System.in);
           String name = sc.nextLine();
           String gender = sc.nextLine();
           double expectedSalary = sc.nextDouble();
           if(expectedSalary<10000)
           throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
           Candidate c=new Candidate();
           return c;
    }
    public static void main(String args[]){
        try{
            Candidate c=getCandidateDetails();
        }catch(Exception e){
            return;
        }
    }
}