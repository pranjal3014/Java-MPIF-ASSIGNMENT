import java.util.Scanner;
class Q38 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Voulme: ");
        double volume = sc.nextDouble();
System.out.println("Enter Radius: ");
        double radius= sc.nextDouble();
        System.out.println("Enter Pi value: ");
        double pi = sc.nextDouble();

        double height = volume / (pi * radius * radius);
        double surface_area = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder = " + surface_area + " cm\u00B2");
    }
}

