import java.util.Scanner;
class Program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Length of tile: ");
        int length_tile=sc.nextInt();
        System.out.println("breadth of tile: ");
        int breadth_tile=sc.nextInt();
        System.out.println("Length of the region: ");
        int length_region = sc.nextInt();
        System.out.println("Breadth of the region: ");
        int breadth_region = sc.nextInt();

        int area_tile = length_tile * breadth_tile;
        int area_region = length_region * breadth_region;

        int total_tile = area_region / area_tile;

        System.out.println("Total tile needed to cover: "+total_tile);
        



    }
}
