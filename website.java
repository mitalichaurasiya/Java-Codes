import java.util.Scanner;

public class website {
    public static void maine(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your website with domain: ");
        String s=sc.nextLine();
        if(s.endsWith(".com")){
            System.out.println("Website is Commercial");
        }
        else if(s.endsWith(".org")){
            System.out.println("Website is Organizational");
        }
        else if(s.endsWith(".in")){
            System.out.println("Website is indian");
        }
        else if(s.endsWith(".gov.in")){
            System.out.println("Website is government");
        }
        else{
            System.out.println("Not mentioned type");
        }
    }
    
}
