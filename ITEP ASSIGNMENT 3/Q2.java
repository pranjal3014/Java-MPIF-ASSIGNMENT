import java.util.Scanner;
class Program2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Quantity: ");
        int quantity= sc.nextInt();
        int cost = quantity*100;

        if(1000<quantity){
            int discount= cost /10;
            cost = cost-discount;

            System.out.println("Total cost of this product: "+cost);
        }
        else {
            System.out.println("Total cost of this product: "+cost);
        }
    }
}