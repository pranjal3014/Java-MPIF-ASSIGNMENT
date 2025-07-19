import java.util.Scanner;
class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Altitude of Triangle: ");
        double altitude = sc.nextDouble();
        
        System.out.println("Area in meter: ");
        double area_m = sc.nextDouble();

        double area_cm = area_m*10000;
        double base = (area_cm * 2) / altitude;

        System.out.println("Base of the Triangle: "+base+" cm.");
    }
}
