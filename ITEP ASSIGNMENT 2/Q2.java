import java.util.Scanner;
class Program2{
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of rectangle: ");
        int area= sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int breadth=sc.nextInt();

        int length = area / breadth;
        int perimeter = 2*(length+breadth);

        System.out.println("Length of Rectangle : "+length);
        System.out.println("Perimeter of Rectangle: "+perimeter);

    }
}