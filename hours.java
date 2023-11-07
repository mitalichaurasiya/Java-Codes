import java.util.Scanner;

public class hours {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Hours: ");
        float hour=sc.nextFloat();
        int min=(int)(hour*60);
        System.out.println(hour+" hrs into mins = "+ min+" mins");
    }
    
}
