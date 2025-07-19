import java.util.Scanner;
class Program5{
     public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the 1st Person age: ");
         int a = sc.nextInt();

        System.out.println("Enter the 1st Person age: ");
         int b = sc.nextInt();

        System.out.println("Enter the 1st Person age: ");
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println("1st person is older than 2nd and 3rd");
            
        }
        else if (b>a && b>c){
            System.out.println("2st person is older than 1nd and 3rd");
             
        }
        else if (c>a && c>b){
            System.out.println("3st person is older than 1nd and 2nd");
            
        }
         if(a<b && a<c){
                System.out.println("1st person is youngest than 2nd and 3rd person");
            }
        if(b<a && b<c){
                System.out.println("2st person is youngest than 1nd and 3rd person");
            }
         if(c<a && c<b){
                System.out.println("3st person is youngest than 1nd and 2nd person");
            }

     }
}