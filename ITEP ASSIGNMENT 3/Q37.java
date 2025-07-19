import java.util.Scanner;
class Program37{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
float num = sc.nextFloat();
if((num%5==0) && (num%11==0)){
    System.out.println("Divisible by 5 and 11");
}
else{
    System.out.println("This is not Divisible by 5 and 11");
}
     }
}