import java.util.*;
public class swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("yours ting(a) tadak(b) is:"+a+","+b);
    }   
}