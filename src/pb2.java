
import java.util.Scanner;

public class pb2 {
//    Q .1 Given two numbers,Return their sum;
//    public  static int sum(int a , int b) {
//        int ans = a+b;
//       return  ans ;
//    }

//    Q.2 Given two numbers A & B & C. Return their product.
//    public static int product(final int A, final int B, final int C) {
//        return a*b*c;
//    }

//    Q.3 Given a number A. Return square of the number.
//    public static int square(int a ){
//        int ans = a*a;
//        return ans;
//    }

//    Q.4 Given two integers A and B, where A is divisible by B.
//      public static double divisible(final double A , final double B){
//          return A/B;
//      }

//    Q.5 You have to find the value of cube of A i.e, A3.
//     public static  int cube( final int n , final int m){
//            int product =1;
//         for (int i = 1; i <=m ; i++) product*=n;
//         return product;
//     }

//    Q.6 Given an integer A, find the floor value of real number A / 200.
      public static  int floor_Value(double n){
//     (Floor Value means nearest of number);

          return (int)Math.floor(n);
    }
//    Q.7 Given an integer A, find the ceil value of real number A / 200.
    public static  int ceil_value(double m){
//     (ceil Value means greater of number);

        return (int)Math.ceil(m);
    }




//    Q.8 Given the temperature of a day in Degrees Celsius, convert this given temperature from Celsius to Fahrenheit.
//    Write a program to do so. Round the output up to 2 decimal places


//    Q.9 Given an integer A, find the rounded value of real number A / 200.

/*    Q.10 Given three integers, A, B and C.
    You have to find the number of days it will take to reach zero cases of Corona in a city.
    A - Average cases recovered in a day of the corona.
    B - Number of new cases of corona daily.
    C - Current active cases of the corona.
*/



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number for 1 ");
         double n = scn.nextDouble();
        System.out.println("Enter Your Number for 2 ");
        double m = scn.nextDouble();
//        Q.1 returning value;
//        System.out.println(sum(9,17));

//        Q.2 returning value;
//        System.out.println(product(4,5,6));

//        Q.3 returning value;
//        int ans = square(5);
//        System.out.println("This is Your Square Value "+"= "+ ans);

//        Q.4 returning value;
//        System.out.println(divisible(2,2));
//        System.out.println(divisible(12,6));
//        System.out.println(divisible(7,3));
//        System.out.println(divisible(15,6));
//        System.out.println(divisible(21,4));

//        Q.5 returning Value;
//        System.out.println("Cube of number is "+cube+(n,m));
//        System.out.println("Cube of number is "+cube(6,3));
//        System.out.println("Cube of number is "+cube(5,2));
//        System.out.println("Cube of number is "+cube(8,3));
//        System.out.println("Cube of number is "+cube(16,3));

//        Q.6 returning Value;
        System.out.println();
        System.out.println(floor_Value(n));

//        Q.7 returning Value;
        System.out.println(ceil_value(m));
    }
}
