import java.util.Scanner;
class Q23 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
System.out.println("length of bricks: ");
        double brickLength =sc.nextDouble();
System.out.println("breadth of bricks: ");
        double brickWidth =sc.nextDouble();
System.out.println("thickness of bricks: ");
        double brickThickness = sc.nextDouble();

        double brickVolume = brickLength * brickWidth * brickThickness;

        double wall_Length = 20 * 100;
        double wall_Height = 2 * 100;
        double wall_Thickness = 0.75 * 100;
        double wall_Volume = wall_Length * wall_Height * wall_Thickness;

        int number_of_bricks = (int) (wall_Volume / brickVolume);

        int cost = 900;
        double total_Cost = (number_of_bricks / 1000.0) * cost;

        System.out.println("Number of bricks required: " + number_of_bricks);
        System.out.println("Total cost of bricks: " + total_Cost);
    }
}
