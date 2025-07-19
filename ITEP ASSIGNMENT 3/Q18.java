import java.util.Scanner;
class Program18{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter total Marks: ");
float total_mark = sc.nextFloat();
System.out.println("Enter obtained Marks: ");
float obtained_mark = sc.nextFloat();
double percentage= (obtained_mark / total_mark) *100;
System.out.println("Percentage : "+percentage);
     }
}