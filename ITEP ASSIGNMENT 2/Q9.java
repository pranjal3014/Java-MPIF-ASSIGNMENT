import java.util.Scanner;
class Program9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Side of equilateral Tringle: ");
        double side=sc.nextInt();

        double area=(Math.sqrt(3)/4f)*side*side;

        System.out.println("Area of equilateral Triangle is : "+area);
    }
}