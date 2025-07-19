import java.util.Scanner;
class Q20 {
    public static void main(String args[]) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
System.out.println("Enter Breadth: ");
        int breadth = sc.nextInt();
System.out.println("Enter Height: ");
        int height = sc.nextInt();

        int volume = (length * breadth * height);

        System.out.println("Volume of a brick of ice-cream " + volume + "cm^3");
    }
}