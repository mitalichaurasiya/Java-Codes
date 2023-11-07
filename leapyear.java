import java.util.Scanner;

public class leapyear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your year");
        int a=sc.nextInt();
        if ((a%400==0)||((a%100)!=0)&&(a%4==0)){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("not lesp year");
        }
    }
    
}
