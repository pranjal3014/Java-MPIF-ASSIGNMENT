import java.util.Scanner;
class Program21{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
int a = sc.nextInt();
System.out.println("Enter 2nd number: ");
int b = sc.nextInt();
if(a>b){
    System.out.println("1st number is greater than 2nd");
}
else
System.out.println("2nd number is greater than 1st");
     }
}