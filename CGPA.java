/* Problem Statement: Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100) */
// Code
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the marks in First subject out of 100: ");
        float science=sc.nextFloat();
        System.out.println("Please enter the marks in Second subject out of 100: ");
        Float maths=sc.nextFloat();
        System.out.println("Please enter the marks in Third subject out of 100: ");
        float comp= sc.nextFloat();

        float p=(float) ((science+maths+comp)/3.0);
        float cgpa=p/9.5;
        System.out.println("Your CGPA is: "+cgpa);
    }    
}
