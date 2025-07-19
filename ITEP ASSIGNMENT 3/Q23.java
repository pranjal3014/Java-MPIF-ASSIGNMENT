import java.util.Scanner;
class Program23{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value");
       int n =  sc.nextInt();
       
       if(n%2 == 0)
         System.out.println("EVEN");
       else
         System.out.println("ODD");  
    }
}
