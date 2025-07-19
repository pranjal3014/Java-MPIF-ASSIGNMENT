import java.util.Scanner;
class Q45 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a: ");
        int a = sc.nextInt();
System.out.println("Enter d: ");
        int d= sc.nextInt();
       System.out.println("Enter n: "); 
        int n =sc.nextInt();

        int sum = (n * (2 * a + (n - 1) * d)) / 2;

        System.out.println("Sum of first 28 terms = " + sum);
    }
}
