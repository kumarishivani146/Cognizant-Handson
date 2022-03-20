import java.util.*;
public class ArrayException{
    public String getPriceDetails(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements in the array");
            int n=sc.nextInt();
            System.out.println("Enter the price details");
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            System.out.println("Enter the index of the array element you want to access");
            int x=sc.nextInt();
            return "The array element is "+a[x];
        }catch(ArrayIndexOutOfBoundsException ex){
            return "Array index is out of range";
        }catch(InputMismatchException ex){
            return "Input was not in the correct format";
        }
    }
}