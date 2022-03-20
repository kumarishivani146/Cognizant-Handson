package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar b=new Bazaar();
		b.setPolicyMap(new TreeMap<Integer,String>());
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		int x=0;
		String s="";
		while(n-->0){
		    System.out.println("Enter the Policy ID");
		    x=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Policy Name");
		    s=sc.nextLine();
		    b.addPolicyDetails(new Integer(x),s);
		    //System.out.print(n+" ");
		}
		Map<Integer,String> m=b.getPolicyMap();
        Set<Integer> keys = m.keySet();
        Iterator<Integer> itr = keys.iterator();
  
        // traverse the TreeMap using iterator
        while (itr.hasNext()) {
            Integer i = itr.next();
            System.out.println(i + " " + m.get(i));
        }
        System.out.println("Enter the policy type to be searched");
        List<Integer> l=b.searchBasedOnPolicyType(sc.nextLine());
        for(int i=0;i<l.size();i++)
        System.out.println(l.get(i));
	}

}
