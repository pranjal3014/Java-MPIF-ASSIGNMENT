import java.util.Scanner;
class Program3{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        
        float bonus = 5/100f;

        System.out.println("Enter the year of experience: ");
        int year = sc.nextInt();
        if(year>5){
         double Salary_with_bonus = salary * bonus;
         System.out.println("The salary of employee with bonus: "+Salary_with_bonus);
        }
       else{
        System.out.println("The salary of Employee: "+salary);
       }
    }
}