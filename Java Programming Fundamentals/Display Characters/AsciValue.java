import java.util.Scanner;

class AsciValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Enter the digits:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        System.out.println(a+"-"+(char)a);
        System.out.println(b+"-"+(char)b);
        System.out.println(c+"-"+(char)c);
        System.out.println(d+"-"+(char)d);
    }catch(Exception e){
        return;
    }
  }
}