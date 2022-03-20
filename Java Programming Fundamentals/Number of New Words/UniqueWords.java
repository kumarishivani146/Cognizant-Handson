//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main(String[] args) {
        System.out.println("Enter Student's Article");
		Scanner sc=new Scanner(System.in);
		try{
		    String s=sc.nextLine();
    		String s1="";
    		s=s.toLowerCase();
    		ArrayList<String> a= new ArrayList<>();
    		HashSet<String> set=new HashSet();
    		int count=0;
    		for(int i=0;i<s.length();i++){
    		    if(s.charAt(i)==' '||s.charAt(i)==','||s.charAt(i)==':'||s.charAt(i)=='?'||s.charAt(i)=='.'||s.charAt(i)==';'||s.charAt(i)=='!'){
    		        if(s1.length()>0)
    		        count++;
    		        if(s1.length()>0&&!set.contains(s1))
    		        {
    		            //System.out.println(s1);
    		            a.add(s1);
    		            set.add(s1);
    		        }
    		        s1="";
    		    }
    		    else
    		    s1+=s.charAt(i);
    		}
    		if(s1.length()>0)
    		count++;
    		if(s1.length()>0&&!set.contains(s1))
    		        {
    		            //System.out.println(s1);
    		            a.add(s1);
    		            set.add(s1);
    		        }
    		Collections.sort(a);
    		System.out.println("Number of words "+count);
    		System.out.println("Number of unique words "+a.size());
    		System.out.println("The words are");
    		for(int i=0;i<a.size();i++){
    		    System.out.println(i+1+". "+a.get(i));
    		}
		}catch(Exception e){
		    return;
		}
	}
}