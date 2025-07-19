import java.util.Scanner;
class Q26 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Length of path: ");
        int length_of_path = sc.nextInt();
System.out.println("Breadth of path: ");
        double breadth_of_path = sc.nextDouble();
System.out.println("length of bricks: ");
        int length_of_brick =sc.nextInt();
        System.out.println("breadth of bricks: ");
        int breadth_of_brick =sc.nextInt();

        int length_of_path_in_cm = length_of_path * 100;
        double breadth_of_path_in_cm = breadth_of_path * 100;

        double area_of_path = length_of_path_in_cm * breadth_of_path_in_cm;
        int area_of_brick = length_of_brick * breadth_of_brick;

        int total_brick = (int)area_of_path / area_of_brick;

        System.out.println(total_brick + " bricks are used to make the path");
    }
}

