import java.util.Scanner;
class Program26{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
int num = sc.nextInt();
switch(num%2){
    case 0:
        System.out.println("Even");
        break;
    case 1:
        System.out.println("Odd");
        break;
}
     }
}