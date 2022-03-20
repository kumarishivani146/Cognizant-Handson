import java.io.File;
import java.util.Scanner;
public class FileDemo
{
    public static void main(String[] args)
    {
        File file=new File("log.txt");
        try{
           Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            } 
        }catch(Exception e){
            return;
        }
    }
}