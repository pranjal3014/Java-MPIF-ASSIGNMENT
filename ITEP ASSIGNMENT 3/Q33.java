import java.util.Scanner;
class Program33{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
int num = sc.nextInt();
if((num&1)==0){
    System.out.println("Even");
}
else
System.out.println("Odd");
     }
}