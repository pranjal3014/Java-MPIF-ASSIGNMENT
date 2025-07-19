import java.util.Scanner;
class Program11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Triangle: ");
        int area= sc.nextInt();

        System.out.println("Ratio of Base: ");
        int base_ratio= sc.nextInt();
        

        System.out.println("Ratio of Height: ");
        int height_ratio= sc.nextInt();

        float area_ratio = 1/2f*base_ratio*height_ratio;

        float x = area / area_ratio;
        double y = Math.sqrt(x);

        double base = base_ratio*y;
        double height= height_ratio*y;

        System.out.println("Base of Triangle "+base+" m");
        System.out.println("Height of Tringle "+height+ " m");
    }
}