import java.util.Scanner;
public class Placement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of students placed in CSE:");
		int cs=sc.nextInt();
		System.out.print("Enter the no of students placed in ECE:");
		int ec=sc.nextInt();
		System.out.print("Enter the no of students placed in MECH:");
		int me=sc.nextInt();
		
		if(cs==ec&&ec==me)
		System.out.println("None of the department has got the highest placement");
		else if(cs<0||ec<0||me<0)
		System.out.println("Input is Invalid");
		
		else{
		    int max=(cs>=ec&&cs>=me)?cs:(ec>=cs&&ec>me?ec:me);
		    System.out.println("Highest placement");
		    if(max==cs)
		    System.out.println("CSE");
		    if(max==ec)
		    System.out.println("ECE");
		    if(max==me)
		    System.out.println("MECH");
		}
	}
}