import java.util.*;

public class kmtomm{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the value of Km: ");
		Float km= sc.nextFloat();
		Float mm = (km*1000000);
		System.out.println(km+" km into mm will be "+mm+" mm");
	}
}