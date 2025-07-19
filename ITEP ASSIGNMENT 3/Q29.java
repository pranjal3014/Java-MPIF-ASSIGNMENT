import java.util.Scanner;
class Program29{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
int a = sc.nextInt();
System.out.println("Enter 2nd number: ");
int b = sc.nextInt();
System.out.println("Enter 3rd number: ");
int c = sc.nextInt();
System.out.println("Enter 4th number: ");
int d = sc.nextInt();
if(a<b && a<c && a<d){
    System.out.println("1st number is lowest");
}
else if(b<a && b<c && b<d){
System.out.println("2nd number is lowest");
}
else if(c<a && c<b && c<d){
System.out.println("3rd number is lowest");
}
else if(d<a && d<c && d<b){
System.out.println("4th number is lowest");
}
     }
}