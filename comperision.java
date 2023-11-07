import java.util.Scanner;

public class comperision {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your comperision number: ");
        int a=sc.nextInt();
        System.out.println("enter your compared number: ");
        int b=sc.nextInt();
        if(b>a){
            System.out.println("compaired number is vadda");
        }
        else{
            System.out.println("compaired number is chinna");
        }
    }
    
}
