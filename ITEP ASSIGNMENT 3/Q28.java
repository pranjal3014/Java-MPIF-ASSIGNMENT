import java.util.Scanner;
class Program28{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
int a = sc.nextInt();
System.out.println("Enter 2nd number: ");
int b = sc.nextInt();
System.out.println("Enter Arithmatic operator: ");
char c = sc.next().charAt(0);
switch(c){
    case '+':
        System.out.println("a+b: "+a+b);
        break;
    case '-':
        System.out.println("a-b: "+(a-b));
        break;
    case '*':
        System.out.println("a*b: "+a*b);
        break;
    case '/':
        System.out.println("a/b: "+a/b);
        break;
    case '%':
        System.out.println("a%b: "+a%b);
        break;
    default :
    System.out.println("Invalid Operator");
}

     }
}