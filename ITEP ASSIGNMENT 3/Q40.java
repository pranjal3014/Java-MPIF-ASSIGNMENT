import java.util.Scanner;
class Program40{
     public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Cost Price: ");
int cost = sc.nextInt();
System.out.println("Enter Selling Price: ");
int sell = sc.nextInt();

int profit = sell - cost;
int lose = cost - sell;

if(profit>0){
    System.out.println("Profit: "+profit);
}
else {
    System.out.println("Lose: "+lose);
}
     }
}