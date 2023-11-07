import java.util.Scanner;

public class ifelse {
    public static void main(String args[]){
       int t=11;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number: ");
       int a=sc.nextInt();
       if (t==a) {
        System.out.println("i am 11");
       }
       else{
        System.out.println("i am not 11");
       }
    }
}
