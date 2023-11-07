//int x=7
//int a= x*49/x+ 35/x

import java.util.Scanner;

public class new_expression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your x value: ");
        int x=sc.nextInt();
        int a=x*49/x+35/x;
        System.out.println("yours a's value is: "+a);
    }
    
}
