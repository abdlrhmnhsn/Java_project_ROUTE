package sheet1;

import java.util.Scanner;

public class swapTwoNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int x,y;
    public static void main(String[] args) {
       getNumberToSwap(x,y);
       scanner.close();

    }

    static void getNumberToSwap( int x, int y){
        System.out.println("Enter the first Number 'x': ");
        x = scanner.nextInt();
        System.out.println("Enter the second Number 'y': ");
        y = scanner.nextInt();
        int temp = y;
        y=x;
        x=temp;
        System.out.println("the first Number 'x': "+x);
        System.out.println("the second Number 'y': "+y);

    }
}
