package sheet1;

import java.util.Scanner;

public class sumOfTwoNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int x,y;
    public static void main(String[] args) {
        //Sum of Two Numbers (Code Only)
        int result =getSumTwoNumbers();
        System.out.println("result = "+result);
        //Sum of Two Numbers (User Input)
        int result2 =getSumTwoNumbersInput(x,y);
        System.out.println("result2= "+result2);
        scanner.close();

    }
    //Sum of Two Numbers (Code Only)
    static int getSumTwoNumbers(){
        int a =10, b=20;
        int result = a+b;
        return result;
    }
    //Sum of Two Numbers (User Input)
    static int getSumTwoNumbersInput( int x, int y){
        System.out.println("Enter the first Number 'x': ");
         x = scanner.nextInt();
        System.out.println("Enter the second Number 'y': ");
         y = scanner.nextInt();
        int result2 = x+y;
        return  result2;
    }

}
