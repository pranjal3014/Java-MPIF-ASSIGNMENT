import java.util.Scanner;
class Program36{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter one angle: ");
int a = sc.nextInt();
System.out.println("Enter second angle: ");
int b = sc.nextInt();
System.out.println("Enter third angle: ");
int c = sc.nextInt();
if(a+b+c==180){
    System.out.println("Its a valid Triangle");
}else{
    System.out.println("Its is NOT a Triangle");
}
     }
}