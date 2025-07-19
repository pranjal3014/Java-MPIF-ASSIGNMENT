import java.util.Scanner;
class Program12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hypotenuse of the right angle tringle: ");
        int hypo = sc.nextInt();

        System.out.println("Enter one side: ");
        int one_side = sc.nextInt();

        double other_side = Math.sqrt(hypo*hypo - one_side*one_side);

        double area = 1/2f * (one_side*other_side);
         
         System.out.println("Other side of Triangle: "+other_side+ "cm");
         System.out.println("Area of Triangle: "+area+" cm\u00B2");
    }
}