import java.util.Scanner;
class Program34{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter first side: ");
int a = sc.nextInt();
System.out.println("enter second side: ");
int b = sc.nextInt();
System.out.println("enter third side: ");
int c = sc.nextInt();

if((a == b && a == c)&& b == c){
    System.out.println("This is a equilateral triangle");
}
else if(a == b){
    
    System.out.println("This is a iscosceles triangle");
}
else {
    System.out.println("This is a scalene triangle");
}
     }
}
