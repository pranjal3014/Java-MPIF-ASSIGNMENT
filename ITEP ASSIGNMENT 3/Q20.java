import java.util.Scanner;
class Program20{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st Value: ");
int a = sc.nextInt();
System.out.println("Enter 2nd Value: ");
int b = sc.nextInt();
System.out.println("Before exchange \n a: "+a+" b: "+b);
a =a^b;
b=a^b;
a=a^b;
System.out.println("After exchange \n a: "+a+" b: "+b);
     }
}