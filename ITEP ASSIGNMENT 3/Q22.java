import java.util.Scanner;
class Program22{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
int a = sc.nextInt();
System.out.println("Enter 2nd number: ");
int b = sc.nextInt();
System.out.println("Enter 3rd number: ");
int c = sc.nextInt();
if(a>b && a>c){
    System.out.println("1st number is greater than 2nd and 3rd");
}
else if(b>a && b>c){
System.out.println("2nd number is greater than 1st and 3rd");
     }
     else{
        System.out.println("3rd number is greater than 1st and 2nd");
     }
}
}