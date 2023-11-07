//Expression: (v^2-u^2)/2

import java.util.Scanner;

public class expression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of v: ");
        int v= sc.nextInt();
        System.out.println("Enter the value of u: ");
        int u = sc.nextInt();
        int result=((v*v)-(u*u))/2;
        System.out.println("The value of Given Expression is : "+result);
    }
}
