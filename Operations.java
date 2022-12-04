import java.util.Scanner;

public class Operations {
    
    public static void main(String[] args) {
        int a,b;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        a = sc.nextInt();
        System.out.println("enter the second number: ");
        b = sc.nextInt();
        System.out.println("enter the choice: ");
        choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                int sum = a+b;
                System.out.println("sum is:" + sum);
                break;
            case '-':
                int dif = a-b;
                System.out.println("differnce is:" + dif);
                break;
            case '*':
                int prod = a*b;
                System.out.println("product is:" + prod);
                break;
            case '/':
                double div = a/b;
                System.out.println("division is:" + div);
                break;
            case '%':
                double mod = a/b;
                System.out.println("modulus is:" + mod);
                break;
        
            default:
                break;
        }
    }
}
