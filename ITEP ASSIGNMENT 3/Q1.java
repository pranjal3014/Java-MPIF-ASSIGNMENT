import java.util.Scanner;
class Program1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of Rectangle: ");
        int length= sc.nextInt();

        System.out.println("Breadth of Rectangle: ");
        int breadth = sc.nextInt();

        if (length == breadth){
            System.out.println("It is a Square");
        }
        else
        System.out.println("It is not a square");
    }
}