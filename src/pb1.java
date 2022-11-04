import java.util.Scanner;

public class pb1 {




 //    @Override
    //find the factorial of n;
    public  static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }

    // Main methods ;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your number ");
        int n  = scn.nextInt();

        int ans =  factorial(n);
        System.out.println("The Factorial of n : "+ans);

        /*
         ***** check-file-location *****;
        pb1 file = new pb1();
        System.out.println(file);
        */
    }
}
