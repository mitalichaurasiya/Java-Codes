import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");

    }
    
}
