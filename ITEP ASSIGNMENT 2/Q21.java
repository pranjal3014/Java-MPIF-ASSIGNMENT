import java.util.Scanner;
class Q21 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Length of bricks: ");
        int length_of_brick = sc.nextInt();
        System.out.println("breadth of bricks: ");
        int breadth_of_brick =sc.nextInt();
        System.out.println("height of the bricks: ");
        int height_of_brick =sc.nextInt();

        System.out.println("length of wall: ");
        int length_of_wall_in_m = sc.nextInt();
        System.out.println("breadth of wall: ");
        int breadth_of_wall_in_m = sc.nextInt();
        System.out.println("height of wall: ");
        int height_of_wall_in_m =sc.nextInt();

        int length_of_wall_in_cm = 15 * 100;
        int breadth_of_wall_in_cm = 10 * 100;
        int height_of_wall_in_cm = 8 * 100;

        int volume_of_brick = (length_of_brick * breadth_of_brick * height_of_brick);
        int volume_of_wall = (length_of_wall_in_cm * breadth_of_wall_in_cm * height_of_wall_in_cm);

        int total_brick = volume_of_wall / volume_of_brick;

        System.out.println(total_brick + "brick use to make a wall");
    }
}
