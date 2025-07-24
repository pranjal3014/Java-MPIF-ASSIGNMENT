
/*A person enter in a D-Mart mall for the shopping. He is first
time visiting the D-mart mall. 
He/She has to purchase 10 items.

System should ask for the name of the customer and Gender.

User will tell you the item name and quantity of each product
purchased one by one.

You have to calculate the total bill amount on the following 
Criteria basis
 
 on first product purchase if quantitiy greater then
 4 then you have to offer 5% discount on total price of that product
 
 on 5th product purchase you have to offer 10% discount on total
 price.
 
 on 10th product purchase you have to offer 15% discount on total
 price of that product. 

 let suppose the cost of 1st product is 10
 cost of 2nd product is 20
    .
    .
 cost of 10th product is 100;

 if Total Bill amount is greater then 10000 then you have
 to offer 15% of total bill amount
 if total Bill amount is between 5000 and 10000 then 
 you have to offer 10% of total bill amount
 
 Also 10% GST of total Bill Amount
 
 Then you have to ask for carry bag to customer
 if he/she yes then add 10 rupees in total bill amount.
 
 if the customer is female then you have to gift a Cadeberry
 If the customer is mael then you have to gift a Ladger Wallet
 
 Develop a Java Application to Generate the Bill in 
 Following Format
 
                         D-Mart
   Name : Cheeku Sing			Data: 12/9/2022
   -----------------------------------------------------------
   Item Name	Quantity    Price	Total   After-Discount		                      
     Item-1	   5	      10        50 Rs       47.5 Rs
     Item-2	   3	      20	60 RS       60.0 RS	
       .
       .
       .
       .
       .
       .
       .
     Item-10	  20        100         2000       300.0 Rs
   ----------------------------------------------------------
                                        A.P	    D.P	
                                        45000	    43500 
     Gift :- Cadeberry                  0.00	    0.00
                                        
     Carry Bag : yes                    10:00	    10:00
     GST (10%)	                        450         450
   ---------------------------------------------------------
                                        45460       43960 RS
                                        
                       Thank You
                        To Vist
                         D-Mart                 
                                          		  
   ----------------------------------------------------------  
           
*/
import java.util.Scanner;
class Dmart{
    public static void main(String [] args){

        System.out.println("Hello Welcome to Dmart");

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your Gender(M/F): ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter 1st Product: ");
        String product1 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity1 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price1 = sc.nextInt();
        double t1 = productQuantity1 * price1;
        double d1 = (productQuantity1 > 4) ? t1*0.95 : t1;
        
        System.out.println("Enter 2nd Product: ");
        String product2 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity2 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price2 = sc.nextInt();
        double t2 = productQuantity2 * price2;
        double d2 = t2;
        
        System.out.println("Enter 3rd Product: ");
        String product3 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity3= sc.nextInt();
        System.out.println("Enter Price: ");
        int price3 = sc.nextInt();
        double t3 = productQuantity3 * price3;
        double d3 = t3;
        
        System.out.println("Enter 4th Product: ");
        String product4 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity4 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price4 = sc.nextInt();
        double t4 = productQuantity4 * price4;
        double d4 = t4;
        
        System.out.println("Enter 5th Product: ");
        String product5 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity5 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price5 = sc.nextInt();
        double t5 = productQuantity5 * price5;
        double d5 = t5 * 0.90;

        System.out.println("Enter 6th Product: ");
        String product6 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity6 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price6 = sc.nextInt();
        double t6 = productQuantity6 * price6;
        double d6 = t6;
        
        System.out.println("Enter 7th Product: ");
        String product7 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity7= sc.nextInt();
        System.out.println("Enter Price: ");
        int price7 = sc.nextInt();
        double t7 = productQuantity7 * price7;
        double d7 = t7;
        
        System.out.println("Enter 8th Product: ");
        String product8 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity8 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price8 = sc.nextInt();
        double t8 = productQuantity8 * price8;
        double d8 = t8;
        
        System.out.println("Enter 9th Product: ");
        String product9 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity9 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price9 = sc.nextInt();
        double t9 = productQuantity9 * price9;
        double d9 = t9;
        
        System.out.println("Enter 10th Product: ");
        String product10 = sc.next();
        System.out.println("Enter Product Quantity: ");
        int productQuantity10 = sc.nextInt();
        System.out.println("Enter Price: ");
        int price10 = sc.nextInt();
        double t10 = productQuantity10 * price10;
        double d10 = t10 * 0.85;

        double total_bill = t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
        double total_discount = d1+d2+d3+d4+d5+d6+d7+d8+d9+d10;
        double total_bill_dis1 = 0;

        if(total_discount > 10000){
           total_bill_dis1 = (total_discount* 0.15f);
           }
        else if(total_discount >= 5000 && total_discount <= 10000){
             total_bill_dis1 = (total_discount*0.10f);
        }

             double final_total_discount = total_discount - total_bill_dis1;
        
        double final_gst = final_total_discount  * 0.10f;

         double carryBagAmount = 0;
        System.out.println("Can you Required Carry Bag(Y/N): ");
        char carry_bag = sc.next().charAt(0);
        if (carry_bag == 'Y' || carry_bag == 'y'){
            carryBagAmount= 10; 
        }
        else if (carry_bag == 'N' || carry_bag == 'n'){
            System.out.println("No Carry Bag");
        }
        else{
            System.out.println("Invalid Input");
        } 
        String gift=null;
        if(gender=='F' || gender == 'f'){
           gift = "Cadeberry";
        }
        else if(gender =='M' || gender == 'm'){
         gift = "Ladger_Wallet";
        }
        else{
            System.out.println("Invalid Input");}

        double final_Bill = final_total_discount +final_gst + carryBagAmount;

System.out.println("\n                          D-Mart");
System.out.println("---------------------------------------------------------------------------");
System.out.println("Name : " + name + "                            Date: 21/07/2025");
System.out.println("---------------------------------------------------------------------------");
System.out.println("Item Name       Qty\t\tPrice\t       Total\t   After-Discount");
System.out.println("---------------------------------------------------------------------------");

System.out.println(product1  + "\t\t" + productQuantity1 + "\t\t" + price1 + "\t\t" + t1 + "\t\t" +d1);
System.out.println(product2  + "\t\t" + productQuantity2 + "\t\t" + price2 + "\t\t" + t2 + "\t\t" +d2);
System.out.println(product3  + "\t\t" + productQuantity3 + "\t\t" + price3 + "\t\t" + t3 + "\t\t" +d3);
System.out.println(product4  + "\t\t" + productQuantity4 + "\t\t" + price4 + "\t\t" + t4 + "\t\t" +d4);
System.out.println(product5  + "\t\t" + productQuantity5 + "\t\t" + price5 + "\t\t" + t5 + "\t\t" +d5);
System.out.println(product6  + "\t\t" + productQuantity6 + "\t\t" + price6 + "\t\t" + t6 + "\t\t" +d6);
System.out.println(product7  + "\t\t" + productQuantity7 + "\t\t" + price7 + "\t\t" + t7 + "\t\t" +d7);
System.out.println(product8  + "\t\t" + productQuantity8 + "\t\t" + price8 + "\t\t" + t8 + "\t\t" +d8);
System.out.println(product9  + "\t\t" + productQuantity9+ "\t\t" +  price9 + "\t\t" + t9 + "\t\t" +d9);
System.out.println(product10 + "\t\t" +productQuantity10 +"\t\t"+ price10+ "\t\t"+ t10+ "\t\t" +d10);

System.out.println("---------------------------------------------------------------------------");
System.out.println("\t\t\t\t\t\tA.P\t\tD.P");
System.out.println("\t\t\t\t\t\t"+total_bill+"\t\t"+total_discount);
System.out.println("Gift:- " + gift+"\t\t\t\t0.00\t\t0.00");
System.out.println("Carry Bag Charges: "+((carryBagAmount != 0 )? "yes":"no")+"\t\t\t\t"+carryBagAmount+"\t\t"+carryBagAmount);
System.out.println("GST (10%): \t\t\t\t" + final_gst+"\t\t"+final_gst);
System.out.println("---------------------------------------------------------------------------");
System.out.println("Final Bill Amount: \t\t\t\t" + final_Bill+"\t\t"+ final_total_discount);
System.out.println("---------------------------------------------------------------------------");
System.out.println("               Thank You! Visit Again ");


    }
}