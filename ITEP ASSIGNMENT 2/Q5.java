import java.util.Scanner;
class Program5{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Total cost of fence of rectangular park: ");
    int total_cost = sc.nextInt();
    System.out.println("Rate of per meter square : ");
    int per_meter_cost = sc.nextInt();
    System.out.println("Length of Rectangular Plot : ");
    int length = sc.nextInt();

    int perimeter= total_cost / per_meter_cost;
    int breadth = (perimeter/2)-length;

    int area = length*breadth;

    System.out.println("Breadth of Rectangular Park: "+breadth+"m");
    System.out.println("Perimeter of Rectangluar Park: "+perimeter+"m");
    System.out.println("Area of Rectangular park : "+area+"m\u00B2");


}

}