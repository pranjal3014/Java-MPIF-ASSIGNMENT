import java.util.Scanner;
class Q40{
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius: ");
        double radius=sc.nextDouble();
System.out.println("Enter Height: ");
        double height=sc.nextDouble();
        System.out.println("Enter Pi value: ");
        double pi =sc.nextDouble();

        double volume = pi * radius * radius * height;

        System.out.println("Volume of the cylinder = " + volume + " cm^3");
    }
}
