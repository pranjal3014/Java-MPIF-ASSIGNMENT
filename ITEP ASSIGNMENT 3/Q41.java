import java.util.Scanner;
class Program41{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
float total_number = 500;

System.out.println("Enter Physics Marks: ");
int phy = sc.nextInt();
System.out.println("Enter Chemistry Marks: ");
int che = sc.nextInt();
System.out.println("Enter Biology Marks: ");
int bio = sc.nextInt();
System.out.println("Enter Mathematics Marks: ");
int math = sc.nextInt();
System.out.println("Enter Computer Marks: ");
int com= sc.nextInt();

int total_marks = phy+che+bio+math+com;
float percentage = (total_marks / total_number)*100;

System.out.println("Percantage: "+percentage);

if(percentage>=90){
     System.out.println("Grade: A");
}
else if(percentage>=80){
     System.out.println("Grade: B");
}
else if(percentage>=70){
     System.out.println("Grade: C");
}
else if(percentage>=60){
     System.out.println("Grade: D");
}
else if(percentage>=40){
     System.out.println("Grade: E");
}
else if(percentage>=90){
     System.out.println("Grade: F");
}
     }
}