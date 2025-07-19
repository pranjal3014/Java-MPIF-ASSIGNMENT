import java.util.Scanner;
class Program30{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter year: ");
int year = sc.nextInt();
if(year%4==0){
    System.out.println("This year is leap year");
}
else
System.out.println("This year is NOT a leap year");
     }
}