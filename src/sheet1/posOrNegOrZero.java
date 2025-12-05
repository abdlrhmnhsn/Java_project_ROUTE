package sheet1;

import java.util.Scanner;

public class posOrNegOrZero {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        getNumberToCheck();
        scanner.close();

    }
    static void getNumberToCheck(){
        System.out.println("Enter the number to check: ");
        int x = scanner.nextInt();
        if(x>0)
            System.out.println("the Number "+x+" is positive");
        else if (x<0) {
            System.out.println("the Number "+x+" is negative");
        }else
            System.out.println("the Number "+x+" is Zero");

    }
}

