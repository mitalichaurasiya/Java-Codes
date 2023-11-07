//write a java program to find out wheather a student is pass or fail; 
//if it requires a total of 40% and at least 33% in each subject to pass.

import java.util.Scanner;

public class passfail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first sub marks: ");
        float a=sc.nextFloat();
        System.out.println("Enter second sub marks: ");
        float b=sc.nextFloat();
        System.out.println("Enter Third sub marks: ");
        float c=sc.nextFloat();
        float per=(float)((a+b+c)/3);
        if(per>40){
            if ((a>33)&&(b>33)&&(c>33)){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
        }
        else{
            System.out.println("Fail");
        }
                

    }
    
}
