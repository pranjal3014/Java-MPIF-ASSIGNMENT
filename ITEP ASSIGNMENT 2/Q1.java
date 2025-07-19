import java.util.Scanner;
class Program1{
    public static void main(String agrs[]){
        System.out.println("Enter the perimeter: ");
        Scanner sc= new Scanner(System.in);
        int perimeter = sc.nextInt();
        System.out.println("Enter the value of length: ");
        int length= sc.nextInt();
        int breadth = (perimeter/2)-length;
        int area = length * breadth;
        
        System.out.println("Breadth of Rectangle: "+breadth);
        System.out.println("Area of Rectangle: "+area);
    }
}
