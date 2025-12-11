package day3;

import java.util.Scanner;

public class Cashier {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        double total=0;
        System.out.println("Enter number of items");
        int numberOfItem = scanner.nextInt();
        for(int i=1;i<=numberOfItem;i++) {
            System.out.println("Enter the cost of item "+i);
            double price= scanner.nextDouble();
            total+=price;
       }
        System.out.println("Total price is "+total);
        scanner.close();
    }
}
