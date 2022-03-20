import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String s;
     sc.nextLine();
     int max_val=Integer.MAX_VALUE;
     String ret="";
     while(n-->0){
         s=sc.nextLine();
         String name="";
         String cost="";
         String disc="";
         int i=0;
         System.out.println(s);
         while(s.charAt(i)!=',')
         name+=s.charAt(i++);
         i++;
         while(s.charAt(i)!=',')
         cost+=s.charAt(i++);
         i++;
         while(i<s.length())
         disc+=s.charAt(i++);
         
         int cp=Integer.parseInt(cost);
         int discount=Integer.parseInt(disc);
         //System.out.println(discount*cp/100);
         if(discount*cp/100<max_val){
             max_val=discount*cp/100;
             ret=name;
         }
         else if(discount*cp/100==max_val){
             ret+="\n"+name;
         }
     }
    System.out.println(ret);
    }
}