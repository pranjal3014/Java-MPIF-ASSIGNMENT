import java.util.Scanner;
class Q22 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
    System.out.println("length of carton: ");    
        int length_of_carton = sc.nextInt();
    System.out.println("breadth of carton: ");    
        int breadth_of_carton =sc.nextInt();
System.out.println("height of carton: ");
        int height_of_carton = sc.nextInt();
System.out.println("Side of cube: ");
        int cube_side =sc.nextInt();

        int volume_of_carton = (length_of_carton * breadth_of_carton * height_of_carton);
        int volume_of_cube = (cube_side * cube_side * cube_side);

        int total_cubes = volume_of_carton / volume_of_cube;

        System.out.println(total_cubes + "cubes are placed in this box");
    }
}