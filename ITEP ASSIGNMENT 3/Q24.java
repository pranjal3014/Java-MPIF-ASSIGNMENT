import java.util.Scanner;
class Program24{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value");
       int n =  sc.nextInt();
       
       if(n > 0)
         System.out.println("+ve");
       else{
         if(n < 0)
           System.out.println("-ve");
         else
           System.out.println("Neither +ve nor -ve");
       }  
    }
}