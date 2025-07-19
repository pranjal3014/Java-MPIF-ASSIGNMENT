import java.util.Scanner;
class Program27{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Character: ");
char c = sc.next().charAt(0);
switch(c){
    case 'a':
        System.out.println("vowel");
        break;
    case 'e':
        System.out.println("vowel");
        break;
    case 'i':
        System.out.println("vowel");
        break;
    case 'o':
        System.out.println("vowel");
        break;
    case 'u':
        System.out.println("vowel");
        break;
    default :
    System.out.println("NOT vowel");
}

     }
}