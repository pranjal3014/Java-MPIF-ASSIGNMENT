import java.util.Scanner;
class Program17 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of Ribbon: ");
        int length_ribbon = sc.nextInt();

        System.out.println("Breadth of Ribbon: ");
        int breadth_ribbon = sc.nextInt();

        int perimeter = 2 * (length_ribbon + breadth_ribbon);

        System.out.println("The length of ribbon need is : " + perimeter + " m");

    }
}