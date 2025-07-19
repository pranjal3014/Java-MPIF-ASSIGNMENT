import java.util.Scanner;
class Program11{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Age: ");
int age= sc.nextInt();
System.out.println("Enter Gender: ");
char Gender = sc.next().charAt(0);
System.out.println("Enter Marital Status: ");
char marrige = sc.next().charAt(0);

if(Gender == 'F'){
    System.out.println("she will work only in urban areas");
}
else if(Gender == 'M' && (age>20 && age<40)){
    System.out.println("he may work in anywhere");
}
else if(Gender == 'M' && (age>40 && age<60)){
    System.out.println("he will work in urban areas only");
}
else{
    System.out.println("ERROR");
}
     }
}