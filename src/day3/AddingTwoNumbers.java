package day3;

import java.util.Scanner;

public class AddingTwoNumbers  {
    static Scanner scanner= new Scanner(System.in);
    static boolean again;
    public static void main(String[] args) {
        do{
            System.out.println("Enter first number ");
            double num1= scanner.nextDouble();
            System.out.println("Enter second number ");
            double num2= scanner.nextDouble();
            double sum= num1+num2;
            System.out.println("The sum is "+sum);
            System.out.println("Do you want to repeat again?");
            again = scanner.nextBoolean();
        }while(again);
        scanner.close();
    }
}
