/*Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is not tax below 2.5L. Take the input amount as input from the user. */

import java.util.Scanner;

public class incometax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in lpa:");
        float a=sc.nextFloat();
        if((a>250000) &&(a<500000)){
            float b=(float)(a*5)/100;
            System.out.println("income tax paid by an employee is 5% ,amount is: "+b);
        }
        else if((a>500000)&&(a<1000000)){
            float c=(float)(a*20)/100;
            System.out.println("income tax paid by an employee is 20% ,amount is: "+c);

        }
        else if(a>1000000){
            float d=(float)(a*30)/100;
            System.out.println("income tax paid by an employee is 30% ,amount is: "+d);


        }
        else{
            System.out.println("income tax paid by an employee is 0% ");

        }

    }

}

