import java.util.Scanner;
class Q34{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter base 1: ");
        int base1 = sc.nextInt();
System.out.println("Enter base 2: ");
        int base2 =sc.nextInt();
        System.out.println("Enter Height: ");
        int height =sc.nextInt();
System.out.println("Enter Walk way Width: ");
        int walkwayWidth =sc.nextInt();

        int trapezoidArea = (base1 + base2) * height / 2;
        int walkwayArea = walkwayWidth * height;

        int totalArea = trapezoidArea + walkwayArea;

        System.out.println("Total area after adding the walkway: " + totalArea + " m\u00B2");
    }
}
