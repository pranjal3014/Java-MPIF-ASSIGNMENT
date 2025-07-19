import java.util.Scanner;
class Program35{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The character is an Alphabet.");
        } else {
            System.out.println("The character is NOT an Alphabet.");
        }
     }
}