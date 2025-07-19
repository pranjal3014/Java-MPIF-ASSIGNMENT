import java.util.Scanner;
class Program7{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        float classes_held = sc.nextInt();

        System.out.println("Enter the number of classes Attended: ");
        float attendance = sc.nextInt();

        float Percentage = (attendance / classes_held)*100;
        System.out.println("Percantage of classes attended: "+Percentage+"%");

        double req_percentage = 75/100;

        if( Percentage > req_percentage){
            System.out.println("student is allowed to sit in exam");
        }
        else{
             System.out.println("student is not allowed to sit in exam");
        }
     }
}