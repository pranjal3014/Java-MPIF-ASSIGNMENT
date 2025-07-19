import java.util.Scanner;
class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total amount: ");
        int amount = sc.nextInt();

        int count2000 = 0, count500 = 0, count200 = 0, count100 = 0;
        int count50 = 0, count20 = 0, count10 = 0, count5 = 0, count2 = 0, count1 = 0;

        if (amount >= 2000) {
            count2000 = amount / 2000;
            amount = amount % 2000;
        }
        if (amount >= 500) {
            count500 = amount / 500;
            amount = amount % 500;
        }
        if (amount >= 200) {
            count200 = amount / 200;
            amount = amount % 200;
        }
        if (amount >= 100) {
            count100 = amount / 100;
            amount = amount % 100;
        }
        if (amount >= 50) {
            count50 = amount / 50;
            amount = amount % 50;
        }
        if (amount >= 20) {
            count20 = amount / 20;
            amount = amount % 20;
        }
        if (amount >= 10) {
            count10 = amount / 10;
            amount = amount % 10;
        }
        if (amount >= 5) {
            count5 = amount / 5;
            amount = amount % 5;
        }
        if (amount >= 2) {
            count2 = amount / 2;
            amount = amount % 2;
        }
        if (amount >= 1) {
            count1 = amount;
        }

        System.out.println("Note Count:");
        if (count2000 > 0) System.out.println("2000: " + count2000);
        if (count500 > 0) System.out.println("500: " + count500);
        if (count200 > 0) System.out.println("200: " + count200);
        if (count100 > 0) System.out.println("100: " + count100);
        if (count50 > 0) System.out.println("50: " + count50);
        if (count20 > 0) System.out.println("20: " + count20);
        if (count10 > 0) System.out.println("10: " + count10);
        if (count5 > 0) System.out.println("5: " + count5);
        if (count2 > 0) System.out.println("2: " + count2);
        if (count1 > 0) System.out.println("1: " + count1);
    }
}
