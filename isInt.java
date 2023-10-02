/* Write a Java program to detect whether a number entered by the user is an integer or not. */

//Code:
import java.util.Scanner;
public class isint{
    public static void main(String args[]){
        System.out.println("Enter the value: ");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        
    }
}
