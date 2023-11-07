import java.util.Scanner;
public class tolower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter String in CAPITAL Letter ");
        String s1= sc.nextLine();
        String l=s1.toLowerCase();
        System.out.println("Your String in lower case will be "+l);
    }
    
}
