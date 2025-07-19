import java.util.Scanner;
class Q31 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter side: ");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        int area = side * side;

        System.out.println("Area of the square = " + area + " m\u00B2");
    }
}

