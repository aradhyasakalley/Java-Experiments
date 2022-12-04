import java.util.Scanner;

public class OddRange {
    public static void main(String[] args) {
        int i,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value:");
        a = sc.nextInt();
        System.out.println("enter the last value:");
        b = sc.nextInt();
        System.out.println("odd numbers are:");
        for ( i = a; i < b; i++) {
            if (i%2!=0){
                
                System.out.println(i+"");
            }
        }
    }
}
