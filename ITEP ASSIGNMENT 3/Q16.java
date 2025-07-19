import java.util.Scanner;
class Program16{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius: ");
int radius = sc.nextInt();
double pi =3.14f;
double area = pi *radius * radius;
System.out.println("Area of Circle: "+area+" cm\u00B2");
     }
}