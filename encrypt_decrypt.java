import java.util.Scanner;

public class encrypt_decrypt {
    /*public static void main(String args[] ){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your value");
        int s=sc.nextInt();
        int a=s+8;
        int b=a-8;
        System.out.println("encrypt "+a);
        System.out.println("decrypt "+b);
    }
    
}*/

    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}

