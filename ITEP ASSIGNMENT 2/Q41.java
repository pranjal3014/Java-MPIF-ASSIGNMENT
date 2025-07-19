import java.util.Scanner;
class Q41 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Diameter: ");
        double diameter =sc.nextDouble();
System.out.println("Enter Height: ");
        double height =sc.nextDouble();
        System.out.println("Enter Pi value: ");
        double pi =sc.nextDouble();

        double radius = diameter / 2;
        double volume = pi * radius * radius * height;

        System.out.println("Volume of the cylinder = " + volume + " cm^3");
    }
}
