import java.util.Scanner;
class Program14 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Vertix 1: ");
        double vertix_1 = sc.nextDouble();
System.out.println("Enter Vertix 2: ");
        double vertix_2 = sc.nextDouble();
        System.out.println("Enter Quadrilateral: ");
        double quadrilateral = sc.nextDouble();
        double area = 0.5 * (vertix_1 + vertix_2) * quadrilateral;

        System.out.println("Area of Field =  " + area + "cm\u00B2");

    }
}