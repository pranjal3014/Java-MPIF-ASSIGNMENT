import java.util.Scanner;
class Q28 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Lenght: ");
        int length =sc.nextInt();
System.out.println("Enter Breadth: ");
        int width =sc.nextInt();
        System.out.println("Enter Rate: ");
        int rate = sc.nextInt();

        int area = length * width;
        int total_price = area * rate;

        System.out.println("Price of the carpet = " + total_price+ " rs");
    }
}

