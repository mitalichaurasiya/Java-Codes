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
        float cgpa=(float) (p/9.5);
        System.out.println("Your CGPA is: "+cgpa);
    }    
}
