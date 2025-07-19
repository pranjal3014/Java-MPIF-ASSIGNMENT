import java.util.Scanner;
class Program9{
     public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter Charater: ");
     char value = sc.next().charAt(0);

     int num =(int)(value);

     if(num>=65 && num<=90){
        System.out.println("It is upper case Character");
     }
     else if (num>=97 && num<=122){
         System.out.println("It is a lower case Character");
     }
     else{
      System.out.println("Invalid Input");
     }
     }
}
