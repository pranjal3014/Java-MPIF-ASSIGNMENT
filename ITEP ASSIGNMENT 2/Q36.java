import java.util.Scanner;
class Q36 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Diameter: ");
        double diameter = sc.nextDouble();
System.out.println("Enter Height: ");
        double height= sc.nextDouble() ;
        System.out.println("Enter Pi value: ");
        double pi = sc.nextDouble();

        double radius = diameter / 2;
        double surface_area = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder = " + surface_area + " m²");
    }
}
