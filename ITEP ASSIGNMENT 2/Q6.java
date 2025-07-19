import java.util.Scanner;
class Program6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter of Triangle: ");
        int perimeter = sc.nextInt();

        System.out.println("First side of Triangle : ");
        int one_side = sc.nextInt();

        System.out.println("Second side of Triangle : ");
        int Second_side = sc.nextInt();

        int Third_side= perimeter-(one_side+Second_side);
        int semi_perimeter = perimeter/2;
        
        double area = Math.sqrt(semi_perimeter * (semi_perimeter - one_side) * (semi_perimeter - Second_side) * (semi_perimeter - Third_side));

        System.out.println("Area of the Triangle: "+area+"cm\u00B2");
        

    }
}
