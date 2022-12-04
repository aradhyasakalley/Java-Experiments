import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Quadratic {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the coefficient of x^2:");
        a=sc.nextInt();
        System.out.println("enter the coefficient of x:");
        b=sc.nextInt();
        System.out.println("enter the constant:");
        c=sc.nextInt();
        double det = b*b - 4*a*c;
        if (det >0 ){
            double root1 = (-b + Math.sqrt(det))/2*a;
            double root2 = (-b - Math.sqrt(det))/2*a;
            System.out.println("the roots are real and distinct");
            System.out.println("root 1:" + root1);
            System.out.println("root 2:" + root2);

        }
        else if (det == 0 ){
            double root = (-b + Math.sqrt(det)/2*a);
            System.out.println("the roots are real and equal");
            System.out.println("roots are:" + root);
        }
        else{
            double rp = -b/2*a;
            double ip = Math.sqrt(-det)/2*a;
            System.out.println("the roots are imaginary ");
            System.out.println("root 1 is " +rp+ "+i" +ip);
            System.out.println("root 1 is " +rp+ "-i" +ip);
        }





    }
}
