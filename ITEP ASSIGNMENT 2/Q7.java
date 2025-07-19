import java.util.Scanner;
class Program7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Base of Triangle: ");
        int base = sc.nextInt();
        System.out.println("Area of Triangle: ");
        int area = sc.nextInt();
         
        int height = (area *2 ) / base;
        System.out.println("Height of Tringle: "+height+" cm");

    }
}