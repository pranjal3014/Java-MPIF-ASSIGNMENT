import java.util.Scanner;
class Q27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
System.out.println("Enter Lenght: ");
        int length =sc.nextInt();
System.out.println("Enter Breadth: ");
        int width =sc.nextInt();
        System.out.println("Enter Rate: ");
        int rate =sc.nextInt();

        int area = length * width;
        int total_cost = area * rate;

        System.out.println("Total cost of tiling = " + total_cost+ " rs");
    }
}
