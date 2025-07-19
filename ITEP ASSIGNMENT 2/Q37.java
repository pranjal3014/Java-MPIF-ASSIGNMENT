import java.util.Scanner;
class Q37 {
    public static void main(String args[]) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter Surface area: ");
        double surface_area =sc.nextDouble();
System.out.println("Enter Height: ");
        double height=sc.nextDouble();
        System.out.println("Enter pi value: ");
        double pi = sc.nextDouble();

        double a = 1;
        double b = height;
        double c = - (surface_area / (2 * pi));

        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double radius = (-b + discriminant) / (2 * a);
        double diameter = 2 * radius;

        System.out.println("Diameter of the cylinder = " + diameter + " cm");
    }
}

