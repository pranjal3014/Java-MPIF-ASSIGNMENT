import java.util.Scanner;
class Program6{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int num = sc.nextInt();

        int absolute_value = Math.abs(num);

        System.out.println("The Absolute value is : "+absolute_value);
        
     }
}