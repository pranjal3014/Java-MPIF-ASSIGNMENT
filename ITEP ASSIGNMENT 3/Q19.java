import java.util.Scanner;
class Program19{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st Value: ");
int a = sc.nextInt();
System.out.println("Enter 2nd Value: ");
int b = sc.nextInt();
System.out.println("You entered a : "+a+" b : "+b);
System.out.println("With 3rd Variable");
int c = a;
a = b;
b = c;
System.out.println("a : "+a+" b : "+b);
System.out.println("Without 3rd Variable");
a=a+b;
b=a-b;
a=a-b;
System.out.println("a : "+a+" b : "+b);
     }
}