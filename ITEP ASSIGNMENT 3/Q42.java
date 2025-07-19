import java.util.Scanner;
class Program42{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter Basic Salary: ");
int salary = sc.nextInt();
float gross;

if(salary<=10000){
float HRA = 25/100f;
float DA = 80/100f;
gross = salary+HRA+DA;
    System.out.println("Gross salary of Employee: "+gross);
}
else if(salary<=20000){
float HRA = 25/100f;
float DA = 90/100f;
gross = salary+HRA+DA;
    System.out.println("Gross salary of Employee: "+gross);
}
else if(salary>20000){
float HRA = 30/100f;
float DA = 95/100f;
gross = salary+HRA+DA;
    System.out.println("Gross salary of Employee: "+gross);
}
     }
}