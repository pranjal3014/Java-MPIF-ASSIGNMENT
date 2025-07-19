import java.util.Scanner;
class Q43 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter height: ");
        double height =sc.nextDouble();
System.out.println("Enter slant-height: ");
        double slant_height =sc.nextDouble();
      System.out.println("Enter rate: ");  
        double rate = sc.nextDouble();
        double pi = 3.14;

        double radius = Math.sqrt((slant_height * slant_height) - (height * height));
        double base_area = pi * radius * radius;
        double cost = base_area * rate;

        System.out.println("Cost of polishing the base = " + cost+ " rs");
    }
}
