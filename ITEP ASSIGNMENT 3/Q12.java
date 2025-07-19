import java.util.Scanner;
class Program12{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 4 digit Number: ");
int number = sc.nextInt();
int reverse = 0;
while(number != 0 ){
int digit = number%10;
reverse = reverse*10+digit;
number = number/10;
}
System.out.println("The reverse digit is: "+reverse);
     }
}