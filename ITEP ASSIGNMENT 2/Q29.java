import java.util.Scanner;
class Q29 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Length of Floor: ");
        int floor_length = sc.nextInt();
System.out.println("Breadth of Floor: ");        
        int floor_width = sc.nextInt();
System.out.println("side of Tile: ");
        int tile_side =sc.nextInt();

        int floor_area = floor_length * floor_width;
        int tile_area = tile_side * tile_side;

        int number_of_tiles = floor_area / tile_area;

        System.out.println("Number of tiles required = " + number_of_tiles);
    }
}
