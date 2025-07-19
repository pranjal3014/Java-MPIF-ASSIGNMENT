import java.util.Scanner;
class Q32 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter side of Garden: ");
        int side_of_garden = sc.nextInt();

        int area_of_garden = side_of_garden * side_of_garden;

        System.out.println("Area of the garden = " + area_of_garden + " m\u00B2");
    }
}
