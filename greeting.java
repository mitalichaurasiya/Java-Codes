import java.util.Scanner;

public class greeting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your name");
        String a=sc.nextLine();
        System.out.println("Hello "+a+","+"have a good day");
    }

}