import java.util.Scanner;
class Program15{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the cost of Bike: ");
int bike=sc.nextInt();
double tax;
if(bike>100000){
    tax = bike * (15/100f);
}
else if(bike>50000 && bike<100000){
    tax =  bike * (10/100f);
}
else if(bike<=50000){
    tax = bike*(5/100f);
}
else{
    tax = 0;
}
System.out.println("Total Tax paid: "+tax);
     }
}