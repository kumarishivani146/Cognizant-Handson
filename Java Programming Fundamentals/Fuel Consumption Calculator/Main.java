import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    try{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int x=sc.nextInt();
        if(x<=0){
            System.out.println(x+" is an Invalid Input");
            return;
        }
        System.out.println("Enter the distance covered");
        
        int y=sc.nextInt();
        if(y<=0){
            System.out.println(y+" is an Invalid Input");
            return;
        }
        float l=(float)x;
        float d=(float)y;
            System.out.println("Liters/100KM");
            System.out.printf("%.2f",(l/d)*100);
            l*=0.2642;
            d*=0.6214;
            System.out.println();
            System.out.println("Miles/gallons");
            System.out.printf("%.2f",(d/l));
    }catch(Exception e){
        return;
    }
  }
}