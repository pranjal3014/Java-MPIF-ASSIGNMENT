import java.util.Scanner;
class Program13{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Area of triangle: ");
        int area = sc.nextInt();

        System.out.println("One side pf triangle: ");
        int one_side = sc.nextInt();

        double other_side = (area *2) / one_side;

        System.out.println("Other side of Triangle: "+other_side+" cm.");
    }
}