import java.util.Scanner;
class Program10{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of isoseceles TRIANGLE: ");
        int side= sc.nextInt();

        float area = 1/2f*side*side;
        
        System.out.println("Area of tringle "+area+" cm\u00B2");
    }
}