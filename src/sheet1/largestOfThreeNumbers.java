package sheet1;

import java.util.Scanner;

public class largestOfThreeNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int x,y,z;
    public static void main(String[] args) {
        getLargestOfTwoNumbers(x,y,z);
        scanner.close();
    }

    //Sum of Two Numbers (User Input)
    static void getLargestOfTwoNumbers( int x, int y,int z){
        System.out.println("Enter the first Number 'x': ");
        x = scanner.nextInt();
        System.out.println("Enter the second Number 'y': ");
        y = scanner.nextInt();
        System.out.println("Enter the third Number 'z': ");
        z = scanner.nextInt();
        if(x>y && x>z)
            System.out.println("the first number "+x+" is the largest");
        else if (y>x && y>z)
            System.out.println("the second number "+y+" is the largest");
        else
        System.out.println("the third number "+z+" is the largest");
    }
}
