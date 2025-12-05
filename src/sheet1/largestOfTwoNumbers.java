package sheet1;

import java.util.Scanner;

public class largestOfTwoNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int x,y;
    public static void main(String[] args) {
        getLargestOfTwoNumbers(x,y);
        scanner.close();
    }

    //Sum of Two Numbers (User Input)
    static void getLargestOfTwoNumbers( int x, int y){
        System.out.println("Enter the first Number 'x': ");
        x = scanner.nextInt();
        System.out.println("Enter the second Number 'y': ");
        y = scanner.nextInt();
        if(x>y)
            System.out.println("the first number "+x+" is the largest");
            else
            System.out.println("the second number "+y+" is the largest");
}
}
