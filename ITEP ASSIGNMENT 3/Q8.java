import java.util.Scanner;
class Program8{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        float classes_held = sc.nextInt();

        System.out.println("Enter the number of classes Attended: ");
        float attendance = sc.nextInt();

        System.out.println("You have Medical cause: ");
        char medical = sc.next().charAt(0);;

        float Percentage = (attendance / classes_held)*100;
        System.out.println("Percantage of classes attended: "+Percentage+"%");

        double req_percentage = 75/100;

        if( Percentage > req_percentage){
        
        if(medical == 'Y'){
        System.out.println("student is not allowed to sit in exam because of medical issue");
       }
     }
     else if(medical == 'N'){
        System.out.println("student is allowed to sit in exam because of medical issue");
     }
     
     }
}
