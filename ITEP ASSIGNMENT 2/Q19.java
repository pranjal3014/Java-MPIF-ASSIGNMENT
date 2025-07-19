import java.util.Scanner;
class Program19{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

System.out.println("Length of Cuboid: ");
        int length_cuboid = sc.nextInt();
        
System.out.println("Breadth of Cuboid: ");
        int breadth_cuboid = sc.nextInt();

System.out.println("Height of Cuboid: ");
        int height_cuboid = sc.nextInt();

System.out.println("Edge of cube: ");
        int cube_edge = sc.nextInt();

        int volume_of_cube = (cube_edge * cube_edge * cube_edge);
        int volume_of_cuboid = (length_cuboid * breadth_cuboid * height_cuboid);

        if (volume_of_cube > volume_of_cuboid) {
            System.out.println("Cube have more volume than cuboid");
        } else {
            System.out.println("Cuboid have more volume than cube");
        }
    }
}