package sheet1;

import java.util.Scanner;
// Even or Odd (User Input)&&(code Only)
public class oddOrEven {
    static Scanner scanner = new Scanner(System.in);
    static int x;

    public static void main(String[] args) {
        //Even or Odd (Code Only)
        getEvenOrODD();
        //Even or Odd (User Input)
        getSumTwoNumbersInput(x);
        scanner.close();

    }

    //Even or Odd (Code Only)
    static void getEvenOrODD() {
        int x = 15;
        if (x % 2 == 0) {
            System.out.println("The number "+x+" is even");

        } else {
            System.out.println("The number "+x+" is odd");
        }
    }

    //Even or Odd (User Input)
    static void getSumTwoNumbersInput(int x) {
        System.out.println("Enter the Number to check: ");
        x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("The number "+x+"  is even");

        } else {
            System.out.println("The number "+x+" is odd");
        }
    }
}