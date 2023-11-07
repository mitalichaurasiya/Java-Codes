import java.util.Scanner;

public class Kmtomiles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Kilometers: ");
        float km=sc.nextFloat();
        float miles=(float) (km/1.609);
        System.out.println(km+" yskm into miles will be "+miles+" miles");
    }
}
