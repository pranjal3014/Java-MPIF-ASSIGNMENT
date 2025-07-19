import java.util.Scanner;
class Q35 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius: ");
        double radius =sc.nextDouble();
System.out.println("Enter Height: ");
        double height =sc.nextDouble();
  System.out.println("Enter pi value: ");      
        double pi = sc.nextDouble();

        double surface_area = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder = " + surface_area + " cm\u00B2");
    }
}

