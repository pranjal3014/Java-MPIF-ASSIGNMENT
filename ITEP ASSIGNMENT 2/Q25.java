import java.util.Scanner;
class Q25 {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
System.out.println("Length of Bricks: ");
        int length =sc.nextInt();
System.out.println("Breadth of Bricks: ");
        int breadth =sc.nextInt();
        System.out.println("Number of Bricks: ");
        int number_Of_Bricks = sc.nextInt();

     
        int area_of_OneBrick = length * breadth;

        int total_area = area_of_OneBrick * number_Of_Bricks;

        System.out.println("Total area of the path = " + total_area + " cm\u00B2");
    }
}
