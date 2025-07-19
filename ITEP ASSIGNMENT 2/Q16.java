import java.util.Scanner;
class Program16 {
    public static void main(String args[]) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("length of carpet: ");
        int length_carpet = sc.nextInt();

        System.out.println("Breadth of carpet: ");
        int breadth_carpet = sc.nextInt();

        int area_for_carpet = (length_carpet * breadth_carpet);

        System.out.println("Tina need to buy " + area_for_carpet + "meter\u00B2 of carpet");

    }
}
