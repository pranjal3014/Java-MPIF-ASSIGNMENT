import java.util.Scanner;
class Program4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of Rectangular plot: ");
        int length= sc.nextInt();
        System.out.println("Breadth of Rectangular Plot: ");
        int breadth = sc.nextInt();

        int area = length * breadth ;
        int rate = (area * 6)/100;

        System.out.println("Cost of tile : "+rate+" rs.");
    }
}
