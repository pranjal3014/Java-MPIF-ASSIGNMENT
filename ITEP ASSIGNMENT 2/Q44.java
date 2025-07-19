import java.util.Scanner;
class Q44{
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a: ");
        int a = sc.nextInt();
System.out.println("Enter d: ");
        int d =sc.nextInt();
        System.out.println("Enter n: ");
        int n =sc.nextInt();

        int term = a + (n - 1) * d;

        System.out.println("The 28th term of the AP = " + term);
    }
}

